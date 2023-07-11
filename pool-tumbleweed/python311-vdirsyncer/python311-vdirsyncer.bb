SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python311-vdirsyncer-0.19.0-2.3.noarch.rpm"
RPM_HASH = "4567c63d4a1cf46d0afcb594b89e12d7b554b3b0b0c26e4c9d6dd43908fdf3984281efdad01438125a7f00fb26ceea3f267b24c338d1709f2ca05901ff7b512b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vdirsyncer \
python3.11dist-vdirsyncer \
python311-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiostream \
python311-atomicwrites \
python311-click \
python311-click-log \
python311-click-threading \
python311-requests \
python311-requests-toolbelt \
update-alternatives"

inherit rpm
