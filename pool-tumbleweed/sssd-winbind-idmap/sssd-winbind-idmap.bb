SUMMARY = "The sss idmap backend for Winbind"
DESCRIPTION = "The idmap_sss module provides a way for Winbind to call SSSD to map \
UIDs/GIDs and SIDs."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-winbind-idmap-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "4da9fc6a2ed44a98adeb8c9f2e88b4a47517b4a8b7bee591c5b51538e599a293489914af4b4e0a8af680cbfcb460c9b94d8509219990e42759953ab7230a1e84"

RPROVIDES:${PN} += "sssd-winbind-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0 \
libtalloc.so.2"

inherit rpm
