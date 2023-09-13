SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_idmap0-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "581ba53d58e3ad5bcbc4a404b41eeeee4885cb3e35b3ebcaa9f86254d1b448e3ece918c061ea0ea99eae93a0620b6981e67f42341a339a9652fa49fa6ddf478c"

RPROVIDES:${PN} += "libsss-idmap.so.0 \
libsss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
