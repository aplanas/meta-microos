SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ast-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "879ed4d75cc9b5407de32a3a2e15196d685ab2dce872535ba45b6e266e318d18c1049f39b7408c3c52be370975168d756654ec6099bb9d983a7f62ca830445f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
