SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "framel-8.42.3-1.5.aarch64.rpm"
RPM_HASH = "69b7f81739199abd89ac614086bbbf2c8708e7cea741aab50fa34d6a7c1fdf29fa3953de93cbaee70b0e4e4e864fb9cfa4ccfdb53cc78eb811100be7fdecbd77"

RPROVIDES:${PN} += "framel \
python2-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libm.so.6"

inherit rpm
