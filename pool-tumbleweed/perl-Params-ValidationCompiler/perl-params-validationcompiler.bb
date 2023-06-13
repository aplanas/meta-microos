SUMMARY = "Build an optimized subroutine parameter validator once, use it forever"
DESCRIPTION = "This module creates a customized, highly efficient parameter checking \
subroutine. It can handle named or positional parameters, and can return \
the parameters as key/value pairs or a list of values. \
 \
In addition to type checks, it also supports parameter defaults, optional \
parameters, and extra 'slurpy' parameters."
LICENSE = "Artistic-2.0"

PV = "0.31"

RPM_NAME = "perl-Params-ValidationCompiler-0.31-1.1.noarch.rpm"
RPM_HASH = "d10af19543d46bb456c8a9672cd77dca1ed30cd71fa85562aea88673fd9854f328aa1f7f794672693ecc735906f32cfd6da8dcd349dc80b53543da0a01b07c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Params::ValidationCompiler) \
perl(Params::ValidationCompiler::Compiler) \
perl(Params::ValidationCompiler::Exceptions) \
perl-Params-ValidationCompiler"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Eval::Closure) \
perl(Exception::Class) \
perl(List::Util)"

inherit rpm
