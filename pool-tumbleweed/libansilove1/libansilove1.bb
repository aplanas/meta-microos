SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images."
LICENSE = "BSD-2-Clause"

PV = "1.3.1"

RPM_NAME = "libansilove1-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "10e082d140580d7e0b7bce56e915d41fb64e66a9627bd17cadc35987ca53d08670b5bb06c0dff2476291217834c47fef51de53d5dcd37eeba1ba78a5abeefc0e"

RPROVIDES:${PN} += "libansilove.so.1()(64bit) \
libansilove1 \
libansilove1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgd.so.3()(64bit)"

inherit rpm
