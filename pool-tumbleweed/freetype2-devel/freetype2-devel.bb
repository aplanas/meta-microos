SUMMARY = "Development environment for the freetype2 TrueType font library"
DESCRIPTION = "This package contains all necessary include files, libraries and \
documentation needed to develop applications that require the freetype2 \
TrueType font library. \
 \
It also contains a small tutorial for using that library."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.1"

RPM_NAME = "freetype2-devel-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "8ea931b74a8666bb0f48647193f2144a7c79cc5a82be314c232d1ba8aa44a735a868d50ec19af7b43c0ec931a4526aed3390f6fea37de28cc11c5dd1e5c2c371"

RPROVIDES:${PN} += "freetype-devel \
freetype2-devel \
libfreetype6-devel-static \
pkgconfig-freetype2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libfreetype6 \
pkgconfig-bzip2 \
pkgconfig-libbrotlidec \
pkgconfig-zlib"

inherit rpm
