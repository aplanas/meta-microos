SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python310-khal-0.10.5-3.5.noarch.rpm"
RPM_HASH = "5d552d5efb7b3b2cdcf2c376235bd5154feaec8ece3b7d48a921ddb9a1037f3c902399ddc10318ae373f4923850fc570561f05e35a4789c1fcdfe396f45a7759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-khal \
python310-khal \
python3dist-khal"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-atomicwrites \
python310-click \
python310-click-log \
python310-configobj \
python310-dateutil \
python310-icalendar \
python310-pytz \
python310-pyxdg \
python310-tzlocal \
python310-urwid \
update-alternatives"

inherit rpm
