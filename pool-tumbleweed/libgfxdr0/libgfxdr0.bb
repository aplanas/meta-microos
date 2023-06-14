SUMMARY = "GlusterFS's External Data Representation library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfxdr0-11.0-2.1.aarch64.rpm"
RPM_HASH = "03235c75bfc88e7ba871a6cf5ac85f3329283430bb9e9b64beec9bb170c7c0012dd6dbe381d5440fb5f82bfab24bdaa6f02b517543f332c955922b7936ed5a4c"

RPROVIDES:${PN} += "libgfxdr.so.0 \
libgfxdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3"

inherit rpm
