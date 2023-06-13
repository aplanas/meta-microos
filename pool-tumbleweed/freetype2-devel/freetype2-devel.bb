SUMMARY = "Development environment for the freetype2 TrueType font library"
DESCRIPTION = "This package contains all necessary include files, libraries and \
documentation needed to develop applications that require the freetype2 \
TrueType font library. \
 \
It also contains a small tutorial for using that library."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "freetype2-devel-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "1ac10fb8c044e8d0f707c46d255d5d9d965697dd6a1a5821aa8e5520c6c6a2a193e30d36c1f1f82d82d33287007bc631ab557b9f1980a93388bc9fa45cfbccbd"

RPROVIDES:${PN} += "freetype-devel \
freetype2-devel \
freetype2-devel(aarch-64) \
libfreetype6-devel-static \
pkgconfig(freetype2)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libfreetype6 \
pkgconfig(bzip2) \
pkgconfig(libbrotlidec) \
pkgconfig(zlib)"

inherit rpm
