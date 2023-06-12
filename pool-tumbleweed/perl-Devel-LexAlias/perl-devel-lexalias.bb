SUMMARY = "alias lexical variables"
DESCRIPTION = "Devel::LexAlias provides the ability to alias a lexical variable in a \
subroutines scope to one of your choosing. \
 \
If you don't know why you'd want to do this, I'd suggest that you skip this \
module. If you think you have a use for it, I'd insist on it. \
 \
Still here? \
 \
* lexalias( $where, $name, $variable ) \
 \
  '$where' refers to the subroutine in which to alias the lexical, it can \
  be a coderef or a call level such that you'd give to 'caller' \
 \
  '$name' is the name of the lexical within that subroutine \
 \
  '$variable' is a reference to the variable to install at that location"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Devel-LexAlias-0.05-5.37.aarch64.rpm"
RPM_HASH = "b17c7ad6f8f5a0f42920e7c8b875c7e04cabe4d8660d1572a8fd704d652bd1b687957785407c9919b85a1aabb0279e8dae309b92d1d615b70da825d6b01c7708"

RPROVIDES:${PN} += "perl(Devel::LexAlias) \
perl-Devel-LexAlias \
perl-Devel-LexAlias(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::Caller)"

inherit rpm
