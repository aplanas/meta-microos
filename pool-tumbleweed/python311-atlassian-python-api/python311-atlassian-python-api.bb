SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python311-atlassian-python-api-2.0.1-1.13.noarch.rpm"
RPM_HASH = "00ff7e244adea8e7482314965f88c61f1bc2ea5017984dd90b0608fe33c0c11dc46e90ba00ae797375b02ccc17a367acd06dafaaa94ef950cf90a10e544d312a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atlassian-python-api \
python3.11dist-atlassian-python-api \
python311-atlassian-python-api \
python3dist-atlassian-python-api"

RDEPENDS:${PN} += "python-abi \
python311-kerberos \
python311-oauthlib \
python311-requests \
python311-requests-oauthlib \
python311-six"

inherit rpm
