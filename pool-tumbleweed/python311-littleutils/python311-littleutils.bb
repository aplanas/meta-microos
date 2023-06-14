SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python311-littleutils-0.2.2-2.1.noarch.rpm"
RPM_HASH = "2830177b59b29694339eb89226f460130b6a643e5517b302ac1a013f6e796a0d9d10a7a8d7b8c3893ab7c83178df08a1164475a611f74caafd6da8e4c21f40a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-littleutils \
python311-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
