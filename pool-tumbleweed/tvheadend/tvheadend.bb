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

RPROVIDES:${PN} += "tvheadend \
tvheadend(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
group(video) \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavresample.so.4.0()(64bit) \
libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libm.so.6()(64bit) \
libssl.so.3()(64bit) \
liburiparser.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
