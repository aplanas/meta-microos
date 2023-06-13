SUMMARY = "Userspace tools for Linux kernel containers"
DESCRIPTION = "LXC is the well-known and heavily tested low-level Linux container runtime."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "lxc-5.0.2-1.1.aarch64.rpm"
RPM_HASH = "e0aadacf610a044046180a95b6023a4e9ce44b956ee95f48d5552109c8c762c95cb5c7c61544e40de3dd8a1dd1c2ff8b3eca65b29dcfbd1ddfb20dfcb6956f6f"

RPROVIDES:${PN} += "config(lxc) \
lxc \
lxc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapparmor.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcap-progs \
libcap.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblxc.so.1()(64bit) \
libseccomp.so.2()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
lxcfs \
lxcfs-hooks-lxc \
rsync"

inherit rpm
