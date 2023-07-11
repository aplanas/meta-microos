SUMMARY = "A Python Datetime Library"
DESCRIPTION = "The python dateutil module provides powerful extensions to the standard \
datetime module. \
 \
* Computing of relative deltas (next month, next year, next monday, \
   last week of month, etc.) \
 \
* Computing of relative deltas between two given dates and/or \
   datetime objects \
 \
* Computing of dates based on very flexible recurrence rules, using \
   a superset of the iCalendar specification. Parsing of RFC strings \
   is supported as well. \
 \
* Generic parsing of dates in almost any string format. \
 \
* Timezone (tzinfo) implementations for tzfile(5) format files \
   (/etc/localtime, /usr/share/zoneinfo, etc.), TZ environment \
   string (in all known formats), iCalendar format files, given \
   ranges (with help from relative deltas), local machine timezone, \
   fixed offset timezone, UTC timezone, and Windows registry-based \
   time zones. \
 \
* Internal up-to-date world timezone information based on Olson's \
   database. \
 \
* Computing of Easter Sunday dates for any given year, using Western, \
Orthodox or Julian algorithms."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "2.8.2"

RPM_NAME = "python39-python-dateutil-2.8.2-2.2.noarch.rpm"
RPM_HASH = "bfe8fc1f7a960eb74fe5f78f133813b7c630ba39dccf47d5919e29201430f13a62a05fc2631dd7092bd06ce13d03b3b981c54b064a960cd073653f8675f99826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-dateutil \
python39-dateutil \
python39-python-dateutil \
python3dist-python-dateutil"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
