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

RPM_NAME = "python311-python-dateutil-2.8.2-2.1.noarch.rpm"
RPM_HASH = "5e2ea392a9e08699c32a352b7245982c232235c5881c502acd827057b78d0638b883dda29507828c4aef5436d06674439e71f753b5757dd740a462b271489ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-dateutil \
python311-dateutil \
python311-python-dateutil \
python3dist-python-dateutil"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
