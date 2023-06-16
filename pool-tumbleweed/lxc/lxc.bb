SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "e0aadacf610a044046180a95b6023a4e9ce44b956ee95f48d5552109c8c762c95cb5c7c61544e40de3dd8a1dd1c2ff8b3eca65b29dcfbd1ddfb20dfcb6956f6f"

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
