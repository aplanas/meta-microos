SUMMARY = "Documentation for FontForge"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains the documentation to FontForge."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-doc-20230101-1.3.noarch.rpm"
RPM_HASH = "8462077d2f896339092a4ec927ac0979052002289452eb47978e02bd15771b2d35aba95269be782bc714a8aea199b6d4c95e0a71420d581ef87cb39b54a57598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontforge-doc"
RDEPENDS:${PN} += ""

inherit rpm
