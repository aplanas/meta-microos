SUMMARY = "X font handling library for server and utilities"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11."
LICENSE = "MIT"

PV = "2.0.6"

RPM_NAME = "libXfont2-2-2.0.6-1.5.aarch64.rpm"
RPM_HASH = "0ba4206b8e544838f40aa01f334d20b413316962e65d8abbfa1c49eaedd8cc0b0a02d924713176a63485ca2c042b84e4f9283fa6a01dea03548fb84f4033c62c"

RPROVIDES:${PN} += "libXfont2-2 \
libXfont2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
