SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-bs-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "78876108ae317519096e357e4ada098ed43cf0c136be6a51dd9fd746d331e610f0fc0eb5a275f7e1dd115b370d4e40aac89b75b1002357a9025827deacfef251"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
