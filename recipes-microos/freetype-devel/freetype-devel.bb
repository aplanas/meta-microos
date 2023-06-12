SUMMARY = "Development files for the TrueType Font Engine"
DESCRIPTION = "A library for working with TrueType Fonts. Documentation is in the \
/usr/share/doc/packages/freetype directory."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "freetype-devel-1.3.1-1419.12.aarch64.rpm"
RPM_HASH = "79ecb48cfd3f0f738f3e6704952fa550a74a4fcaa5df0fcc1285a75497213af4ee7022e7abf2351e91543f7c700809aa34179c4a0afd602cde974f95dbc11dbf"

RPROVIDES:${PN} += "freetype-devel \
freetype-devel(aarch-64)"
RDEPENDS:${PN} += "libttf2"

inherit rpm
