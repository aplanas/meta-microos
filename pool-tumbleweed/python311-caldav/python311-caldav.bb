SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python311-caldav-0.10.0-1.5.noarch.rpm"
RPM_HASH = "a375f98dc65d8d4d633e021a74a24b41cf9c72707b8da34caf2c23f2b8fae5cfff924ec2c7168ac20900823b548698070179adccf58cbb1600d8d98be3b12256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-caldav \
python3.11dist-caldav \
python311-caldav \
python3dist-caldav"

RDEPENDS:${PN} += "python-abi \
python311-lxml \
python311-requests \
python311-vobject"

inherit rpm
