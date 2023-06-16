SUMMARY = "Virtual Tape Library system"
DESCRIPTION = "A Virtual Tape & Library system. \
 \
This package is composed of a KMP (mhvtl), which is also a psuedo HBA."
LICENSE = "GPL-2.0-only"

PV = "1.70_release+865.af13081a1ae5"

RPM_NAME = "mhvtl-1.70_release+865.af13081a1ae5-2.23.aarch64.rpm"
RPM_HASH = "b023915c4dba44387bbf54365385fb823e70a53c5eb0c46cf35e3c1eea52f4b3b1e543768eae8565d02003f8a06325c857f70ae1bb96b53e6fbe393551eb2c8b"

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
