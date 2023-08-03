SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2837de0c4f77d9b356ede51fb2ac99c072728552d0761b4e8c9b05e85efc395263ce14ab54383d5720aba60bd72ecb772972cb4de684724a2d8dc913545c4378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
