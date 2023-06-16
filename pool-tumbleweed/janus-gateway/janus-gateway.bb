SUMMARY = "Janus WebRTC Gateway"
DESCRIPTION = "Janus is a general-purpose WebRTC gateway designed and developed \
by Meetecho."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "janus-gateway-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "b0ed6fdb1e133896f2901995e0aed651beb74dc4a9f1cd149c606509ac4ca0a8a41bc169bfc9adc2546e701a055ed64a819d1310a2814a836702e36f32f5a50c"

RPROVIDES:${PN} += "config-janus-gateway \
janus-gateway \
libjanus-audiobridge.so.0 \
libjanus-echotest.so.0 \
libjanus-gelfevh.so.0 \
libjanus-http.so.0 \
libjanus-mqtt.so.0 \
libjanus-mqttevh.so.0 \
libjanus-nosip.so.0 \
libjanus-pfunix.so.0 \
libjanus-recordplay.so.0 \
libjanus-sampleevh.so.0 \
libjanus-sip.so.0 \
libjanus-streaming.so.0 \
libjanus-textroom.so.0 \
libjanus-videocall.so.0 \
libjanus-videoroom.so.0 \
libjanus-voicemail.so.0 \
libjanus-websockets.so.0 \
libjanus-wsevh.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libconfig.so.11 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libm.so.6 \
libmicrohttpd.so.12 \
libnice.so.10 \
libogg.so.0 \
libopus.so.0 \
libpaho-mqtt3as.so.1 \
libsofia-sip-ua.so.0 \
libsrtp.so.1 \
libssl.so.3 \
libusrsctp.so.2 \
libwebsockets.so.19 \
libz.so.1 \
shadow"

inherit rpm
