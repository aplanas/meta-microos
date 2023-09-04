SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python39-vdirsyncer-0.19.0-3.1.noarch.rpm"
RPM_HASH = "40843357be4bcc4b94b81fb26e52f7794072d33ad02bb4655b9922e10b18d8a14309f9251d44f3d37e8d768347b7317ef5f083072409ca79ad6fcf5f530cf042"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vdirsyncer \
python39-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp \
python39-aiostream \
python39-atomicwrites \
python39-click \
python39-click-log \
python39-click-threading \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
