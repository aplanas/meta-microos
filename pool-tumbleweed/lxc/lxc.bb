SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "lxc-5.0.3-1.1.aarch64.rpm"
RPM_HASH = "b7008a8ca639ae76b52edf197bc60b36d017d707f5e9eb286f531f0a1d23e1e0396bd59b3e23279d2708153e4482e9e57433312598c5bb83dab7f2b9884b81c9"

RPROVIDES:${PN} += "config-lxc \
lxc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libapparmor.so.1 \
libc.so.6 \
libcap-progs \
libcap.so.2 \
libgcc-s.so.1 \
liblxc.so.1 \
libseccomp.so.2 \
libselinux.so.1 \
libsystemd.so.0 \
lxcfs \
lxcfs-hooks-lxc \
rsync"

inherit rpm
