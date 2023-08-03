SUMMARY = "A Wayland terminal emulator"
DESCRIPTION = "A Wayland terminal emulator."
LICENSE = "MIT"

PV = "1.15.2"

RPM_NAME = "foot-1.15.2-1.1.aarch64.rpm"
RPM_HASH = "4c559ecf5c2fd3feea8ccc60b3fc6b58f044a0429718b5182a00277be10349ed633ea58647721ef6bb6160f1bdbd67273639aa300b7fd07398445ce9e4fe2645"

RPROVIDES:${PN} += "foot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfcft.so.4 \
libfontconfig.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libutf8proc.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0 \
terminfo \
utempter"

inherit rpm
