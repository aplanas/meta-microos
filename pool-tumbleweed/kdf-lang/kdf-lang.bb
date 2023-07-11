SUMMARY = "Translations for package kdf"
DESCRIPTION = "Provides translations for the 'kdf' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdf-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "80b944169ab1a9af274cd083b187c2e0ecdb863bc5b034ab7c1c008eb54896d144065d1d0a4725be938b5cb15db6b54caecacfb86509247acea532f44c8fdfcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdf-lang \
kdf-lang-all \
locale-kdf-af \
locale-kdf-ar \
locale-kdf-be \
locale-kdf-bg \
locale-kdf-br \
locale-kdf-bs \
locale-kdf-ca \
locale-kdf-ca@valencia \
locale-kdf-cs \
locale-kdf-cy \
locale-kdf-da \
locale-kdf-de \
locale-kdf-el \
locale-kdf-en-GB \
locale-kdf-eo \
locale-kdf-es \
locale-kdf-et \
locale-kdf-eu \
locale-kdf-fa \
locale-kdf-fi \
locale-kdf-fr \
locale-kdf-ga \
locale-kdf-gl \
locale-kdf-he \
locale-kdf-hi \
locale-kdf-hr \
locale-kdf-hu \
locale-kdf-ia \
locale-kdf-id \
locale-kdf-is \
locale-kdf-it \
locale-kdf-ja \
locale-kdf-ka \
locale-kdf-kk \
locale-kdf-km \
locale-kdf-ko \
locale-kdf-lt \
locale-kdf-lv \
locale-kdf-mk \
locale-kdf-mr \
locale-kdf-ms \
locale-kdf-nb \
locale-kdf-nds \
locale-kdf-ne \
locale-kdf-nl \
locale-kdf-nn \
locale-kdf-oc \
locale-kdf-pa \
locale-kdf-pl \
locale-kdf-pt \
locale-kdf-pt-BR \
locale-kdf-ro \
locale-kdf-ru \
locale-kdf-sk \
locale-kdf-sl \
locale-kdf-sq \
locale-kdf-sr \
locale-kdf-sr@ijekavian \
locale-kdf-sr@ijekavianlatin \
locale-kdf-sr@latin \
locale-kdf-sv \
locale-kdf-ta \
locale-kdf-th \
locale-kdf-tr \
locale-kdf-ug \
locale-kdf-uk \
locale-kdf-zh-CN \
locale-kdf-zh-TW"

RDEPENDS:${PN} += "kdf"

inherit rpm
