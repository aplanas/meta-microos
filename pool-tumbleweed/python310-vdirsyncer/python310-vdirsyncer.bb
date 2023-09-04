SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python310-vdirsyncer-0.19.0-3.1.noarch.rpm"
RPM_HASH = "e34b57e53fe461cdd2d939848ce1f626b3587432310fbe3bede4570c38008b83ce2bc7a628a7f00e14ff851c93f40ac52d19d35abdaaa089b51add7f717ee08d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vdirsyncer \
python310-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp \
python310-aiostream \
python310-atomicwrites \
python310-click \
python310-click-log \
python310-click-threading \
python310-requests \
python310-requests-toolbelt \
update-alternatives"

inherit rpm
