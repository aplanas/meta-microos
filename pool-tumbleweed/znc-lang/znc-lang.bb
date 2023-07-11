SUMMARY = "Translations for package znc"
DESCRIPTION = "Provides translations for the 'znc' package."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-lang-1.8.2-3.8.noarch.rpm"
RPM_HASH = "b40b685bb226ab75e392fb62e9aa5082963dec9870086f36836ca4190a2f1dad1ab55b8762de525bc6204a321d6951748676daaa62dced9716b8522d7a72aca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-znc-de-DE \
locale-znc-el-GR \
locale-znc-es-ES \
locale-znc-fr-FR \
locale-znc-it-IT \
locale-znc-pl-PL \
locale-znc-pt-BR \
locale-znc-ru-RU \
znc-lang \
znc-lang-all"

RDEPENDS:${PN} += "znc"

inherit rpm
