SUMMARY = "Audio/Video real-time streaming"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "mediastreamer2-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "a08bf6d2a74c5aabda4f14f92cd8ba0f12d6cf0adc02f44a86cd82a6d9b8b77986dc5b1e4ce7e8ff7e599463e4cf863afadf0217350e8eb1d6b619307918e46b"

RPROVIDES:${PN} += "mediastreamer2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libmediastreamer.so.11 \
libortp.so.15"

inherit rpm
