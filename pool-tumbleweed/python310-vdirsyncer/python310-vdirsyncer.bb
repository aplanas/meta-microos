SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python310-vdirsyncer-0.19.0-2.3.noarch.rpm"
RPM_HASH = "51f595e3647a3093f9059505375a2928412257f046a2a6e5f30526ca6e04bdc58c577970d28cf749bd72cc363a4a7f46172d01c8496638c9d2b7383139cbddb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vdirsyncer \
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
