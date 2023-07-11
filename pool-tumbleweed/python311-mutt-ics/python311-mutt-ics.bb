SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-mutt-ics-0.9.2-3.13.noarch.rpm"
RPM_HASH = "c471891ed94ae17815609d9b2d28270452826f024de4b96d5ced2ae7be7e2dc29f36864be15a07377ea3eddc5ac72f8c6c0e92106d2b082cdf9d01998159b443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3-mutt-ics \
python3.11dist-mutt-ics \
python311-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-icalendar \
python311-setuptools \
update-alternatives"

inherit rpm
