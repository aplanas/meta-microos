SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python311-iso3166-2.1.1-1.3.noarch.rpm"
RPM_HASH = "08728a26c8c2c108d198ea94157bbcd92c53d1bdd7186ace0e708e3c79b28836cedd1a6982e70a372fc6955b8ec6d4c9cbf0e964b3567c3c247f22133edc5540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-iso3166 \
python311-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
