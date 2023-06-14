SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ast-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "66e6998394d3a049286380f4fe8a14da8c73f90f9c8ef729e6692e9c3fffde87c5b48b7a49fd50411141bdaaa9246fb19ec152c96d3a585b1d9f04eab1215d0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
