SUMMARY = "Date Object, with As Little Code As Possible"
DESCRIPTION = "*DateTime::Tiny* is a most prominent member of the DateTime::Tiny suite of \
time modules. \
 \
It implements an extremely lightweight object that represents a datetime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.07"

RPM_NAME = "perl-DateTime-Tiny-1.07-1.19.noarch.rpm"
RPM_HASH = "834387458e40f585f1ee5824256872bd265ee174f1c563256b6829f74c2910be90e546ea71a2e86fe4e2c8d6025ab3b2086c10b64f25635a4098348d020efb85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Tiny \
perl-DateTime-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
