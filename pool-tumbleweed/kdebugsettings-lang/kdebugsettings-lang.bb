SUMMARY = "Translations for package kdebugsettings"
DESCRIPTION = "Provides translations for the 'kdebugsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdebugsettings-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "b2f3b6a69ce498b78eb5751f6ebf88f78b78d1a640cba4254c788385ac4393ae5576d0866f832085add2c8414dd60415b7d1721d45a4d378b885ca4cbc09598f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebugsettings-lang \
kdebugsettings-lang-all \
locale-kdebugsettings-ar \
locale-kdebugsettings-az \
locale-kdebugsettings-ca \
locale-kdebugsettings-ca@valencia \
locale-kdebugsettings-cs \
locale-kdebugsettings-da \
locale-kdebugsettings-de \
locale-kdebugsettings-el \
locale-kdebugsettings-en-GB \
locale-kdebugsettings-es \
locale-kdebugsettings-et \
locale-kdebugsettings-eu \
locale-kdebugsettings-fi \
locale-kdebugsettings-fr \
locale-kdebugsettings-gl \
locale-kdebugsettings-hu \
locale-kdebugsettings-ia \
locale-kdebugsettings-it \
locale-kdebugsettings-ja \
locale-kdebugsettings-ka \
locale-kdebugsettings-ko \
locale-kdebugsettings-lt \
locale-kdebugsettings-nl \
locale-kdebugsettings-nn \
locale-kdebugsettings-pl \
locale-kdebugsettings-pt \
locale-kdebugsettings-pt-BR \
locale-kdebugsettings-ro \
locale-kdebugsettings-ru \
locale-kdebugsettings-sk \
locale-kdebugsettings-sl \
locale-kdebugsettings-sr \
locale-kdebugsettings-sr@ijekavian \
locale-kdebugsettings-sr@ijekavianlatin \
locale-kdebugsettings-sr@latin \
locale-kdebugsettings-sv \
locale-kdebugsettings-tr \
locale-kdebugsettings-uk \
locale-kdebugsettings-zh-CN \
locale-kdebugsettings-zh-TW"

RDEPENDS:${PN} += "kdebugsettings"

inherit rpm
