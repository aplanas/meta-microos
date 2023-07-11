SUMMARY = "Translations for package skanlite"
DESCRIPTION = "Provides translations for the 'skanlite' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "skanlite-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "c41e4803f62339d6ce0503c2f8459c67bc90bf3f3cfa481928ca75e688f5f688fd58314c324bded3ae2be056546950d9c4d66770b9ca31b32e95dc400398e3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanlite-ar \
locale-skanlite-az \
locale-skanlite-be \
locale-skanlite-bg \
locale-skanlite-bs \
locale-skanlite-ca \
locale-skanlite-ca@valencia \
locale-skanlite-cs \
locale-skanlite-da \
locale-skanlite-de \
locale-skanlite-el \
locale-skanlite-en-GB \
locale-skanlite-eo \
locale-skanlite-es \
locale-skanlite-et \
locale-skanlite-eu \
locale-skanlite-fi \
locale-skanlite-fr \
locale-skanlite-ga \
locale-skanlite-gl \
locale-skanlite-hi \
locale-skanlite-hr \
locale-skanlite-hu \
locale-skanlite-ia \
locale-skanlite-id \
locale-skanlite-is \
locale-skanlite-it \
locale-skanlite-ja \
locale-skanlite-ka \
locale-skanlite-km \
locale-skanlite-ko \
locale-skanlite-lt \
locale-skanlite-lv \
locale-skanlite-mai \
locale-skanlite-mr \
locale-skanlite-nb \
locale-skanlite-nds \
locale-skanlite-nl \
locale-skanlite-nn \
locale-skanlite-pa \
locale-skanlite-pl \
locale-skanlite-pt \
locale-skanlite-pt-BR \
locale-skanlite-ro \
locale-skanlite-ru \
locale-skanlite-sk \
locale-skanlite-sl \
locale-skanlite-sq \
locale-skanlite-sv \
locale-skanlite-tr \
locale-skanlite-ug \
locale-skanlite-uk \
locale-skanlite-wa \
locale-skanlite-zh-CN \
locale-skanlite-zh-TW \
skanlite-lang \
skanlite-lang-all"

RDEPENDS:${PN} += "skanlite"

inherit rpm
