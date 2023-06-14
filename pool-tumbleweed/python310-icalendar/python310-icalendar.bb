SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python310-icalendar-4.1.0-1.4.noarch.rpm"
RPM_HASH = "c2cd2b2a862a4efdae0b1f335dc2c9ffcd550ff5ec7ed7fab4de8c51f0bee1829a9ad6350f34c58359ebdf5d61ff8ea759b671f11397f66189d823f08161a0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-icalendar \
python3-icalendar-doc \
python3.10dist-icalendar \
python310-icalendar \
python310-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-python-dateutil \
python310-pytz \
update-alternatives"

inherit rpm
