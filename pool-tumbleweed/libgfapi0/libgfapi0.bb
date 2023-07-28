SUMMARY = "GlusterFS API library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfapi0-11.0-4.1.aarch64.rpm"
RPM_HASH = "a8fd705ce2b296391ba71b2e4e55b75a1e0011c8f0c3436f4a51147274a2d92e4e5141d1fa752dcc14947c0178f8aa2fd9d6c59bb425d4cc53d990020e458b9e"

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
