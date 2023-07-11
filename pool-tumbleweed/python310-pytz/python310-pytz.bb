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

RPM_NAME = "python310-pytz-2023.3-2.2.noarch.rpm"
RPM_HASH = "e64ab6f1f2226880effb6204f86bb56276769431556986a5498782805e3b5acd662137b6334e83d404d6952a5ee73dcb12ab1cf65543d3d62ffdc213fedaadec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytz \
python310-pytz \
python3dist-pytz"

RDEPENDS:${PN} += "/usr/bin/sh \
python-abi \
python310-base \
timezone"

inherit rpm
