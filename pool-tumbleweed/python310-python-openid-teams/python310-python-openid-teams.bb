SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-python-openid-teams-1.1-1.18.noarch.rpm"
RPM_HASH = "4f441658faa9baf7282f542a9dc1de9997d5d6294ccdf259a330a76e8e65199e52fac168d85e2c6fdf0db154dd9dd4dd3fe52c87072a790f67f735fb55eb308b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-teams \
python3.10dist-python-openid-teams \
python310-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
