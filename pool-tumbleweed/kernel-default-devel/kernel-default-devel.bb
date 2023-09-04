SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-default-devel-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "24570711054466468f0558b553a5a4ed442835d0857b9d345019ce6f9980ad669c262b6f46c8ced8a608d8695062c1945e7ce232c25a22a45c662659bd22b828"

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
