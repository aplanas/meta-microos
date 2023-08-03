SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-es_AR-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "0fbf7f6ffd8847f67bc2a4400f9c146c9a2b93c2f06726736888617b17d5e35336308370957e92a029f7068884ffc394b773efb2e016487dc64aed5a67bfc5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
