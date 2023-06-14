SUMMARY = "Information about the currently running perl"
DESCRIPTION = "This module provides methods for obtaining information about the currently \
running perl interpreter. It originally began life as code in the \
'Module::Build' project, but has been externalized here for general use."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Probe-Perl-0.03-3.26.noarch.rpm"
RPM_HASH = "e8308d4ba8a575a2bc2f456bb21df09cc8191582744fa3717d346a438c43134bba8c1a44656fde1bf8b770c7b6457b4d00a13b008180d51941f7a89c6cb07c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Probe--Perl \
perl-Probe-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
