SUMMARY = "CalDAV (RFC4791) client library for Python"
DESCRIPTION = "This project is a CalDAV (RFC4791) client library for Python. \
 \
It can read all the tags, but only write a few things (create calendars, \
events, modify events and properties)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "python39-caldav-0.10.0-1.5.noarch.rpm"
RPM_HASH = "1293bf26796f2db22dbc4e423840cca0b3e27b70b787c22799acef2dbe1faa1712e0b3036cbb0b87a0a85e680fc452e4b8f3967b9fa914d26e31f35f6466db5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-caldav \
python39-caldav \
python3dist-caldav"

RDEPENDS:${PN} += "python-abi \
python39-lxml \
python39-requests \
python39-vobject"

inherit rpm
