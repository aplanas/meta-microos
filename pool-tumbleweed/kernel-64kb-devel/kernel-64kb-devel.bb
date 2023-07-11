SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-64kb-devel-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "6568f0be744f219ffa2621fce7fdb7112c1ba2792527ca4f003b28d9ad31f127658809826a6e114a02b81ef8957a0a6172fde0bad9eb269bcac6964888bc1a2e"

RPROVIDES:${PN} += "kernel-64kb-devel \
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
