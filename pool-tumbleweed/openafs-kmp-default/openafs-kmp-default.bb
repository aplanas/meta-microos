SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.6_1"

RPM_NAME = "openafs-kmp-default-1.8.10_k6.4.6_1-1.4.aarch64.rpm"
RPM_HASH = "b6089e856bf45079ce9e311c3a297c4ba74db61d090453e6eccee56c38a9700c448a718a22c03b20e2261f998e8855132da819a4a768cde09ed2529104a35da8"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
