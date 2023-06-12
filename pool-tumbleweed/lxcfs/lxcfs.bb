SUMMARY = "FUSE filesystem for LXC"
DESCRIPTION = "LXCFS is a small FUSE filesystem written with the intention of making Linux \
containers feel more like a virtual machine. It started as a side-project of \
LXC but is usable by any runtime."
LICENSE = "Apache-2.0"

PV = "5.0.2"

RPM_NAME = "lxcfs-5.0.2-2.2.aarch64.rpm"
RPM_HASH = "11540f301c54b3ebafdd9eed358547fab43dfcc9082d874ec99ea5855a8adf0ef7704af2b7b242516cbc226de8f9455a48c270c88bfcc1762d06e94efd6ad87f"

RPROVIDES:${PN} += "liblxcfs.so()(64bit) \
lxcfs \
lxcfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
systemd"

inherit rpm