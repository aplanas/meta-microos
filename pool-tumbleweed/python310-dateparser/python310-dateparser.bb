SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python310-dateparser-1.1.8-2.3.noarch.rpm"
RPM_HASH = "02d7552bed5ce3ceaad479354132ef784d1b423fc3f1ad7aea5e27ea644d89921d3bea8486b53b31115c21f7dc649ba629b5ec9fec840dd2381e597f88a7edd7"
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
