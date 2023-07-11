SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-vanilla-devel-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "acdc267e3f4bc84e66f63307fa0d45aaef6acfe9ba680efcca5b141a36d15729e56057b13a1b27590c1713c577df778d7924d1a100d2a7fbf516d4a988e112f7"

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
