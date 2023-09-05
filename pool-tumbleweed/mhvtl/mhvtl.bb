SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.71_release+903.d3ec98550dc3"

RPM_NAME = "mhvtl-1.71_release+903.d3ec98550dc3-1.5.aarch64.rpm"
RPM_HASH = "fa00b0f64f67fb811fad2b3b4713d7a8a90ebed03de9b451c3777adb32da0ccf3a865af0d833f8a99a5fefae2829ed100997dba347413037eb9507b8ba840361"

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
