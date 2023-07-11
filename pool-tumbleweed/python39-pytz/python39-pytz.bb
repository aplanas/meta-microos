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

RPM_NAME = "python39-pytz-2023.3-2.2.noarch.rpm"
RPM_HASH = "fde6f474ddb0d38323fff07374eeb31d5e5fe78707982c1ca1276b5b2ef7756bab8e499c3e1579c21576346392870640e92783c5e21c972e1b777c6cc4e20d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytz \
python39-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python39-base \
timezone"

inherit rpm
