SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.70_release+865.af13081a1ae5"

RPM_NAME = "mhvtl-1.70_release+865.af13081a1ae5-2.29.aarch64.rpm"
RPM_HASH = "b321098decef706b0a9120149b40d9722458383c6241240302329ce3c82ddd6870286a35cdc1313fa8f876c4e9d4a9289c2fd98b96be2dee0f6dfe23f79a662e"

RPROVIDES:${PN} += "config-mhvtl \
libvtlcart.so \
libvtlscsi.so \
mhvtl"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
mhvtl-kmp \
module-init-tools \
sg3-utils"

inherit rpm
