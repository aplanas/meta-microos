SUMMARY = "Development files for the X font handling library"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11. \
 \
This package contains the development headers for the library found \
in libXfont2-2."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "libXfont2-devel-2.0.6-1.4.aarch64.rpm"
RPM_HASH = "431a718292345ba9c6c3b98e7592c3d39e62aaa33eab6b3e9f318a94e18224ec28f688d1cb850707886039317626a8dc09067880483c1ef705a6ccc1e068420e"

RPROVIDES:${PN} += "libXfont2-devel \
pkgconfig-xfont2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfont2-2 \
pkgconfig-fontenc \
pkgconfig-fontsproto \
pkgconfig-freetype2 \
pkgconfig-xproto \
pkgconfig-zlib"

inherit rpm
