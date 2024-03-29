SUMMARY = "Library for converting characters to X key-presses"
DESCRIPTION = "libfakekey is a simple library for converting UTF-8 characters into \
'fake' X key-presses."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3"

RPM_NAME = "libfakekey0-0.3-1.4.aarch64.rpm"
RPM_HASH = "33d7b98e67bdc1f248b38932857b922fb231f8aeb34b77e4a9989c22c8ceb5a6616a714d90d2784b52fe8416a13af40c6917fb32f6905eff246388aa8655cf94"

RPROVIDES:${PN} += "libfakekey.so.0 \
libfakekey0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6"

inherit rpm
