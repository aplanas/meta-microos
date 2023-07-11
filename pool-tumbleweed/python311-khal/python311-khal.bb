SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python311-khal-0.10.5-3.5.noarch.rpm"
RPM_HASH = "f6e372075fc7875d71bea7f69110ed8d0e96739c71a49b51be9334e8ba2a9779fb01d15b28c1d99df009c4b5df394c0da736b3736a6bc289df561d2de5b3a02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-khal \
python3.11dist-khal \
python311-khal \
python3dist-khal"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-atomicwrites \
python311-click \
python311-click-log \
python311-configobj \
python311-dateutil \
python311-icalendar \
python311-pytz \
python311-pyxdg \
python311-tzlocal \
python311-urwid \
update-alternatives"

inherit rpm
