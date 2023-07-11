SUMMARY = "Devel Package for libheif"
DESCRIPTION = "libheif is a ISO/IEC 23008-12:2017 HEIF file format decoder and encoder. \
This package contains the header files."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.2"

RPM_NAME = "libheif-devel-1.16.2-1.2.aarch64.rpm"
RPM_HASH = "50d1cc72404aa2f0f81ca431a9768b3559cc8913cf189c654455daea9530a281006e608ef928c8f2c5bb399f4cd8c0a84e31c1f93c39449a5b7d268927c06e69"

RPROVIDES:${PN} += "cmake-libheif \
libheif-devel \
pkgconfig-libheif"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libheif1 \
pkgconfig-aom \
pkgconfig-dav1d \
pkgconfig-libsharpyuv"

inherit rpm
