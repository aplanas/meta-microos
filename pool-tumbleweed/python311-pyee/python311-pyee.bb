SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "9.0.4"

RPM_NAME = "python311-pyee-9.0.4-1.5.noarch.rpm"
RPM_HASH = "e66ee5a82d9eb021c799ab3f393c27157076060ac0150ab2083e2548e0db91593ac95d50dbeb8957f5e03ba05ad022326ed6a69265544f2138b1bf7d2c64f8aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyee \
python3.11dist-pyee \
python311-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi"

inherit rpm
