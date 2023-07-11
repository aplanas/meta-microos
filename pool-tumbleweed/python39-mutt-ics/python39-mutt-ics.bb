SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-mutt-ics-0.9.2-3.13.noarch.rpm"
RPM_HASH = "65a1ea4bbb725c0d3bbe91f5ae2261245c2fa104a228b90c1150bc12af12b696f8d8beba66f167a2410f8c7c429cc1537ac17ca2c8f8f767719b537340318a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3.9dist-mutt-ics \
python39-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-icalendar \
python39-setuptools \
update-alternatives"

inherit rpm
