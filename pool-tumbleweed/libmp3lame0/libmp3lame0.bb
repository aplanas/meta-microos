SUMMARY = "The LAME MP3 encoder library"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame0-3.100-5.4.aarch64.rpm"
RPM_HASH = "a031cd42b4dcbd16e0c607c606bb95011af41e6e8695bb5a532e2b8148cc0a10df4a7a755b672b6ce5ff949c052c1077d2b0f0ea012a0512591353313a7b48ff"

RPROVIDES:${PN} += "libmp3lame.so.0 \
libmp3lame0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
