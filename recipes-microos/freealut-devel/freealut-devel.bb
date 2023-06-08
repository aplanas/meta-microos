SUMMARY = "Static libraries, header files and tests for openal library"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of OpenGL - machine \
independent, cross platform, and data format neutral, with a clean, \
simple C-based API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "freealut-devel-1.1.0-237.20.aarch64.rpm"
RPM_HASH = "7ed8a6e73a2f87835eec9958f7d062aed34affc7db74d4855f4a455ce24406213b3e93a076e04a0b51f3df61b77861311b6f1442ee7a8f568fdf849ce8cbd1dc"

RPROVIDES:${PN} += "freealut-devel freealut-devel(aarch-64) pkgconfig(freealut)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config glibc-devel libalut0 pkgconfig(openal)"

inherit rpm
