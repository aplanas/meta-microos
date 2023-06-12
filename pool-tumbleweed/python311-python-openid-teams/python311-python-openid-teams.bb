SUMMARY = "Teams extension for python-openid"
DESCRIPTION = "Teams extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "python311-python-openid-teams-1.1-1.18.noarch.rpm"
RPM_HASH = "439746005dd1a441d78f1449d1466b5038fcbc23c59832666169c17f4593cfc6c5006d9bf7c9a7643234b73492864876add3223adbba33377ab185d1ae3e71a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-openid-teams) \
python311-python-openid-teams \
python3dist(python-openid-teams)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
