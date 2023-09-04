SUMMARY = "shift and scale time"
DESCRIPTION = "shift and scale time"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0.2"

RPM_NAME = "perl-Time-Mock-0.0.2-1.27.noarch.rpm"
RPM_HASH = "9bb94d3cecf9768f1332a8e886b9d7f25c246a863ead7106408eb36a18704ef18dee6d27c293f6476e6fe6959ba3667bbf0e1ad17852a72ef89d1593b587eb1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Time--Mock \
perl-Time--Mock--Original \
perl-Time-Mock"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
