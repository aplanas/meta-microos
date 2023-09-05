SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.12_1"

RPM_NAME = "openafs-kmp-default-1.8.10_k6.4.12_1-1.8.aarch64.rpm"
RPM_HASH = "b820ac0895b9f63888095e2db250536cbc2512cb30da3f5c759e253dfa70638795e4feb5611f20622ceea9f30bc44a85a3a3152f7b4049e582f4c35563e83151"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.4.12-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
