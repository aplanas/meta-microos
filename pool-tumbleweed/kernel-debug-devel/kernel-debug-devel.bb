SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the debug flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-debug-devel-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "cf4f5b42ad3210093eab60d87337e29d2ff21f2971d5e05adc175561f58839e3eba0e262e2fba41b7f08ebcd8a92f75404120d3e3a62e6f14f46249ba36c6d94"

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
