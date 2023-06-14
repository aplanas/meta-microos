SUMMARY = "Utilities jointly used by devpi-server and devpi-client"
DESCRIPTION = "Utilities jointly used by devpi-server and devpi-client."
LICENSE = "MIT"

PV = "3.7.2"

RPM_NAME = "python311-devpi-common-3.7.2-2.2.noarch.rpm"
RPM_HASH = "affb813d89f5ab0343f3a8c052db3997344b064b167f848d7dfa4cc5a4d63c9dc3d0b93f77d5c3f10ffc6a72506c8456964730eec04abd87dc1f49765083bb88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-devpi-common \
python311-devpi-common \
python3dist-devpi-common"

RDEPENDS:${PN} += "python-abi \
python311-packaging \
python311-py \
python311-requests"

inherit rpm
