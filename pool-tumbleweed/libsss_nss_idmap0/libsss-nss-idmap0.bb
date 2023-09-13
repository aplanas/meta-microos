SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map Windows SIDs to Unix user/group IDs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_nss_idmap0-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "a32ffee5e5e3511a69ab0c8462c77ac2ed54ca26608445d6b7b3516bdd6e8dd100f8e53316b6ffbb3096a1337f61172d509979503eeca57ae72a9f6f3b79c9b6"

RPROVIDES:${PN} += "libsss-nss-idmap.so.0 \
libsss-nss-idmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
