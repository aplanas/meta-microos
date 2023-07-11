SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python39-atlassian-python-api-2.0.1-1.13.noarch.rpm"
RPM_HASH = "e6b869f0227ac1760f6b19aa86bd3102fb95a3b634ce569f276e4a8ca887e5f3df4218091a8c76b9bf74210201f5ef830025acdfec30bb48bf85b902660f8c1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-atlassian-python-api \
python39-atlassian-python-api \
python3dist-atlassian-python-api"

RDEPENDS:${PN} += "python-abi \
python39-kerberos \
python39-oauthlib \
python39-requests \
python39-requests-oauthlib \
python39-six"

inherit rpm
