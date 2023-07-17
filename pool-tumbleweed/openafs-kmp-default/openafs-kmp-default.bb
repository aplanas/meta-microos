SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.2_1"

RPM_NAME = "openafs-kmp-default-1.8.10_k6.4.2_1-1.1.aarch64.rpm"
RPM_HASH = "cd8fb55478a20598bab53d9bdd53182a99fc21f55c42aaa9ace6ebd61017acad10b5f5b915b8f14b41a5d0b70892aaf1499b083c676f1157bf22b7af9a90c186"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
