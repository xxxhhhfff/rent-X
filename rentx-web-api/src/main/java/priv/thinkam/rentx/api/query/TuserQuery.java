package priv.thinkam.rentx.api.query;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
public class TuserQuery implements Serializable {
	public String nameLike;
}
