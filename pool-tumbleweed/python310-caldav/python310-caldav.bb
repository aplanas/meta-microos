SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python310-caldav-0.10.0-1.5.noarch.rpm"
RPM_HASH = "04c1572649d59fde8ffbfe248bc8c193333a3acc635d06348aa29136a572244f46ed464da941bf1215f6d2597ecc95e7aa8d49f14ae709f2b9e46240f7e2514e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-caldav \
python310-caldav \
python3dist-caldav"

RDEPENDS:${PN} += "python-abi \
python310-lxml \
python310-requests \
python310-vobject"

inherit rpm
