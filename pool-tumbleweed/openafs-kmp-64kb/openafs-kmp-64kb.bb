SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.3_1"

RPM_NAME = "openafs-kmp-64kb-1.8.10_k6.4.3_1-1.2.aarch64.rpm"
RPM_HASH = "7c12579c58fd750f20cbe16d74883f77a83b4f8b3761c7d3450a458ea6f650a5c7192849abd4307e4a3d64851fc23b846e4a096c81d95109eb98480693705751"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
