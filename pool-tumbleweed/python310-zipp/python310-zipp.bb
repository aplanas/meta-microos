SUMMARY = "Pathlib-compatible object wrapper for zip files"
DESCRIPTION = "A pathlib-compatible Zipfile object wrapper."
LICENSE = "MIT"

PV = "3.15.0"

RPM_NAME = "python310-zipp-3.15.0-2.3.noarch.rpm"
RPM_HASH = "5397afbcb88c4488183a5e63e17ce6e29c436bb85a4a3c15c8e198e9628668b7aa8e177d468c8496e04b95405d2f0850d7764d8f34ad3ec73309959dd06299db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zipp \
python310-zipp \
python3dist-zipp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
