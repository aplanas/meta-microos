SUMMARY = "Ogg Vorbis Tools"
DESCRIPTION = "This package contains some tools for Ogg Vorbis: \
 \
oggenc (an encoder) and ogg123 (a playback tool). It also has vorbiscomment (to \
add comments to Vorbis files), ogginfo (to give all useful information about an \
Ogg file, including streams in it), oggdec (a simple command line decoder), and \
vcut (which allows you to cut up Vorbis files)."
LICENSE = "GPL-2.0-only"

PV = "1.4.2"

RPM_NAME = "vorbis-tools-1.4.2-1.11.aarch64.rpm"
RPM_HASH = "bdc105b36ab884f19c4702434c2ade989aadcddcd98c2149fe091ede5ad21a5ed8f8764465bba083d2d68ef4662ce75e915b26506653b790d175b8a63606081b"

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
