SUMMARY = "YaST2 - Asturian Translations"
DESCRIPTION = "YaST2 - Translations for Asturian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ast-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "571e33a3bd2358fc59c9495b6a27b6dc83f0d822a3f3b2d0f7d770925d3d380548b146752a4cc2fe90d4331d58bd7a1866b01a093769b0600532768e167baa22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ast \
yast2-trans-ast"

RDEPENDS:${PN} += ""

inherit rpm
