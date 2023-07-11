SUMMARY = "Documentation for FontForge"
DESCRIPTION = "FontForge allows editing of outline and bitmap fonts. With it, you can \
create new fonts or modify old ones. It also converts font formats and \
can convert among PostScript, TrueType, OpenType, and CID-keyed fonts. \
 \
This subpackage contains the documentation to FontForge."
LICENSE = "GPL-3.0-or-later"

PV = "20230101"

RPM_NAME = "fontforge-doc-20230101-1.4.noarch.rpm"
RPM_HASH = "1077b59a7d1072c9462300b1b743e746e4c2ae6e0cf09cd4d2a5daa88936e6d59d5f9b21eb8e45f7f28bbc155532367fe83a1bd06a1ed59b83ec9043989491a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontforge-doc"

RDEPENDS:${PN} += ""

inherit rpm
