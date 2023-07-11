SUMMARY = "A TV Streaming Server"
DESCRIPTION = "A TV streaming server supporting DVB-S, DVB-S2, DVB-C, DVB-T, ATSC, IPTV, \
and Analog video (V4L) as input sources. \
 \
It also comes with a web interface both used for configuration and \
day-to-day operations, such as searching the electronic program guide \
(EPG) and for scheduling recordings."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "4.2.8"

RPM_NAME = "tvheadend-4.2.8-6.13.aarch64.rpm"
RPM_HASH = "ffffe271887a8e07c913d383d2bbd58b810be302bb8d773dcfb5295b116ed4a0795de84dd7940942c8157fbe6dcf812fd49924d6b9f6c1276181aa5fd4538570"

RPROVIDES:${PN} += "tvheadend"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
