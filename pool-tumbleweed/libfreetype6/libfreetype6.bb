SUMMARY = "A TrueType Font Library"
DESCRIPTION = "This library features TrueType fonts for open source projects. This \
version also contains an autohinter for producing improved output."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.13.1"

RPM_NAME = "libfreetype6-2.13.1-1.1.aarch64.rpm"
RPM_HASH = "ca90c529eae02021cfe9ecd665a4240ba56c5c081c192fb37f029d7d7c87de5281fb88d4572a344d1991f5f2de20c05eba62d0e048c6008b87c2bd77180025d4"

RPROVIDES:${PN} += "freetype2 \
libfreetype.so.6 \
libfreetype6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbz2.so.1 \
libc.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
