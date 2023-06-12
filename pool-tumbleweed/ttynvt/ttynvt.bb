SUMMARY = "Virtual Network Terminal supporting the Com Port Control Option (RFC2217)"
DESCRIPTION = "ttynvt makes a virtual serial device (tty) and connects \
the device to a Network Virtual Terminal (NVT)."
LICENSE = "GPL-3.0-or-later"

PV = "0.16"

RPM_NAME = "ttynvt-0.16-1.1.aarch64.rpm"
RPM_HASH = "ef9bc73b3d19b07aa04d6de1579db2b23f5c11c14d4c7100dbd92d8c794201e696105c7057b54de7bc24c97cd208965975f6378664a48434693af9d6ca8b92f9"

RPROVIDES:${PN} += "ttynvt \
ttynvt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.4)(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit)"

inherit rpm
