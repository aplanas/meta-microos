SUMMARY = "CLI calendar with CalDAV support"
DESCRIPTION = "Khal is a CLI (console), CalDAV based calendar program, allowing syncing of \
calendars with a variety of other programs on a host of different platforms."
LICENSE = "MIT"

PV = "0.10.5"

RPM_NAME = "python310-khal-0.10.5-3.4.noarch.rpm"
RPM_HASH = "a9fd8edb87b48ae670aab73736d5a55db0a4029080a1ff1871193d0c31ece288fb471050fff3b676b9c1adbc6c48122153b3313e0e7ce166ce7068357099ca42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-khal \
python3.10dist(khal) \
python310-khal \
python3dist(khal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
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
