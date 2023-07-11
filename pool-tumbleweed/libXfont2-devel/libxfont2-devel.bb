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

RPM_NAME = "libXfont2-devel-2.0.6-1.5.aarch64.rpm"
RPM_HASH = "6ee9216fe9f90d6461eecccbf5ea0af543b8d511f597ec3762e5cb6101edcbd8b8582b2d9b71708f95bce9c494bcd3b3492b86c69228a031fdd007f7416a843d"

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
