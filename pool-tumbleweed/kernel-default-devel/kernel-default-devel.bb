SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the default flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-default-devel-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "1ed5390be6b4fd799b9b2f3cf793c9acd6f4bd8bba6fd1314f30a8e048d788ba41353e7240f92d13b8a28fefaf5c37e885afefea237d5fc95b690da286b94b0b"

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
