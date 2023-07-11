SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains all necessary include files and libraries needed \
to develop applications that use FontForge libraries."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-devel-20230101-1.4.aarch64.rpm"
RPM_HASH = "2d247d6af446de54ef1880395cd65a2370a37bb9fd18a904b2d2141a5a0ac9958855931a0c11264c5ac24a96da3c69675d6b48df68b9aeb2e21bc958474ab7d0"

RPROVIDES:${PN} += "fontforge-devel"

RDEPENDS:${PN} += "fontforge \
freetype2-devel"

inherit rpm
