SUMMARY = "Common utilities for Synapse, Sydent and Sygnal"
DESCRIPTION = "Common utilities for Synapse, Sydent and Sygnal."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-matrix_common-1.3.0-1.5.noarch.rpm"
RPM_HASH = "8a97a026ec3bc9f3f5dfeac8fb6f4c2eb84a3db77073ee97d54c2921b44ce1e0781b48003eb3bdcc719b87873dd1fabfd23e7e85e5c6bec08912e62281b4350c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-common \
python3.11dist-matrix-common \
python311-matrix-common \
python3dist-matrix-common"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
