SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-debug-devel-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "edc539c2647eeddcbdc8df96eba4131e3a19ff5eb1d7dc0fde0290293a3ea8b405333252499cf84107e35f60d9e55c4edbfd02a9ecfbc9438974d914e02da83b"

RPROVIDES:${PN} += "kernel-debug-devel \
multiversion-kernel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
dwarves \
kernel-devel \
libc.so.6 \
libcrypto.so.3 \
libelf-devel \
libelf.so.1"

inherit rpm
