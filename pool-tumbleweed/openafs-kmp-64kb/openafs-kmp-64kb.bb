SUMMARY = "OpenAFS Distributed File System - kernel module"
DESCRIPTION = "This package contains the kernel module for OpenAFS. For details see \
the openafs package."
LICENSE = "IPL-1.0"

PV = "1.8.10_k6.4.6_1"

RPM_NAME = "openafs-kmp-64kb-1.8.10_k6.4.6_1-1.4.aarch64.rpm"
RPM_HASH = "d9dfbf917dd7263a353d879d96c7d9f2d464e1c77923904315cf4ee287141608be61cc1ffbafdeb8b87070415dcc00149e7d3643ef745619eb23dcee5ff900a8"

RPROVIDES:${PN} += "kmod-afspag.ko \
kmod-libafs.ko \
multiversion-kernel \
openafs-kmp \
openafs-kmp-64kb \
openafs-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
kernel-64kb \
kernel-uname-r \
openafs-client \
suse-kernel-rpm-scriptlets"

inherit rpm
