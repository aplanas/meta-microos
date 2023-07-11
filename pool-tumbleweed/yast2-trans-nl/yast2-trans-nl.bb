SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-nl-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "36525edf36cd9ece17abe780bb1a411c7307e273fa840924a02a59e388fed5ba11e66c7339bd083a74473df28190bb53ef84c88d1c7c24856fb4ef002882d8db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nl \
yast2-trans-nl"

RDEPENDS:${PN} += ""

inherit rpm
