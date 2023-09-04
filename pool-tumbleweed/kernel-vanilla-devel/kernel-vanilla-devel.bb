SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the vanilla flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-vanilla-devel-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "8d6626e38e2cfe12a673246e6279d25bf43c9c0c039523b83d251537c8facec498a2724eb04442f0bd04be32a8c37da3ff05d2b22f9443dc4b8a05f0fd77fb0e"

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
