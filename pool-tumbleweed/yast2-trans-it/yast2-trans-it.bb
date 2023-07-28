SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-it-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "ef155bac3fb3ff07aa9ce136520334bb3fd1a348a281e0af4275addf98e8c7ab67df596bac764f1ff9003e03d51c733ddff617e333eff59de14ecb82eb2535d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
