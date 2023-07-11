SUMMARY = "GlusterFS API library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfapi0-11.0-3.1.aarch64.rpm"
RPM_HASH = "0c7b0be42ce6edf84d960ead105a29adb6b679cd12ef6686215797029beebce3ac6fb0adfe05aed3ff3b2649cf449e1a29eb0144b62058891b8860fcee64275c"

RPROVIDES:${PN} += "libgfapi.so.0 \
libgfapi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgfrpc.so.0 \
libgfxdr.so.0 \
libglusterfs.so.0 \
libtirpc.so.3 \
libuuid.so.1"

inherit rpm
