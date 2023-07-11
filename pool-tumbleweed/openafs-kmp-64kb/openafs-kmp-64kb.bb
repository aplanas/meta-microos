SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.9_k6.3.9_1"

RPM_NAME = "openafs-kmp-64kb-1.8.9_k6.3.9_1-4.6.aarch64.rpm"
RPM_HASH = "74da9ab669f8d13590c53a23e573a2536791f80d40f53923bcda1bbb4a8e2280c6cb1e10b2c0f50e11cc9add2397301b4d6404393a44af43454dd193e5b28516"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
