SUMMARY = "Audio Decoding and Encoding Library"
DESCRIPTION = "libfishsound provides a programming interface for decoding and \
encoding audio data using the three Xiph.org codecs FLAC, Speex and \
Vorbis. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfishsound."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "libfishsound-devel-1.0.0-2.23.aarch64.rpm"
RPM_HASH = "9bf8f6c2e696bf80280b04edfffb052830b2c73469b5d148bbcb569d56b42c033535ba515fd5c222101e86267e59e4f5b1d9619497f7b83e9b34ef2efdca6f28"

RPROVIDES:${PN} += "libfishsound-devel \
pkgconfig-fishsound"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfishsound1 \
pkgconfig-flac \
pkgconfig-speex \
pkgconfig-vorbis \
pkgconfig-vorbisenc"

inherit rpm
