SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.3.4_1"

RPM_NAME = "openafs-kmp-default-1.8.9_k6.3.4_1-4.1.aarch64.rpm"
RPM_HASH = "eeb6062a60d18e9d2104d6c82ae65c0f55b6ade7937e8889359863681256843a6db36acd3837139721a5cf1f0516b1da1b3b713f5ab7a4506d6a60c23d1104db"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.3.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
