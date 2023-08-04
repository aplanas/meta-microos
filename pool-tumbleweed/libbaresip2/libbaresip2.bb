SUMMARY = "Standard library for baresip"
DESCRIPTION = "This package contains the shared library needed to run programs compiled with \
baresip"
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "libbaresip2-2.10.0-1.9.aarch64.rpm"
RPM_HASH = "7412470efabf4961541e44bd3f8e690b2d4b8cc9e1ff1b86ceec5f564fbf21f4a93ab6aeb52eab1414ad440f634fd89ee58334a2fb3929115efb297ed648c2c3"

RPROVIDES:${PN} += "baresip \
libbaresip.so.2 \
libbaresip2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libre.so.12 \
librem.so.4"

inherit rpm
