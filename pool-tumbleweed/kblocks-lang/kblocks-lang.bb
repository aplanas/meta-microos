SUMMARY = "Translations for package kblocks"
DESCRIPTION = "Provides translations for the 'kblocks' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kblocks-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "16670e67696c6045d5c4b01135b25564a0498eebca96dfa2883b6f1d80d465a8ab382f2122ebe62a38ce04a6a7fb4d2fa3a3558b1882b9bf5c7904647dea9df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kblocks-lang \
kblocks-lang-all \
locale-kblocks-ar \
locale-kblocks-bg \
locale-kblocks-bs \
locale-kblocks-ca \
locale-kblocks-ca@valencia \
locale-kblocks-cs \
locale-kblocks-da \
locale-kblocks-de \
locale-kblocks-el \
locale-kblocks-en-GB \
locale-kblocks-eo \
locale-kblocks-es \
locale-kblocks-et \
locale-kblocks-eu \
locale-kblocks-fi \
locale-kblocks-fr \
locale-kblocks-ga \
locale-kblocks-gl \
locale-kblocks-gu \
locale-kblocks-hi \
locale-kblocks-hr \
locale-kblocks-hu \
locale-kblocks-id \
locale-kblocks-is \
locale-kblocks-it \
locale-kblocks-ja \
locale-kblocks-ka \
locale-kblocks-kk \
locale-kblocks-km \
locale-kblocks-ko \
locale-kblocks-lt \
locale-kblocks-lv \
locale-kblocks-mai \
locale-kblocks-ml \
locale-kblocks-mr \
locale-kblocks-nb \
locale-kblocks-nds \
locale-kblocks-nl \
locale-kblocks-nn \
locale-kblocks-pl \
locale-kblocks-pt \
locale-kblocks-pt-BR \
locale-kblocks-ro \
locale-kblocks-ru \
locale-kblocks-sk \
locale-kblocks-sl \
locale-kblocks-sq \
locale-kblocks-sr \
locale-kblocks-sr@ijekavian \
locale-kblocks-sr@ijekavianlatin \
locale-kblocks-sr@latin \
locale-kblocks-sv \
locale-kblocks-th \
locale-kblocks-tr \
locale-kblocks-ug \
locale-kblocks-uk \
locale-kblocks-zh-CN \
locale-kblocks-zh-TW"

RDEPENDS:${PN} += "kblocks"

inherit rpm
