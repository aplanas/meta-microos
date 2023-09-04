SUMMARY = "Audio/Video real-time streaming"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "mediastreamer2-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "a6711a8df95eb607a8c1acc82c400fc825e16026510406a47925f0379fc90e8bf1e204f76e6a2266874b2dbc68e1fba82ffbc988452ac8d7c098fe8f744adbda"

RPROVIDES:${PN} += "mediastreamer2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libmediastreamer.so.11 \
libortp.so.15"

inherit rpm
