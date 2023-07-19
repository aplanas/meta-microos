SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-vanilla-devel-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "c856c53359e7a0531278b86ba19db87b9832c04d415365f5bddff75bf589a4a6f77db19d76e6bb5092e420265717f2dc6f83add119bf5c0c7bb6f79ddfb2a774"

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
