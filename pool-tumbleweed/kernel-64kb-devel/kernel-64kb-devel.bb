SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-64kb-devel-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "f1d80abf05e0f25b42305f744bc048388c2c5f82855ccaa176c473d2877a1b3e345433338b665d82e4ccd6f3f1c9acfdc01fc645cfe19baf17700df9b0349d4b"

RPROVIDES:${PN} += "kernel-64kb-devel \
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
