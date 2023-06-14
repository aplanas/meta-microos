SUMMARY = "Audio Streaming Server"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-2.4.4-2.9.aarch64.rpm"
RPM_HASH = "6ee8af9e805b3f3f419a2d3cf2ca0218105efee26bda82a7de810e5d68d5f8cb24e666177729cbb5f02531c6ea733da32e5c41bbabd9e9567472da1fea16bab5"

RPROVIDES:${PN} += "config-icecast \
icecast"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libogg.so.0 \
libspeex.so.1 \
libssl.so.3 \
libtheora.so.0 \
libvorbis.so.0 \
libxml2.so.2 \
libxslt.so.1 \
shadow \
systemd"

inherit rpm
