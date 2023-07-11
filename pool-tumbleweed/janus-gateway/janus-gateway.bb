SUMMARY = "Janus WebRTC Gateway"
DESCRIPTION = "Janus is a general-purpose WebRTC gateway designed and developed \
by Meetecho."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "janus-gateway-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "596cc3e762122ee65d685af08622bca8f71335ddb83abfb36975fde44e4f01f15e01740a3a4d3a9f8c98a22b884b521c940f9956748a8aebacd968847dfc3869"

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
