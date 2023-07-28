SUMMARY = "GlusterFS Remote Procedure Call library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfrpc0-11.0-4.1.aarch64.rpm"
RPM_HASH = "9348effb6f457dbbb9660762b07095a3a39f0c365ba7e3ad754ffce113d6eef98447b24555a46e1ef5b5523342fbe3b0c580a18b96b45c575442494db66370a4"

RPROVIDES:${PN} += "libgfrpc.so.0 \
libgfrpc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3"

inherit rpm
