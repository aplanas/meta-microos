SUMMARY = "FUSE filesystem for LXC"
DESCRIPTION = "LXCFS is a small FUSE filesystem written with the intention of making Linux \
containers feel more like a virtual machine. It started as a side-project of \
LXC but is usable by any runtime."
LICENSE = "Apache-2.0"

PV = "5.0.2"

RPM_NAME = "lxcfs-5.0.2-2.3.aarch64.rpm"
RPM_HASH = "cb78895ff37d487149add84c0b12c59f6eaa106abd797d88e194a476d332677aed4b546f34248c2bbcdccc54bc17af6b8968f165d5a464f3139df12385cb4a1f"

RPROVIDES:${PN} += "liblxcfs.so \
lxcfs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
libgcc-s.so.1 \
systemd"

inherit rpm
