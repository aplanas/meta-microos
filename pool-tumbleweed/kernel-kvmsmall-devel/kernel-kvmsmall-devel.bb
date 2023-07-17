SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-10 10:03:25 +0000 \
GIT Revision: b97b89494481f3409297e494e466bdd42b1311ab \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "kernel-kvmsmall-devel-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "94ed6e1b225a1d358c2944de9c902f6fee1a01f2a8bdbdd8473db852dc1f7039edd6fa08a29016477f495d59b4dbc7c8fb53b2156936604da04f7b4faed7bebe"

RPROVIDES:${PN} += "kernel-kvmsmall-devel \
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
