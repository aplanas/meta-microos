SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python310-vdirsyncer-0.19.0-2.1.noarch.rpm"
RPM_HASH = "c9491480d8610c3a9dff59720a42a2a787efd659789b3e7a5cd89634885f4de545c376da995b90e25eb34f5cde661335f9568ed287935367f3cb0ce2023fbc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vdirsyncer \
python3.10dist-vdirsyncer \
python310-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiostream \
python310-atomicwrites \
python310-click \
python310-click-log \
python310-click-threading \
python310-requests \
python310-requests-toolbelt \
update-alternatives"

inherit rpm
