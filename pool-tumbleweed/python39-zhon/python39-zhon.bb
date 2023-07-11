SUMMARY = "Constants used in Chinese text processing"
DESCRIPTION = "Zhon provides constants used in Chinese text processing."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python39-zhon-1.1.5-4.3.noarch.rpm"
RPM_HASH = "a61d40764aaca27e70cc55a33262503bdf1b3c73b9a5458c8c92127a193c170a96028570792c0cfadb9be9817e0ef4ce4ebc6ffc6238188f9263356ecd94b673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zhon \
python39-zhon \
python3dist-zhon"

RDEPENDS:${PN} += "python-abi"

inherit rpm
