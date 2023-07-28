SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-lt-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "206cd224fc87212a305df7f36682fc1c9559c4edaf8f1c6d50cccee7452a30cadd2b28139505bdf7f96283c851536adffa595e159dd5fc5ab5fb3c03ccc6916c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lt \
yast2-trans-lt"

RDEPENDS:${PN} += ""

inherit rpm
