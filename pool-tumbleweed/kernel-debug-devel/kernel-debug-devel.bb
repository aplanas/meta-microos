SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-debug-devel-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "6507f94a5d2aab6e4f82938cc99c3e704c43eb714ee2b58c756152e76ce79af6d55f3bb0d94cb168d696dfbe54f899ff9b7d387fbb6be86faf33e412a2882d67"

RPROVIDES:${PN} += "kernel-debug-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
jq \
kernel-devel \
libc.so.6 \
libcrypto.so.3 \
libelf-devel \
libelf.so.1"

inherit rpm
