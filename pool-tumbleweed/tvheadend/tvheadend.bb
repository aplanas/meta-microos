SUMMARY = "A TV Streaming Server"
DESCRIPTION = "A TV streaming server supporting DVB-S, DVB-S2, DVB-C, DVB-T, ATSC, IPTV, \
and Analog video (V4L) as input sources. \
 \
It also comes with a web interface both used for configuration and \
day-to-day operations, such as searching the electronic program guide \
(EPG) and for scheduling recordings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "4.2.8"

RPM_NAME = "tvheadend-4.2.8-6.11.aarch64.rpm"
RPM_HASH = "d18d35d32c9c53c022e8b3cd0664eed22344bcc7ce708e70ec62a6597a5054a9fa7dbf6aece7211c4ecd86b865b72e075805679a5a554453d32ff6556ac2ae83"

RPROVIDES:${PN} += "tvheadend"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
group-video \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavcodec.so.58.134 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavresample.so.4.0 \
libavutil.so.56.70 \
libc.so.6 \
libcrypto.so.3 \
libdbus-1.so.3 \
libm.so.6 \
libssl.so.3 \
liburiparser.so.1 \
libz.so.1"

inherit rpm
