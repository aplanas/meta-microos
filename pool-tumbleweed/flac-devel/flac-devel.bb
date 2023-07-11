SUMMARY = "FLAC Library Development Package"
DESCRIPTION = "This package contains the files needed to compile programs that use \
the FLAC library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.3"

RPM_NAME = "flac-devel-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "34c21a3d2d9f5040a1321b9ad6668ef61ecbdad61151cc9772fa33c024d2e71c8eb26a7ae55389b27cb7578f24bdee466014e1e7a0d59e035d96f4c88d1221f9"

RPROVIDES:${PN} += "flac-devel \
pkgconfig-flac \
pkgconfig-flac++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libFLAC++10 \
libFLAC12 \
libstdc++-devel \
pkgconfig-flac \
pkgconfig-ogg"

inherit rpm
