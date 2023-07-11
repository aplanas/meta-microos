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

RPM_NAME = "python311-pytz-2023.3-2.2.noarch.rpm"
RPM_HASH = "9a14a0ef1e91a04b41e409063a23a3662c91dcea3f0e61d0062d0d08bdcf32dac5d3a70a0a30acca82caf69d6892edc360f57ed92e0adf09ecd3a3b4c5954992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytz \
python3.11dist-pytz \
python311-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python311-base \
timezone"

inherit rpm
