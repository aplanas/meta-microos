SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-python-openid-teams-1.1-1.19.noarch.rpm"
RPM_HASH = "8282e53182aa8d2ab64bad682646afe11f78c07a0b66fd65ce701d9ba9f333c62ba6baa32d2cd228f8c4818531874af5e6f80f1e6b0bd3b2b233283969495a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-openid-teams \
python39-python-openid-teams \
python3dist-python-openid-teams"

RDEPENDS:${PN} += "python-abi"

inherit rpm
