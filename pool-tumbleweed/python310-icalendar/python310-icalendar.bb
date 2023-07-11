SUMMARY = "Python parser/generator of iCalendar files package"
DESCRIPTION = "The iCalendar package is a parser/generator of iCalendar files for use \
with Python. It follows the RFC 2445 (iCalendar) specification."
LICENSE = "BSD-2-Clause"

PV = "4.1.0"

RPM_NAME = "python310-icalendar-4.1.0-1.6.noarch.rpm"
RPM_HASH = "8ba9f5ef2a77d573e62fcd65fcc3fd5e77106c96bb9a8c8897ded09d9de077742f09f9aca580704bfd95360c3b4818e9e652884d3163468f1014a6bd19dee7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-icalendar \
python310-icalendar \
python310-icalendar-doc \
python3dist-icalendar"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-pytz \
update-alternatives"

inherit rpm
