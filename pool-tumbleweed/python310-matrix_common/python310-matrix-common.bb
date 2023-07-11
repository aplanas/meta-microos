SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-matrix_common-1.3.0-1.5.noarch.rpm"
RPM_HASH = "d0f85955f1fcfee72bf57ddd1f7ec9983095b1ad057de8a042b55cc2fd1cdcf34fe024ec0a33f6b1039bfc10fa6904e605664c1f939a768f374fa3a6e811f8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-matrix-common \
python310-matrix-common \
python3dist-matrix-common"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
