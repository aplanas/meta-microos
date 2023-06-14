SUMMARY = "Devel Package for libheif"
DESCRIPTION = "libheif is a ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
This package contains the header files."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "libheif-devel-1.16.2-1.1.aarch64.rpm"
RPM_HASH = "e65aba814220e979c636ba5acfe72efbb611e081210ce3dc8d363211c304c78ea6ffed98a2683f8b4aac7c4814ed25dc4766b8d73bf62f0d12bf5af6836027cd"

RPROVIDES:${PN} += "cmake-libheif \
libheif-devel \
pkgconfig-libheif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libheif1 \
pkgconfig-aom \
pkgconfig-dav1d \
pkgconfig-libsharpyuv"

inherit rpm
