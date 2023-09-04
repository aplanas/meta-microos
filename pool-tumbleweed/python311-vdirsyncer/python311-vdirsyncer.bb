SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python311-vdirsyncer-0.19.0-3.1.noarch.rpm"
RPM_HASH = "f9bb265b1196a19f3ef604cb9ec9133e73db59877fe5452ef8569be80c80b481527c9603a328d7610f33673791ca424a2843d9c4702c521b21e64af27dc93257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vdirsyncer \
python3.11dist-vdirsyncer \
python311-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-aiostream \
python311-atomicwrites \
python311-click \
python311-click-log \
python311-click-threading \
python311-requests \
python311-requests-toolbelt \
update-alternatives"

inherit rpm
