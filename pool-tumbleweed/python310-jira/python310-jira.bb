SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python310-jira-3.5.1-1.3.noarch.rpm"
RPM_HASH = "a1cfeda32ecc002874475c76111ea9c42d2c871992cc60dfdb47dc5452b7d98d1f16f230420d98b6950151357c9a963f3737a731457259b967cf32d08125030c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jira \
python310-jira \
python3dist-jira"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-defusedxml \
python310-keyring \
python310-oauthlib \
python310-packaging \
python310-requests \
python310-requests-oauthlib \
python310-requests-toolbelt \
python310-typing-extensions \
update-alternatives"

inherit rpm
