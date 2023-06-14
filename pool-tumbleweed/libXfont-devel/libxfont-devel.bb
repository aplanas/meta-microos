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
in libXfont1."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "libXfont-devel-1.5.4-2.24.aarch64.rpm"
RPM_HASH = "82e6778e0aee67d86a5ade6439a125d35f0afd4e50d2b938451db497a6b4238140e05d85a75ae4a4d75a5cacbb07296a6606356c08d2c84291f51ffc36242152"

RPROVIDES:${PN} += "libXfont-devel \
pkgconfig-xfont"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfont1 \
pkgconfig-fontenc \
pkgconfig-fontsproto \
pkgconfig-freetype2 \
pkgconfig-xproto"

inherit rpm
