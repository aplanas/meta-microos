SUMMARY = "Progress bars for Python"
DESCRIPTION = "Progress bars for Python."
LICENSE = "ISC"

PV = "1.6"

RPM_NAME = "python311-progress-1.6-1.9.noarch.rpm"
RPM_HASH = "830c84d80e5c4961d7a739437efd532960b0e4aa9c6c4d7d33a62969884446d9a2794d2f53958de6b60cbf7e78c2eec77bbd748236c138a9146dc13c5393a2c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progress \
python3.11dist-progress \
python311-progress \
python3dist-progress"

RDEPENDS:${PN} += "python-abi"

inherit rpm
