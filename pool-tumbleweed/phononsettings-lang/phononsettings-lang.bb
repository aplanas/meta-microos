SUMMARY = "Translations for package phononsettings"
DESCRIPTION = "Provides translations for the 'phononsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phononsettings-lang-4.11.1-3.9.noarch.rpm"
RPM_HASH = "39cde4e38f55e7035d13f7d243333361b9bd5dc6b42c61ebcd49e417961d350e6077ebbabeebe4902702b55ea5fde4c408f58c02428e115f993a65603cb77b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phononsettings-ca \
locale-phononsettings-cs \
locale-phononsettings-de \
locale-phononsettings-en-GB \
locale-phononsettings-es \
locale-phononsettings-eu \
locale-phononsettings-fi \
locale-phononsettings-fr \
locale-phononsettings-id \
locale-phononsettings-it \
locale-phononsettings-ko \
locale-phononsettings-nl \
locale-phononsettings-nn \
locale-phononsettings-pl \
locale-phononsettings-pt \
locale-phononsettings-pt-BR \
locale-phononsettings-sk \
locale-phononsettings-sv \
locale-phononsettings-uk \
locale-phononsettings-zh-CN \
phononsettings-lang \
phononsettings-lang-all"

RDEPENDS:${PN} += "phononsettings"

inherit rpm
