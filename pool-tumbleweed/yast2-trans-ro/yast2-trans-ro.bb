SUMMARY = "YaST2 - Romanian Translations"
DESCRIPTION = "YaST2 - Translations for Romanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ro-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "4e67075cb91098ee1067652a461d07b5dc51dc6e85436e675ceb6db953aa4c9cd9423114f871f33a8faa2ba4a7f9155bc84e3a6f2d4ed2d282ce607d5d19df99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ro \
yast2-trans-ro"

RDEPENDS:${PN} += ""

inherit rpm
