SUMMARY = "Library for communicating with Icecast servers"
DESCRIPTION = "libshout is a library for communicating with and sending data to an \
Icecast server. It handles the socket connection, the timing of the \
data, and prevents bad data from getting to the Icecast server."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.6"

RPM_NAME = "libshout3-2.4.6-1.5.aarch64.rpm"
RPM_HASH = "3051cdcf66e2026433271eef17110148956c13a485dfe872ab7d0375d0687273ccea32460820fd9805537ad51c4cc2d5a365885b116d6065406fd97e628fa4be"

RPROVIDES:${PN} += "libshout.so.3 \
libshout3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0 \
libspeex.so.1 \
libtheora.so.0 \
libvorbis.so.0"

inherit rpm
