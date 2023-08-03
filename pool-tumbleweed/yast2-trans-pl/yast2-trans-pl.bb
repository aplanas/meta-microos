SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-pl-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "0e0b72ed695d3d37391852a8dc0184bb39fc1007f7ba049a15292415ea209de7dc1deb9b9a41079c1e537d1ace7a3681e9e99183d683d80065a94c2909a3cf63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
