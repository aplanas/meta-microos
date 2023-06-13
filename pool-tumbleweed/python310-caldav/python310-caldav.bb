SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python310-caldav-0.10.0-1.3.noarch.rpm"
RPM_HASH = "0a563489c85703c4afa1cabd1d42170c4d442d4c25b7762fcb00ac1e17481a9225c5e3a4f7e8747c233a6ea1406b927acdfb8c635015cfc914b804cdf7e9ade5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caldav \
python3.10dist(caldav) \
python310-caldav \
python3dist(caldav)"

RDEPENDS:${PN} += "python(abi) \
python310-lxml \
python310-requests \
python310-vobject"

inherit rpm
