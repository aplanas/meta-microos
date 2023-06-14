SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python310-matrix_common-1.3.0-1.3.noarch.rpm"
RPM_HASH = "d387f152209fdfef41a9e5676b26e44088bb3167b721509231dee73911be57f570f60af24b9801050c4f9f99e75fe2b7f198fc7a311a5e0808aac5408924dc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-common \
python3.10dist-matrix-common \
python310-matrix-common \
python3dist-matrix-common"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
