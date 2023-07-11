SUMMARY = "GlusterFS's External Data Representation library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfxdr0-11.0-3.1.aarch64.rpm"
RPM_HASH = "2cfdfdb566a2fd5e5cf3c495f6def605aa67055da80b1f280d00e9bfe45f8bc832e66c7489d22270fc76d5e5802bf16f30ec918fefc5c78f87ddd8d3bdf843ff"

RPROVIDES:${PN} += "libgfxdr.so.0 \
libgfxdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm
