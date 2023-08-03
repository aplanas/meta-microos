SUMMARY = "Translations for package viewnior"
DESCRIPTION = "Provides translations for the 'viewnior' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "viewnior-lang-1.8-2.1.noarch.rpm"
RPM_HASH = "70f4fc881be8fe78903a4fcfff43ec592ce29bf923919a9d93629ca1b320e61a82e72ea721ce1516a90b253e608f403d9b3ca347be15c35b33b67f5b16ad1355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-viewnior-ar \
locale-viewnior-bg \
locale-viewnior-bs \
locale-viewnior-ca \
locale-viewnior-ca@valencia \
locale-viewnior-cs \
locale-viewnior-da \
locale-viewnior-de \
locale-viewnior-el \
locale-viewnior-en-GB \
locale-viewnior-es \
locale-viewnior-fi \
locale-viewnior-fr \
locale-viewnior-gl \
locale-viewnior-he \
locale-viewnior-hu \
locale-viewnior-it \
locale-viewnior-ja \
locale-viewnior-lt \
locale-viewnior-nb-NO \
locale-viewnior-nl \
locale-viewnior-oc \
locale-viewnior-pl \
locale-viewnior-pt \
locale-viewnior-pt-BR \
locale-viewnior-ru \
locale-viewnior-sk \
locale-viewnior-sr \
locale-viewnior-sv \
locale-viewnior-tr \
locale-viewnior-uk \
locale-viewnior-zh-CN \
locale-viewnior-zh-TW \
viewnior-lang \
viewnior-lang-all"

RDEPENDS:${PN} += "viewnior"

inherit rpm
