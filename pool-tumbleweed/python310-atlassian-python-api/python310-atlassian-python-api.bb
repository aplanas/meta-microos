SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python310-atlassian-python-api-2.0.1-1.13.noarch.rpm"
RPM_HASH = "1a08c71454946a7aadbd6e1b51ba046a64b8a9b551941a1343e59a81e731c692c234d8d84ef22c189a0b8cfd0294aeac929e96f2c918949881c6586307f377b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-atlassian-python-api \
python310-atlassian-python-api \
python3dist-atlassian-python-api"

RDEPENDS:${PN} += "python-abi \
python310-kerberos \
python310-oauthlib \
python310-requests \
python310-requests-oauthlib \
python310-six"

inherit rpm
