SUMMARY = "Translations for package phononsettings"
DESCRIPTION = "Provides translations for the 'phononsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "phononsettings-lang-4.11.1-3.10.noarch.rpm"
RPM_HASH = "ca4a8d011492ad000b95ee3e5e1811e97bd7a7bebde30d41e610e90809d7fd7484072f984fe484ae49b2712100af3f6dc36cfdd05ec9012821749178248a6d76"
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
