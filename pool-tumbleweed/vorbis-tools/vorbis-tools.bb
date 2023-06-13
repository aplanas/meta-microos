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

RPROVIDES:${PN} += "vorbis-tools \
vorbis-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libao.so.4()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libkate.so.1()(64bit) \
libm.so.6()(64bit) \
libogg.so.0()(64bit) \
liboggkate.so.1()(64bit) \
libspeex.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
