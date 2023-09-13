SUMMARY = "Date parsing library designed to parse dates from HTML pages"
DESCRIPTION = "Date parsing library designed to parse dates from HTML pages"
LICENSE = "BSD-3-Clause"

PV = "1.1.8"

RPM_NAME = "python39-dateparser-1.1.8-3.1.noarch.rpm"
RPM_HASH = "8abd00b03ccc3fc19b83211cb19e8fe8beab191dc5e9d78511e01950a0de13e3b1991b815ce6a1007d9e0e4dc0ccdc59018d92928d8bc602f7f92f34ada53377"
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
