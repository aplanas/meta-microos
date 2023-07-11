SUMMARY = "Multilingual Text Processing Library for the C Language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains m17n-* programs."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "m17n-lib-1.8.0-1.13.aarch64.rpm"
RPM_HASH = "4d522a6f3cfb158b16ec2711234a264df6f25fb5a959095a1850e5cc7a6929a2b11638dacab5a82db742f5f9216cb3ee5f15208d2e1f7769c08b98ca4de3a6cb"

RPROVIDES:${PN} += "m17n-lib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libgd.so.3 \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libm17n-gui.so.0 \
libm17n.so.0"

inherit rpm
