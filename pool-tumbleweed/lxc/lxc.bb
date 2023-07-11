SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "09a430f24481a3794ada9a8e804a43b432fefa55a99cbccf6d236c4ab60d5156852a4796a19be787bb825bc1d71d4d8f6655ee752b2e5b316bd85f7b8a78de1e"

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
