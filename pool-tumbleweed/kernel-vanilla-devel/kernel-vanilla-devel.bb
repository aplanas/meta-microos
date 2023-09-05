SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-vanilla-devel-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "74efbc92a95f1314b422f770eec8f72aa8f8d13a88accb8cbae14b1f565cc5547845a4979961043568af7a5004241a0d439fe8c61a340617a01cc95eca4ab52a"

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
