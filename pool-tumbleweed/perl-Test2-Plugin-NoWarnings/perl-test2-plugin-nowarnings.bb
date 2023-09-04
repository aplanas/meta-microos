SUMMARY = "Fail if tests warn"
DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via 'diag'. \
 \
This module uses '$SIG{__WARN__}', so if the code you're testing sets this, \
then this module will stop working."
LICENSE = "Artistic-2.0"

PV = "0.09"

RPM_NAME = "perl-Test2-Plugin-NoWarnings-0.09-1.15.noarch.rpm"
RPM_HASH = "9157d96c3de5a9c9d1e3f422d5d6491581472d6ea9a3e97f8f30c22c8256775813642a534d140072ed0437b0424286bffb03abb02449b90b69bb4d185083f59f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test2--Event--Warning \
perl-Test2--Plugin--NoWarnings \
perl-Test2-Plugin-NoWarnings"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test2 \
perl-Test2--API \
perl-Test2--Event \
perl-Test2--Util--HashBase \
perl-parent"

inherit rpm
