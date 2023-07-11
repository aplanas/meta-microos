SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python311-jira-3.5.1-1.3.noarch.rpm"
RPM_HASH = "dd82c072d71c62aab5ef293d02826bcaddc56de3873ba41d9537e9a15c5f0e35130fc36fa1c5f0316c44e18b8fb4e7557a3260663191c1a8d6caa068f5e99f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jira \
python3.11dist-jira \
python311-jira \
python3dist-jira"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-defusedxml \
python311-keyring \
python311-oauthlib \
python311-packaging \
python311-requests \
python311-requests-oauthlib \
python311-requests-toolbelt \
python311-typing-extensions \
update-alternatives"

inherit rpm
