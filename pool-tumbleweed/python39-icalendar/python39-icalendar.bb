SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python39-icalendar-4.1.0-1.6.noarch.rpm"
RPM_HASH = "9d90c9ad52684b8edc86f17d20e345432f222991b059a047924ae61246b6125f561046ef8bd9cc5f0f9c723c2ead029f6ea25fca032ca3af001e527834eb0635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-icalendar \
python39-icalendar \
python39-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-python-dateutil \
python39-pytz \
update-alternatives"

inherit rpm
