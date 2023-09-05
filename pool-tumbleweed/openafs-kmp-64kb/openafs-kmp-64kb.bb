SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.12_1"

RPM_NAME = "openafs-kmp-64kb-1.8.10_k6.4.12_1-1.8.aarch64.rpm"
RPM_HASH = "1af109f5ea37c85ea2b552e49d7e19422e6edf25b102a2fbd2a53516b98638e604a9602a25bfa3df342ea41aadf009b592525a46335eab05cdc1fdc542f350cc"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.4.12-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
