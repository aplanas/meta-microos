SUMMARY = "Main output plugins for libao"
DESCRIPTION = "This package contains the main output plugins for libao."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao-plugins4-1.2.2+git20180114.d522165-2.19.aarch64.rpm"
RPM_HASH = "dfab18634c423615cfab681102af82d8a9ce1326da6806f985f33dc8a152d80e86e1eb4187d2f61c098703270d3fa7b0acbee77fa1ce15cb0c6831476bf7a5a8"

RPROVIDES:${PN} += "libao-plugins4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
