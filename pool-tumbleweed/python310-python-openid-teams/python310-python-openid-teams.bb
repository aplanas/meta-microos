SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python310-python-openid-teams-1.1-1.19.noarch.rpm"
RPM_HASH = "37acdec62160e81ea367f77a2733bd2aa4a568365a023bae2d55791fdefb7001488cefd0d1b7b3d7a5cfccfcc464341fd9c365db0f2eb8f2c825bef8cbf1d2ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-openid-teams \
python310-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
