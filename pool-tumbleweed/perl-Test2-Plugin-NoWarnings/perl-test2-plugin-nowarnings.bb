SUMMARY = "Fail if tests warn"
DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via 'diag'. \
 \
This module uses '$SIG{__WARN__}', so if the code you're testing sets this, \
then this module will stop working."
LICENSE = "Artistic-2.0"

PV = "0.09"

RPM_NAME = "perl-Test2-Plugin-NoWarnings-0.09-1.14.noarch.rpm"
RPM_HASH = "ee8de9af2dd15610c98a4cf89ca53e343c91f847e1bd54d0638e18f99c6527ac076f3cd17bcc2dd8d7b3c2f67eb84f5a732d6dbb472ca7afbcc8517310efd240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--Event--Warning \
perl-Test2--Plugin--NoWarnings \
perl-Test2-Plugin-NoWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test2 \
perl-Test2--API \
perl-Test2--Event \
perl-Test2--Util--HashBase \
perl-parent"

inherit rpm
