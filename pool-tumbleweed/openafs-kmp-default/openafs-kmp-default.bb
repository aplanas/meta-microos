SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.3.9_1"

RPM_NAME = "openafs-kmp-default-1.8.9_k6.3.9_1-4.6.aarch64.rpm"
RPM_HASH = "42a976eb14c43dd34c2fd1ebd8f7dc569ab7c7f8092fa9c82b9cce1aa12b301114fb670ff35c4b77e2b5e017585f0b732bec8f9a6619152718ffb93693050b74"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
