SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.2_1"

RPM_NAME = "openafs-kmp-64kb-1.8.10_k6.4.2_1-1.1.aarch64.rpm"
RPM_HASH = "1a88b83cd95b914e4bc196b9d6e7de3f66ddc5b16ed1ceba57b2d8013700cd4c995086509eb703272341324e794003be8f25de6fdccad0f1178ac3eae7f9dfa7"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
