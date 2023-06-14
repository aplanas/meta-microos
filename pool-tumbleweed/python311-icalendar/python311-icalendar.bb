SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python311-icalendar-4.1.0-1.4.noarch.rpm"
RPM_HASH = "b98d8e0ac00559a4386dd970f5b6566af89981e68f739231cb3ba89adf8aaa08a1b7c71be870adf276be27d86835f80541f5aecfafa183a461ca9022c2001bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-icalendar \
python311-icalendar \
python311-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-python-dateutil \
python311-pytz \
update-alternatives"

inherit rpm
