SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "libcaes1-20230406-2.1.aarch64.rpm"
RPM_HASH = "310391901477bbd18857cdfae91b866c95d3eec30b17b3f7362f306a573a0f0e4f962fc17dde31552941fcdf4ab52ce88a6657560c1c9d41a08dd66534059786"

RPROVIDES:${PN} += "libcaes.so.1 \
libcaes1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
