SUMMARY = "A reimplementation of the XNA Game Studio libraries"
DESCRIPTION = "FNA is a reimplementation of the Microsoft XNA Game Studio 4.0 Refresh libraries."
LICENSE = "Zlib"

PV = "23.03"

RPM_NAME = "libFAudio0-23.03-1.4.aarch64.rpm"
RPM_HASH = "e2f3ce74f6d4684726dd79ba92d5cef258d8fa2415f659c73498b1d71be69c190fad40918feba555c9725a5ac9e9df835424b2b02fc60545d1eb37f19371ad49"

RPROVIDES:${PN} += "libFAudio.so.0 \
libFAudio0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6"

inherit rpm
