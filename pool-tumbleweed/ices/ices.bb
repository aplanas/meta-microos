SUMMARY = "Source Client for icecast Streaming Server"
DESCRIPTION = "IceS is a source client for a streaming server. The purpose of this \
client is to provide an audio stream to a streaming server such that \
one or more listeners can access the stream.  With this layout, this \
source client can be situated remotely from the icecast server."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "ices-2.0.3-1.9.aarch64.rpm"
RPM_HASH = "b1a805b7771a6e86c9ba1b91f68d1dd6c7e365a6fb06b549c969759f60867eceaa4bc88844b8b5de5e7de405b26ac8fa04896e03e7f050985901f00436007fba"

RPROVIDES:${PN} += "ices"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
libshout.so.3 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libxml2.so.2"

inherit rpm
