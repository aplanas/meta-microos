SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-vanilla-devel-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "f6fd2f448346f67e2eba64a6b958c122774e7ae0390604f25b666baee8926bb0f255544c405b9fffa1bd20ac99dcf82fb2804c8c98a51b55f6045cb12c47288e"

RPROVIDES:${PN} += "kernel-vanilla-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
kernel-source-vanilla \
libc.so.6 \
libcrypto.so.3 \
libelf.so.1"

inherit rpm
