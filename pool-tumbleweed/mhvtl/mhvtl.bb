SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.71_release+903.d3ec98550dc3"

RPM_NAME = "mhvtl-1.71_release+903.d3ec98550dc3-1.4.aarch64.rpm"
RPM_HASH = "8662af9e9a86adb09bd96936c02b09482e39e28b4c2c55d21893cae5c607764dd0452be440458600e3cc2630dd32897d4f7a2a1665293725b6719ab3912e5fe5"

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
