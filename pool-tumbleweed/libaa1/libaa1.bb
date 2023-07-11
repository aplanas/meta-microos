SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libaa1-1.4.0-513.4.aarch64.rpm"
RPM_HASH = "0502da9fa0d078a21a0738bcd6cae4b1b1ed5c62318df6385d5533a0dc6bf1f70e403a895f5332b50c932896ef2d595599059b88ddabf1273e52029b5df243ab"

RPROVIDES:${PN} += "libaa.so.1 \
libaa1 \
libvga.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgpm.so.2 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
