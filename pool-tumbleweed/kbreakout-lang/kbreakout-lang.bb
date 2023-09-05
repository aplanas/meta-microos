SUMMARY = "Translations for package kbreakout"
DESCRIPTION = "Provides translations for the 'kbreakout' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kbreakout-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "adf7289221c68bc4b1baa5e9ab1e221b6ece76f59a70e22a573aa15c3996cb9e7c98818f02003a81060271eef8cc77de21c046ec5478fa154678f27588a0555c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbreakout-lang \
kbreakout-lang-all \
locale-kbreakout-ar \
locale-kbreakout-bg \
locale-kbreakout-bs \
locale-kbreakout-ca \
locale-kbreakout-ca@valencia \
locale-kbreakout-cs \
locale-kbreakout-da \
locale-kbreakout-de \
locale-kbreakout-el \
locale-kbreakout-en-GB \
locale-kbreakout-eo \
locale-kbreakout-es \
locale-kbreakout-et \
locale-kbreakout-eu \
locale-kbreakout-fi \
locale-kbreakout-fr \
locale-kbreakout-ga \
locale-kbreakout-gl \
locale-kbreakout-gu \
locale-kbreakout-hr \
locale-kbreakout-hu \
locale-kbreakout-id \
locale-kbreakout-is \
locale-kbreakout-it \
locale-kbreakout-ja \
locale-kbreakout-ka \
locale-kbreakout-kk \
locale-kbreakout-km \
locale-kbreakout-ko \
locale-kbreakout-lt \
locale-kbreakout-lv \
locale-kbreakout-mai \
locale-kbreakout-ml \
locale-kbreakout-mr \
locale-kbreakout-nb \
locale-kbreakout-nds \
locale-kbreakout-nl \
locale-kbreakout-nn \
locale-kbreakout-pl \
locale-kbreakout-pt \
locale-kbreakout-pt-BR \
locale-kbreakout-ro \
locale-kbreakout-ru \
locale-kbreakout-sk \
locale-kbreakout-sl \
locale-kbreakout-sq \
locale-kbreakout-sr \
locale-kbreakout-sr@ijekavian \
locale-kbreakout-sr@ijekavianlatin \
locale-kbreakout-sr@latin \
locale-kbreakout-sv \
locale-kbreakout-th \
locale-kbreakout-tr \
locale-kbreakout-ug \
locale-kbreakout-uk \
locale-kbreakout-wa \
locale-kbreakout-zh-CN \
locale-kbreakout-zh-TW"

RDEPENDS:${PN} += "kbreakout"

inherit rpm
