SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-python-openid-teams-1.1-1.19.noarch.rpm"
RPM_HASH = "8006df8369e396c12dff2db8260aed4ccf8f3afc8aa0d307ab309d690a1ce01f62c56515699bc3fc153ee2c40acaaf789b9b2887760f600668ef44842da787e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-teams \
python3.11dist-python-openid-teams \
python311-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
