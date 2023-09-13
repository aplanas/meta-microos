SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python310-dateparser-1.1.8-3.1.noarch.rpm"
RPM_HASH = "2def9e90841c471513b981ebb81252a5e2f5f69ca291924fd1fd493a88af48f6de0895dea748da0e36c8da7a6dd719ee06feb6c4dc07f6b9060d5587c01ae5a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dateparser \
python310-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-pytz \
python310-regex \
python310-tzlocal \
update-alternatives"

inherit rpm
