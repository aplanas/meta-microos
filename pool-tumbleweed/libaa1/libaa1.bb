SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libaa1-1.4.0-513.3.aarch64.rpm"
RPM_HASH = "4b2741871d4ce9a217187f8eb48a8ff8f9d6097cc8217570c4e6b0e1052470e81df72880d8835e07a86ff2891c392c81504e86e6791542566894b875bbbcfe7e"

RPROVIDES:${PN} += "libaa.so.1()(64bit) \
libaa1 \
libaa1(aarch-64) \
libvga.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgpm.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
