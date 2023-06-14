SUMMARY = "Source Client for icecast Streaming Server"
DESCRIPTION = "IceS is a source client for a streaming server. The purpose of this \
client is to provide an audio stream to a streaming server such that \
one or more listeners can access the stream.  With this layout, this \
source client can be situated remotely from the icecast server."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "ices-2.0.3-1.8.aarch64.rpm"
RPM_HASH = "da6912bc30c29e4392d1a561494696a9ba43a974133b770ac8f93818e79aa79585448c582ce54fc46975786eec6226f2c6e81ace15c203f48903af5080a15ada"

RPROVIDES:${PN} += "ices"

RDEPENDS:${PN} += "/bin/sh \
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
