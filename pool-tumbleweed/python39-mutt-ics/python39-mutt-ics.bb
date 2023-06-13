SUMMARY = "A tool to show calendar event details in Mutt"
DESCRIPTION = "A tool to show calendar event details in Mutt."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-mutt-ics-0.9.2-3.11.noarch.rpm"
RPM_HASH = "eb99fd12d028942849bd7ddbe7275548875e33f7727aadae6cfd91e87fcef0dfd468e6f7aa165142c5dc16a412622b7463fc975c5f342e3a8c96d1532bf7d1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mutt-ics \
mutt_ics \
python3.9dist(mutt-ics) \
python39-mutt-ics \
python3dist(mutt-ics)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-icalendar \
python39-setuptools \
update-alternatives"

inherit rpm
