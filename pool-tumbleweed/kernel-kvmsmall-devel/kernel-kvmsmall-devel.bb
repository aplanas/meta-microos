SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-kvmsmall-devel-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "cede33987239201e49bf9b2dbafe65cafadb3bde911ee838ff40366c3cc5928c26856c7971ca902cc1a21e3df79cbb4a85ea9a7f0caa5daed47cb7bf1c438dd7"

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
