SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libaa1-1.4.0-513.3.aarch64.rpm"
RPM_HASH = "4b2741871d4ce9a217187f8eb48a8ff8f9d6097cc8217570c4e6b0e1052470e81df72880d8835e07a86ff2891c392c81504e86e6791542566894b875bbbcfe7e"

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
