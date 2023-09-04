SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-debug-devel-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "fed22f40bc8a2e9f44e6f7beb8f75db7444b25335033d90bb78be68ee0e3be5af418ad5d5125aa164b2c23663d5587149a3e375416a345348e79323875d6c85f"

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
