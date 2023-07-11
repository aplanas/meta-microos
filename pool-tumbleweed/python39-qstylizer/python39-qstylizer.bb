SUMMARY = "Stylesheet Generator for PyQt{4-5}/PySide{1-2}"
DESCRIPTION = "A python package designed to help with the construction of PyQt/PySide stylesheets."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-qstylizer-0.2.2-1.5.noarch.rpm"
RPM_HASH = "fb2a2f744d990d54b56421c097bfe56ecfc4773b81da77b7ea7a0b01cc846e7eb4c89cac214935e6df08f97c354e44bc6b597ccf967cd7d1cd3b86d32d8684a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qstylizer \
python39-qstylizer \
python3dist-qstylizer"

RDEPENDS:${PN} += "python-abi \
python39-inflection \
python39-tinycss2"

inherit rpm
