SUMMARY = "An ASCII Art Library"
DESCRIPTION = "AA-lib is a low level gfx library. AA-lib does not require a graphics \
device. In fact, there is no graphical output possible. AA-lib replaces \
old-fashioned output methods with a powerful ASCII art renderer."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "aalib-1.4.0-513.3.aarch64.rpm"
RPM_HASH = "54bee63310ee9f63e4c034c4db950b82d65b4bb5cf2f2efb7daad35d62e2cea946fca512359944bb00fadb343b705a00032ee2b2539f9a67cfdfd41453e1b31e"

RPROVIDES:${PN} += "aalib \
aalib(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libaa.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
