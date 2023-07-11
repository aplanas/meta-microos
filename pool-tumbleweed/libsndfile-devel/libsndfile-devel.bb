SUMMARY = "Development package for the libsndfile library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libsndfile library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "libsndfile-devel-1.2.0-2.2.aarch64.rpm"
RPM_HASH = "ad1e56524199f8ff518db0bde52ae04f223554b66f898f1b5d5a859c9c335b5b422af5e056a063d921db0edcf26e781963c16909c06b612a5aadbae04c786f0c"

RPROVIDES:${PN} += "cmake-SndFile \
libsndd \
libsndfile-devel \
pkgconfig-sndfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsndfile1 \
libstdc++-devel \
pkgconfig-flac \
pkgconfig-ogg \
pkgconfig-opus \
pkgconfig-speex \
pkgconfig-vorbis \
pkgconfig-vorbisenc"

inherit rpm
