SUMMARY = "GlusterFS's core library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libglusterfs0-11.0-4.1.aarch64.rpm"
RPM_HASH = "6236ee00b0d88a82180816f7dd8648d3f38f1218e97556dfdf1e45c5f676812ff7de08830d01eca121d0c496c1c3904dbc5413d7f7a3177ee9bd5e588e2d67ee"

RPROVIDES:${PN} += "libglusterfs.so.0 \
libglusterfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
