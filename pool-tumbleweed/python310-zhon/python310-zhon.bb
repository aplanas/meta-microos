SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python310-zhon-1.1.5-4.1.noarch.rpm"
RPM_HASH = "5bf68c156d0c5175e0920cfe5ae443be5152937cc05e342a3d3aa0d91c060362b66e1c143742a204cb96840968f9d6b5dc4cd7ce1341fe312183a7d8b2dc4ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zhon \
python3.10dist-zhon \
python310-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
