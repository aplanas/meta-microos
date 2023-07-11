SUMMARY = "Audio Streaming Server"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-2.4.4-2.10.aarch64.rpm"
RPM_HASH = "eb6a5bb54e13e87f6619c5d8ef2aeb8786fb11237dcdd72124a11597e69e6039c6cb456c32c0f5d8bbd8f34267ebe5dae2a60002290b37e661f631ea89a02aab"

RPROVIDES:${PN} += "config-icecast \
icecast"

RDEPENDS:${PN} += "/usr/bin/sh \
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
