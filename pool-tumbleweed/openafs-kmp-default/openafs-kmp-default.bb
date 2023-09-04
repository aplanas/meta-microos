SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.11_1"

RPM_NAME = "openafs-kmp-default-1.8.10_k6.4.11_1-1.7.aarch64.rpm"
RPM_HASH = "546d71d0db055912bfefc3ccd3e4dfb8d63f328389c341f9b304e8f2d32deb05de7fba554206edc311031f4e9c6dfe8c84c2e3891ad1b8c029fefe9eef86954c"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-default \
openafs-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-default \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
