SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.3.4_1"

RPM_NAME = "openafs-kmp-64kb-1.8.9_k6.3.4_1-4.1.aarch64.rpm"
RPM_HASH = "103794317e07e59f615f614166021b6aab250c1a385da6b2c29597000510545bca3289369620c89439d5d74601a609cd29c5c2d1ad134b978f934d81356e74a1"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.3.4-1"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
