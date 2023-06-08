SUMMARY = "Development environment for the freetype2 TrueType font library"
DESCRIPTION = "This package contains all necessary include files, libraries and \
documentation needed to develop applications that require the freetype2 \
TrueType font library. \
 \
It also contains a small tutorial for using that library."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.0"

RPM_NAME = "freetype2-devel-2.13.0-3.1.aarch64.rpm"
RPM_HASH = "0b68033f682bb0515a648798b39a85d183f0c2088c6f4d88eb8ef48abb9a4aa504f19a927ed026f2d6c337db908cff763d1678dd2cf63aa151798e9ae14b1e17"

RPROVIDES:${PN} += "freetype-devel freetype2-devel freetype2-devel(aarch-64) libfreetype6-devel-static pkgconfig(freetype2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config libfreetype6 pkgconfig(bzip2) pkgconfig(libbrotlidec) pkgconfig(zlib)"

inherit rpm
