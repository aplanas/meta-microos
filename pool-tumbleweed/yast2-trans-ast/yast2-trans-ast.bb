SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ast-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "621d5c482710d06a19607d71476e6560d306c770f924bb2b1ec930e3eec62744f61c2fe4291330479bef0177617cccfd0db31c6e0904745be3791f6a7b4654a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
