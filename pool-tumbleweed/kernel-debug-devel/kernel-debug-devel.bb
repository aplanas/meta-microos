SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-debug-devel-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "7076d1bb0d6be611becf33cdbb144e8eebbc57d762364ca51814faf7a0f973207ff49478d5a5636e3fda249656a4a023cfcd46c3b4f01802a8d0c9ad07a2f723"

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
