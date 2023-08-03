SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-bs-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "b57a33e99101d5b8ab2bcc9343813502ad4074b06f6569ba488fa7acbcb32f61f4e316b5c96c756d5394682a396118225082d0561ab89e8b9e80e2622f2925b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
