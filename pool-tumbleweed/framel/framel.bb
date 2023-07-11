SUMMARY = "Library to manipulate Gravitational Wave Detector data in frame format"
DESCRIPTION = "A Common Data Frame Format for Interferometric Gravitational Wave Detector has \
been developed by VIRGO and LIGO. The Frame Library is a software in C \
language, with interfaces to python and matlab, dedicated to frame data \
manipulation including file input/output."
LICENSE = "LGPL-2.1-or-later"

PV = "8.42.3"

RPM_NAME = "framel-8.42.3-1.6.aarch64.rpm"
RPM_HASH = "ad3fb4be5871a2a6495f5987b29a58ba9fb3844e857aaa828c3b3a6d2e80ea907cac7569de518ffba19d57809a59a1051dca3f111a3ae1facc4ae49fa770abaf"

RPROVIDES:${PN} += "framel \
python2-framel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libframel.so.8 \
libm.so.6"

inherit rpm
