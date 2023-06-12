SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python39-python-openid-teams-1.1-1.18.noarch.rpm"
RPM_HASH = "2148d6c6d27fc25dfbb7883354699d663edd71a553e1b4f5b478c1e4f4ce54892c0ac84f82f6c6f5ae44872cbdae363b962cc4accb39a0b2246b1bf84e1fd05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-openid-teams) \
python39-python-openid-teams \
python3dist(python-openid-teams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
