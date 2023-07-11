SUMMARY = "Ogg Vorbis Tools"
DESCRIPTION = "This package contains some tools for Ogg Vorbis: \
 \
oggenc (an encoder) and ogg123 (a playback tool). It also has vorbiscomment (to \
add comments to Vorbis files), ogginfo (to give all useful information about an \
Ogg file, including streams in it), oggdec (a simple command line decoder), and \
vcut (which allows you to cut up Vorbis files)."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "vorbis-tools-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "f951067f529fd4ad3b28f6928d62023000c5806d77db7dc04901061fe5829d2a0d9df06c5e31cd19fd453d008ee9cf0929b5e617838bbf1ee8de8cc720fae09e"

RPROVIDES:${PN} += "vorbis-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libao.so.4 \
libc.so.6 \
libcurl.so.4 \
libkate.so.1 \
libm.so.6 \
libogg.so.0 \
liboggkate.so.1 \
libspeex.so.1 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3"

inherit rpm
