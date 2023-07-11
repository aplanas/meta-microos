SUMMARY = "X font handling library for server and utilities"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "libXfont1-1.5.4-2.25.aarch64.rpm"
RPM_HASH = "2b3e731cefbcc10a59946b6ca2bad55c5eb434cf89ce5eb673a2489246b96a2b46ff5af5c13dab9b9734bbce28957ed35603d8d79442d04039efb71734e53c8b"

RPROVIDES:${PN} += "libXfont.so.1 \
libXfont1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
