SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python39-vdirsyncer-0.19.0-2.3.noarch.rpm"
RPM_HASH = "6dc1c5abb04a2f09325592a30971c9862b0472484c80cad991b2ea1a8397e8af7cdf287dfae90b2a5d230026d215ef81fd1bf162b368b7b57c985d7bab71c93d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vdirsyncer \
python39-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiostream \
python39-atomicwrites \
python39-click \
python39-click-log \
python39-click-threading \
python39-requests \
python39-requests-toolbelt \
update-alternatives"

inherit rpm
