SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-default-devel-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "520ddb09656e29ecce636a47cb61606bef0df79b12cd2a15ab8adad74c8ec44c1673f570d7e73fb74a77322d616a6494efb8493b101e3b45ee24df52c59d2b1a"

RPROVIDES:${PN} += "kernel-default-devel \
kernel-preempt-devel \
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
