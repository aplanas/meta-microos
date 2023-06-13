SUMMARY = "TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "freetype-1.3.1-1419.12.aarch64.rpm"
RPM_HASH = "f2eebce1788a66e12a53be0801508bc3b9ec4a608f9f0833f09ce5dd0185d38df43e9fe563ef15cbc4aa00f36558c97b661049e8f76861b1de97d7f371e4ea51"

RPROVIDES:${PN} += "freetype \
freetype(aarch-64)"

RDEPENDS:${PN} += "fileutils \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libttf.so.2()(64bit)"

inherit rpm
