SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-default-devel-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "42538202c1fec4ce61cd8195c271ad40516fe5c5e96da5365cdea734840dab0cc7d104454469dd3f796eed9ccb78c837970336fdbe1abf57a9ef5cfca3519deb"

RPROVIDES:${PN} += "kernel-default-devel \
kernel-preempt-devel \
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
