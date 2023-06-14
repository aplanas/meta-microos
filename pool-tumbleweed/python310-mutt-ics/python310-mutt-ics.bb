SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-mutt-ics-0.9.2-3.11.noarch.rpm"
RPM_HASH = "6049499e752d96438b45796bd350e8336de43e98b59d631f3ba45d503042bc84cd6c7086cbf34e5141f540f7d1e82c5ed2ee4a0615652dce31ab9486a13b3d9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
python3-mutt-ics \
python3.10dist-mutt-ics \
python310-mutt-ics \
python3dist-mutt-ics"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-icalendar \
python310-setuptools \
update-alternatives"

inherit rpm
