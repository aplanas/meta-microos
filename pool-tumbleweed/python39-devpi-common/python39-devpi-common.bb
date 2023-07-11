SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python39-devpi-common-3.7.2-3.3.noarch.rpm"
RPM_HASH = "fada490fcab7330416ed8ab731e3890c8af7645e97bade490d4749909c4d8f2020c40fde57df0c53de5b9a2080fe2df99c53b2eec7a0ebc70a51b926db2ad0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-devpi-common \
python39-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-py \
python39-requests"

inherit rpm
