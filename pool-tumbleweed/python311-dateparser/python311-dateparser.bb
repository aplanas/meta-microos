SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python311-dateparser-1.1.8-2.3.noarch.rpm"
RPM_HASH = "74ce5f53412c1bdc68e6629afd94c440c1a2e6192fe38ef60a563b4c062d44d1b3cd78f125081c6f0f3e2f57db98d9cf64b46aadbc980972034801b572e7f209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dateparser \
python3.11dist-dateparser \
python311-dateparser \
python3dist-dateparser"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-pytz \
python311-regex \
python311-tzlocal \
update-alternatives"

inherit rpm
