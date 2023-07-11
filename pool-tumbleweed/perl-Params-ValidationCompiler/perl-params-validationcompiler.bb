SUMMARY = "Build an optimized subroutine parameter validator once, use it forever"
DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values. \
 \
In addition to type checks, it also supports parameter defaults, optional \
parameters, and extra 'slurpy' parameters."
LICENSE = "Artistic-2.0"

PV = "0.31"

RPM_NAME = "perl-Params-ValidationCompiler-0.31-1.2.noarch.rpm"
RPM_HASH = "45f9ef5782cfb95cd35766a25b2724d892a1d9e55ff358f4c9a812abc4401bf1b935ebb9483d99f237b74a06d23f7f8ab55c135d95147f2b0b686db845d01e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--ValidationCompiler \
perl-Params--ValidationCompiler--Compiler \
perl-Params--ValidationCompiler--Exceptions \
perl-Params-ValidationCompiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Eval--Closure \
perl-Exception--Class \
perl-List--Util"

inherit rpm
