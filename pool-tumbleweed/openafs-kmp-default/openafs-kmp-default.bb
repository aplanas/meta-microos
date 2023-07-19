SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.3_1"

RPM_NAME = "openafs-kmp-default-1.8.10_k6.4.3_1-1.2.aarch64.rpm"
RPM_HASH = "db1da3af1ee64bfc1dcee378cac508119c4f7f60e9195f77d50da1120729a7e38b3cae175d74ff7b81efc97562e01a5a894d7d63ceaa3d2da80d6005c93e08e3"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
