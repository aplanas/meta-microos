SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-kvmsmall-devel-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "0025152b10ccea745e94c91f2690faffe1254469af3f8f3f67a772d9a64308f664a15793fbbd0eab0e8a8a8dc57929bbfe9c5c66d5353fa2fcda980835dc91a2"

RPROVIDES:${PN} += "kernel-kvmsmall-devel \
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
