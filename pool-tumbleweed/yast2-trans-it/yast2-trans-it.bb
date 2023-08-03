SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-it-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d93703d96ca076cd54ff7b0dd1494ac3d35a4b55c1678801ec01db3c06b33b4a50537c02961ef69d31ed331900c057291e8b55d719009afc06df75bab552a44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-it \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
