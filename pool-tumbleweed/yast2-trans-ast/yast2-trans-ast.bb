SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ast-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "02e55291a38dbcec53e3cef7507bad3c90540f933b7219bc9d574796d3311c9bc01e2f9b9fc7617b4a6ed791d8da847a485b7d3742db3893f74a6450d3597344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
