SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-mutt-ics-0.9.2-3.13.noarch.rpm"
RPM_HASH = "add43bf07827e1aec429776c68a5bf7aa5df0574c4925601a8ac949fd75b1959fe30a971ff6499825911b5f78e9092213bd31f18b569325a2f2879cb87279737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3.10dist-mutt-ics \
python310-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-icalendar \
python310-setuptools \
update-alternatives"

inherit rpm
