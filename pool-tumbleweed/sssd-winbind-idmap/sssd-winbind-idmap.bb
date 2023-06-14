SUMMARY = "The sss idmap backend for Winbind"
DESCRIPTION = "The idmap_sss module provides a way for Winbind to call SSSD to map \
UIDs/GIDs and SIDs."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-winbind-idmap-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "86e2898ad308a8cb204d431a3fa97cc4e551ace8cf46a1aaf30474637a3340d25ecbbf75375c1a9c125212ca7d95ede419b489ece1c74f8ece2b6cab5a16a55e"

RPROVIDES:${PN} += "sssd-winbind-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0 \
libtalloc.so.2"

inherit rpm
