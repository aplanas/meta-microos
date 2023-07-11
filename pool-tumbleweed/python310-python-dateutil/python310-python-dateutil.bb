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

RPM_NAME = "python310-python-dateutil-2.8.2-2.2.noarch.rpm"
RPM_HASH = "1586481846e38cc8ab1898565b80ff7a84f5cf6d4da4a04c91c44de026efe1e0cd02caee908f6192f83826998c52833744bbe462304aa84d322b2aa8cfd13c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-dateutil \
python310-dateutil \
python310-python-dateutil \
python3dist-python-dateutil"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
