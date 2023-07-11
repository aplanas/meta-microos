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

RPM_NAME = "perl-Devel-LexAlias-0.05-5.38.aarch64.rpm"
RPM_HASH = "b81bdd5fa199470a6efd0933220454c9eff60788515320fdaf12d6f3b7039349eca16b11841c899da48ea7c8840349d70739d73cb6b6a1102c12d6d215256474"

RPROVIDES:${PN} += "perl-Devel--LexAlias \
perl-Devel-LexAlias"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Caller"

inherit rpm
