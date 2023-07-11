SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python39-dateparser-1.1.8-2.3.noarch.rpm"
RPM_HASH = "40b0b9c47d6f192a96c76e55c58a91f50a01f5ee682dd60b6d88d6457a01c674b49915c36743949be5d8018d7985b622ea6e2d5e62f7879fbe23452aa0102baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dateparser \
python39-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-pytz \
python39-regex \
python39-tzlocal \
update-alternatives"

inherit rpm
