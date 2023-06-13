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

RPM_NAME = "python311-pytz-2023.3-2.1.noarch.rpm"
RPM_HASH = "54771f5212382fe4d236c20cf42b9b0b0242348f31d27a9481adaf02a7bd86f9d32e34827615c9a532f6d4ce65e2bfe037a21c1753f752b8d588b380ce7ec227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytz) \
python311-pytz \
python3dist(pytz)"

RDEPENDS:${PN} += "/bin/sh \
python(abi) \
python311-base \
timezone"

inherit rpm
