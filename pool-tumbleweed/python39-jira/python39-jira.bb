SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python39-jira-3.5.1-1.3.noarch.rpm"
RPM_HASH = "d57b51d018139dd1115ba09500d6636f08ff74e56c05c21aa7bfae7fec312f3ee55f785a667ff425871077c224f28f5dca8d2eea65dd0b9b103dc7d6bcce420c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jira \
python39-jira \
python3dist-jira"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-defusedxml \
python39-keyring \
python39-oauthlib \
python39-packaging \
python39-requests \
python39-requests-oauthlib \
python39-requests-toolbelt \
python39-typing-extensions \
update-alternatives"

inherit rpm
