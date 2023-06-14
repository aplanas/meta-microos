SUMMARY = "Include Files and Libraries mandatory for Ogg Vorbis Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use libvorbis."
LICENSE = "BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "libvorbis-devel-1.3.7-4.1.aarch64.rpm"
RPM_HASH = "37475b83899a1d62ca3ac5363e0d6dfb89f192890be6208f6f7fe77f2c8c92b27f27b1b7974ddc31271028efb3d08795d8d5c48e7ed3aed7a547c85fd13ced48"

RPROVIDES:${PN} += "libvorbis-devel \
pkgconfig-vorbis \
pkgconfig-vorbisenc \
pkgconfig-vorbisfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libogg-devel \
libvorbis0 \
libvorbisenc2 \
libvorbisfile3 \
pkgconfig-ogg \
pkgconfig-vorbis"

inherit rpm
