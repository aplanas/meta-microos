SUMMARY = "GlusterFS Remote Procedure Call library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfrpc0-11.0-2.1.aarch64.rpm"
RPM_HASH = "27e12ec9311c5f8a276edd7005d53c38230fc300985b8259d9c523a414fd6c179d25db2a1ba3e5b8ff0b056866e27330e4e72ce234b64f493ff14c2977f3936c"

RPROVIDES:${PN} += "libgfrpc.so.0()(64bit) \
libgfrpc0 \
libgfrpc0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfxdr.so.0()(64bit) \
libglusterfs.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit) \
libtirpc.so.3(TIRPC_0.3.3)(64bit)"

inherit rpm
