SUMMARY = "World timezone definitions, modern and historical"
DESCRIPTION = "pytz - World Timezone Definitions for Python \
pytz brings the Olson tz database into Python. This library allows \
accurate and cross platform timezone calculations using Python 2.4 \
or higher. It also solves the issue of ambiguous times at the end \
of daylight savings, which you can read more about in the Python \
Library Reference (``datetime.tzinfo``). \
 \
Amost all of the Olson timezones are supported."
LICENSE = "MIT"

PV = "2023.3"

RPM_NAME = "python39-pytz-2023.3-2.1.noarch.rpm"
RPM_HASH = "e3dee69a83c2e6c20624f68c93849e2d43176db807d96b845313f2d5652e0ac38df3d7399645ac5754f29e1d19fe8019e125b3eec12f2ebb685e241b54e51289"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytz \
python39-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python39-base \
timezone"

inherit rpm
