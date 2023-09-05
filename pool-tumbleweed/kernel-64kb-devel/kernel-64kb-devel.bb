SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the 64kb flavor of the kernel. \
 \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-64kb-devel-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "ca8c2fdf62b0ab04d7d4b69bff9effeb5dcf381a3100e242268f1965397bb6350325dcbb4efde94a93a69dbaa4952c6571d4ab8e2615ced369a17d2b330f1372"

RPROVIDES:${PN} += "kernel-64kb-devel \
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
