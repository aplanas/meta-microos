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

RPM_NAME = "libXfont-devel-1.5.4-2.25.aarch64.rpm"
RPM_HASH = "67d3ad7acc77a38a858e8753158d700fa0bf291f3c82b69695526441858d2efe033336c22d0ecf8bda5ebb972879faec5ba0c774e3e813a150871f52cae4b419"

RPROVIDES:${PN} += "libXfont-devel \
pkgconfig-xfont"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfont1 \
pkgconfig-fontenc \
pkgconfig-fontsproto \
pkgconfig-freetype2 \
pkgconfig-xproto"

inherit rpm
