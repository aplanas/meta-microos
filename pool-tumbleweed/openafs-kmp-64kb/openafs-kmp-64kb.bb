SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.11_1"

RPM_NAME = "openafs-kmp-64kb-1.8.10_k6.4.11_1-1.7.aarch64.rpm"
RPM_HASH = "a46c292c27b7252ce75011cc931483470eb9580d16c963dd8efa13ee85ecce6148bc0e4230b2fe532ce0fe0f7db8e1fc757313189e00d3a4c507ae120f0b0d38"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
