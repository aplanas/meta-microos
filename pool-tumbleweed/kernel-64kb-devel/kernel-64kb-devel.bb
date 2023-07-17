SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-64kb-devel-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "88275eca44c0e649711a2ecaadd7c6e0c2f3a1652aaa5b25b1a7e6ae40567f651d7504a201fea8fd297179e548c8c4d5db74f273984560cba66901ca652c1c06"

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
