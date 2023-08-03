SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-fr-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "8a4dbacdd048be042506480895256913acf72ae59f8d84318b336a030c82e09ce9fce2640333b412ce84f0b6cbecd81be11c5f136e191de7151b17f0dd582d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fr \
yast2-trans-fr"

RDEPENDS:${PN} += ""

inherit rpm
