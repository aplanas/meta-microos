SUMMARY = "Development files necessary for building kernel modules"
DESCRIPTION = "This package contains files necessary for building kernel modules (and \
kernel module packages) against the kvmsmall flavor of the kernel. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-kvmsmall-devel-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "8a337b1e1ef33081d3d391285c0684cc55546180a9c1c108cf87a14a7c9e88a662cfd49f047ec74d62ab21c9f3124738eb7fe5be92d2f7e9844ac5b7be65828a"

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
