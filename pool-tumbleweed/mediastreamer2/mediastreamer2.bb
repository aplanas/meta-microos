SUMMARY = "Audio/Video real-time streaming"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "mediastreamer2-5.2.49-1.2.aarch64.rpm"
RPM_HASH = "f747ecbcc3182d3358a43c984598a995f2bb57dd4ab0fedb41b087631d5132b22ed5d57975722e117a28200b7240cdef08196737569ecb086ac500ac9c71f9b1"

RPROVIDES:${PN} += "mediastreamer2 \
mediastreamer2(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libc.so.6()(64bit) \
libmediastreamer.so.11()(64bit) \
libortp.so.15()(64bit)"

inherit rpm
