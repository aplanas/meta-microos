SUMMARY = "The sss idmap backend for Winbind"
DESCRIPTION = "The idmap_sss module provides a way for Winbind to call SSSD to map \
UIDs/GIDs and SIDs."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-winbind-idmap-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "f1b71984772d908387b1cd5c783ada9a01bdd3c104bf425de8c5704997b24501cf5cfaaa5add5e893877d213b67706629f001fbe223a6b99fa4159669a106736"

RPROVIDES:${PN} += "sssd-winbind-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0 \
libtalloc.so.2"

inherit rpm
