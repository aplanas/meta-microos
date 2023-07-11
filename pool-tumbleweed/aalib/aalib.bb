SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-1.4.0-513.4.aarch64.rpm"
RPM_HASH = "2838ed514c2df811773bb986b227a049273d9b348a7afa4896cad068b50caf77c4fbefd16cffcb800b196a09c73e836d9d490b763fdd5293084deb2d6e327c6d"

RPROVIDES:${PN} += "aalib"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaa.so.1 \
libc.so.6"

inherit rpm
