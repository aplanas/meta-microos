SUMMARY = "CalDAV and CardDAV synchronization module"
DESCRIPTION = "Vdirsyncer synchronizes calendars and addressbooks between two \
storages. The supported storages are CalDAV, CardDAV, arbitrary HTTP \
resources, vdir and some more. It aims to be for CalDAV and CardDAV \
what OfflineIMAP is for IMAP."
LICENSE = "BSD-3-Clause"

PV = "0.19.0"

RPM_NAME = "python311-vdirsyncer-0.19.0-2.1.noarch.rpm"
RPM_HASH = "787a391381c2365259aa1bf17ac03e6a0ba69752df6f208a5ede7733f47a74edabaa5ead08ddd237be7c3118bcd27f7092bd7d754d29cc0afe52f686a7dd1ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-vdirsyncer \
python311-vdirsyncer \
python3dist-vdirsyncer \
vdirsyncer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
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
