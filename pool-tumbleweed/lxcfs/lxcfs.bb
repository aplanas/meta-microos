SUMMARY = "FUSE filesystem for LXC"
DESCRIPTION = "LXCFS is a small FUSE filesystem written with the intention of making Linux \
containers feel more like a virtual machine. It started as a side-project of \
LXC but is usable by any runtime."
LICENSE = "Apache-2.0"

PV = "5.0.4"

RPM_NAME = "lxcfs-5.0.4-1.1.aarch64.rpm"
RPM_HASH = "6e89648f031625f32ba0642012de355b969b4d6eb7e0f9355222ac48b0577fb75d92ded1aa4660c1f972984b95991b627cd9690e0136be853b502ce4c2cea4f3"

RPROVIDES:${PN} += "liblxcfs.so \
lxcfs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
systemd"

inherit rpm
