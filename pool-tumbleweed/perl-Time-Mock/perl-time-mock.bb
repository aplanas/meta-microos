SUMMARY = "shift and scale time"
DESCRIPTION = "shift and scale time"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0.2"

RPM_NAME = "perl-Time-Mock-0.0.2-1.26.noarch.rpm"
RPM_HASH = "a69791abb04588e840942dcfc16fbac710f5b91571af7127e1e043736a27515b232748ccf094cf1b89031e43682aff8318c1c63dd762027de2299dea956b44e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Mock \
perl-Time--Mock--Original \
perl-Time-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
