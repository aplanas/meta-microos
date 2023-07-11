SUMMARY = "Translations for package xplayer"
DESCRIPTION = "Provides translations for the 'xplayer' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.4"

RPM_NAME = "xplayer-lang-2.4.4-1.4.noarch.rpm"
RPM_HASH = "ff484f9f3e8b99b97b6d58c51bb15bca59a7be2cdc2f2c40e27c0c3a91a170114bc458eefc0bafd0b64bbc5243e63a08a7b1a6140d82874c58d4735b75164d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xplayer-af \
locale-xplayer-ar \
locale-xplayer-as \
locale-xplayer-ast \
locale-xplayer-az \
locale-xplayer-be \
locale-xplayer-be@latin \
locale-xplayer-bg \
locale-xplayer-bn \
locale-xplayer-bn-IN \
locale-xplayer-br \
locale-xplayer-bs \
locale-xplayer-ca \
locale-xplayer-ca@valencia \
locale-xplayer-cs \
locale-xplayer-cy \
locale-xplayer-da \
locale-xplayer-de \
locale-xplayer-dz \
locale-xplayer-el \
locale-xplayer-en-CA \
locale-xplayer-en-GB \
locale-xplayer-en@shaw \
locale-xplayer-eo \
locale-xplayer-es \
locale-xplayer-et \
locale-xplayer-eu \
locale-xplayer-fa \
locale-xplayer-fi \
locale-xplayer-fr \
locale-xplayer-fr-CA \
locale-xplayer-ga \
locale-xplayer-gl \
locale-xplayer-gu \
locale-xplayer-he \
locale-xplayer-hi \
locale-xplayer-hr \
locale-xplayer-hu \
locale-xplayer-ia \
locale-xplayer-id \
locale-xplayer-is \
locale-xplayer-it \
locale-xplayer-ja \
locale-xplayer-ka \
locale-xplayer-kk \
locale-xplayer-km \
locale-xplayer-kn \
locale-xplayer-ko \
locale-xplayer-lt \
locale-xplayer-lv \
locale-xplayer-mai \
locale-xplayer-mk \
locale-xplayer-ml \
locale-xplayer-mr \
locale-xplayer-ms \
locale-xplayer-nb \
locale-xplayer-ne \
locale-xplayer-nl \
locale-xplayer-nn \
locale-xplayer-oc \
locale-xplayer-or \
locale-xplayer-pa \
locale-xplayer-pl \
locale-xplayer-pt \
locale-xplayer-pt-BR \
locale-xplayer-ro \
locale-xplayer-ru \
locale-xplayer-si \
locale-xplayer-sk \
locale-xplayer-sl \
locale-xplayer-sq \
locale-xplayer-sr \
locale-xplayer-sr@latin \
locale-xplayer-sv \
locale-xplayer-ta \
locale-xplayer-te \
locale-xplayer-th \
locale-xplayer-tr \
locale-xplayer-ug \
locale-xplayer-uk \
locale-xplayer-vi \
locale-xplayer-wa \
locale-xplayer-zh-CN \
locale-xplayer-zh-HK \
locale-xplayer-zh-TW \
xplayer-lang \
xplayer-lang-all"

RDEPENDS:${PN} += "xplayer"

inherit rpm
