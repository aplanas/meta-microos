SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.71_release+903.d3ec98550dc3"

RPM_NAME = "mhvtl-1.71_release+903.d3ec98550dc3-1.1.aarch64.rpm"
RPM_HASH = "4863dbb788acbeb87a02fb5cfb022e7d58348f1f5edac9ed77cca1b62507002253353ec4592ec8d8230cb10996b569267cf8f053d5c0b2cdd26f895cea642e64"

RPROVIDES:${PN} += "config-mhvtl \
firmware-mhvtl/mhvtl-kernel.tgz \
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
