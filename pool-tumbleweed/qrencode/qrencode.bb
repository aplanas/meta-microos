SUMMARY = "C library for encoding data in a QR Code symbol"
DESCRIPTION = "Libqrencode is a C library for encoding data in a QR Code symbol, a kind of 2D \
symbology that can be scanned by handy terminals such as a mobile phone with \
CCD. The capacity of QR Code is up to 7000 digits or 4000 characters, and is \
highly robust."
LICENSE = "LGPL-2.1-or-later"

PV = "4.1.1"

RPM_NAME = "qrencode-4.1.1-1.11.aarch64.rpm"
RPM_HASH = "859d40c82126485aa4d275fb05b8258f9e54896295d06f97d1e9526336d6c40403c0c16cbee9f7c10005ba3659788d3732c96c9d092070ba27e27d62eb9cf3b4"

RPROVIDES:${PN} += "qrencode \
qrencode(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libqrencode.so.4()(64bit)"

inherit rpm
