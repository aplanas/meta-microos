SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python39-vdirsyncer-0.19.0-2.1.noarch.rpm"
RPM_HASH = "95a631f75a630fc26198d0a68fabaaec4a882749ad1d9a8035a8032bf767600a2a0220bf3a9347a71ccd1d7e5fcaeded41d5cda5a545cd6008c160de26c6c9ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(vdirsyncer) \
python39-vdirsyncer \
python3dist(vdirsyncer) \
vdirsyncer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-aiostream \
python39-atomicwrites \
python39-click \
python39-click-log \
python39-click-threading \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
