SUMMARY = "Wrapper library for audio decoding and encoding"
DESCRIPTION = "libfishsound provides a programming interface for decoding and \
encoding audio data using the three Xiph.org codecs FLAC, Speex and \
Vorbis. \
 \
libfishsound can handle raw codec streams from a lower level layer \
such as UDP datagrams. When these codecs are used in files, they are \
commonly encapsulated in Ogg to produce Ogg FLAC, Speex and Ogg \
Vorbis files. \
 \
libfishsound is a wrapper around the existing codec libraries and \
provides a higher-level programming interface. It has no direct \
dependencies on Ogg encapsulation, though it is most commonly used in \
conjunction with liboggz to decode or encode audio tracks in Ogg \
files, including Ogg Theora and Annodex."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "libfishsound1-1.0.0-2.23.aarch64.rpm"
RPM_HASH = "e174764032967e613b0fd122ed4c6040f1feb7971d6a316f50f2e3f304b545d0c8320d3dfefd0ac0841ddf08dd856df6c6b48611e166dae0eb79d40dbbaac74a"

RPROVIDES:${PN} += "libfishsound.so.1()(64bit) \
libfishsound1 \
libfishsound1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libc.so.6()(64bit) \
libspeex.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit)"

inherit rpm
