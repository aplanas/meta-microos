SUMMARY = "The LAME MP3 encoder library"
DESCRIPTION = "LAME is an encoder that converts audio to the MP3 file format. It has \
an improved psychoacoustic model and performs well in codec listening \
tests."
LICENSE = "LGPL-2.0-or-later"

PV = "3.100"

RPM_NAME = "libmp3lame0-3.100-5.3.aarch64.rpm"
RPM_HASH = "3c288b1b6b6904293d0f7fbea7ccf94f10c9a3b9d75212d1cee0698ccb3e1fcd06bca85ff11b3dc91e91ab794296991fdb5f8ad546d96619a58085406a95c278"

RPROVIDES:${PN} += "libmp3lame.so.0 \
libmp3lame0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
