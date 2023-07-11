SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python39-khal-0.10.5-3.5.noarch.rpm"
RPM_HASH = "29e424ff5590cd6d44e8bff6b1bd9c55fbed3c7f2f0449504672627db3a948df821859d52589d6e754f9d344907b4e81306ce4b75d9ea3703eb2c681a63e2b04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-khal \
python39-khal \
python3dist-khal"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-atomicwrites \
python39-click \
python39-click-log \
python39-configobj \
python39-dateutil \
python39-icalendar \
python39-pytz \
python39-pyxdg \
python39-tzlocal \
python39-urwid \
update-alternatives"

inherit rpm
