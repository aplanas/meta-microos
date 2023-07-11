SUMMARY = "TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "freetype-1.3.1-1419.13.aarch64.rpm"
RPM_HASH = "9cc7340010ea8b480dd5a29c792a8fa79ab7c05b5991276cf6b1c6019246ac6e66c2f8d0611719cbb3d046a667b9e87f9f8975f98a4233049865e6644f65d1ac"

RPROVIDES:${PN} += "freetype"

RDEPENDS:${PN} += "fileutils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libm.so.6 \
libttf.so.2"

inherit rpm
