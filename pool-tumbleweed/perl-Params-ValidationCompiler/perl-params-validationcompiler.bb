SUMMARY = "Build an optimized subroutine parameter validator once, use it forever"
DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values. \
 \
In addition to type checks, it also supports parameter defaults, optional \
parameters, and extra 'slurpy' parameters."
LICENSE = "Artistic-2.0"

PV = "0.31"

RPM_NAME = "perl-Params-ValidationCompiler-0.31-1.3.noarch.rpm"
RPM_HASH = "50b3f2aa27fbc3b31800e150ce8fecc98dbce02bf67a44aa6e19dd87a5a95b92c70a882ae5dbdcebd7f98332acd4d62f3aa9194b0879ee40023f3b2945f5fb3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--ValidationCompiler \
perl-Params--ValidationCompiler--Compiler \
perl-Params--ValidationCompiler--Exceptions \
perl-Params-ValidationCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Eval--Closure \
perl-Exception--Class \
perl-List--Util"

inherit rpm
