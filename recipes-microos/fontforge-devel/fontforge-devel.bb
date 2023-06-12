SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains all necessary include files and libraries needed \
to develop applications that use FontForge libraries."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-devel-20230101-1.3.aarch64.rpm"
RPM_HASH = "b3e434aadf98ecce158e88924493cb3ff3dbfed20e9ae3001e7414c0bbdc679a5e182e251dd6cd1d142c03d1cd004300d08c8466b968fcf5c9cc8f01a1c015d5"

RPROVIDES:${PN} += "fontforge-devel \
fontforge-devel(aarch-64)"
RDEPENDS:${PN} += "fontforge \
freetype2-devel"

inherit rpm
