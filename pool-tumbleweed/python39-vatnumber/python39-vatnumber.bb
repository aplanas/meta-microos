SUMMARY = "Python module to validate VAT numbers"
DESCRIPTION = "Python module to validate VAT numbers."
LICENSE = "GPL-3.0-only"

PV = "1.2"

RPM_NAME = "python39-vatnumber-1.2-4.5.noarch.rpm"
RPM_HASH = "b90f74beb860c078cf9abcb74011f20aa6dad665e93b37b5fc2e77a51af50520caed2a0afc77038b33bbd78ddaa40eaa2646e414b08fcf46ff471be2ebaf0d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-vatnumber"

RDEPENDS:${PN} += "python39-python-stdnum \
python39-six"

inherit rpm
