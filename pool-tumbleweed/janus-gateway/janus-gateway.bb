SUMMARY = "Janus WebRTC Gateway"
DESCRIPTION = "Janus is a general-purpose WebRTC gateway designed and developed \
by Meetecho."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "janus-gateway-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "b0ed6fdb1e133896f2901995e0aed651beb74dc4a9f1cd149c606509ac4ca0a8a41bc169bfc9adc2546e701a055ed64a819d1310a2814a836702e36f32f5a50c"

RPROVIDES:${PN} += "config(janus-gateway) \
janus-gateway \
janus-gateway(aarch-64) \
libjanus_audiobridge.so.0()(64bit) \
libjanus_echotest.so.0()(64bit) \
libjanus_gelfevh.so.0()(64bit) \
libjanus_http.so.0()(64bit) \
libjanus_mqtt.so.0()(64bit) \
libjanus_mqttevh.so.0()(64bit) \
libjanus_nosip.so.0()(64bit) \
libjanus_pfunix.so.0()(64bit) \
libjanus_recordplay.so.0()(64bit) \
libjanus_sampleevh.so.0()(64bit) \
libjanus_sip.so.0()(64bit) \
libjanus_streaming.so.0()(64bit) \
libjanus_textroom.so.0()(64bit) \
libjanus_videocall.so.0()(64bit) \
libjanus_videoroom.so.0()(64bit) \
libjanus_voicemail.so.0()(64bit) \
libjanus_websockets.so.0()(64bit) \
libjanus_wsevh.so.0()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libconfig.so.11()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjansson.so.4()(64bit) \
libm.so.6()(64bit) \
libmicrohttpd.so.12()(64bit) \
libnice.so.10()(64bit) \
libogg.so.0()(64bit) \
libopus.so.0()(64bit) \
libpaho-mqtt3as.so.1()(64bit) \
libsofia-sip-ua.so.0()(64bit) \
libsrtp.so.1()(64bit) \
libssl.so.3()(64bit) \
libusrsctp.so.2()(64bit) \
libwebsockets.so.19()(64bit) \
libz.so.1()(64bit) \
shadow"

inherit rpm
