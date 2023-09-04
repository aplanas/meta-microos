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

RPM_NAME = "perl-Devel-LexAlias-0.05-5.39.aarch64.rpm"
RPM_HASH = "0044857edec7ec41292e39fd95282903ef707cb96ad661985e085a354690a8068ff9186852517ab2103943e082070e32e682a9696383c0cec5eab48012506986"

RPROVIDES:${PN} += "perl-Devel--LexAlias \
perl-Devel-LexAlias"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Devel--Caller"

inherit rpm
