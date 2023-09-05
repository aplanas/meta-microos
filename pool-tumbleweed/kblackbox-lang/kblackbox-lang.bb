SUMMARY = "Translations for package kblackbox"
DESCRIPTION = "Provides translations for the 'kblackbox' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kblackbox-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "7d285f716bb74756616f00994c40ffdad8b336de764a392e56581b622a157e25da97d5ce77b3edb45cbb29fbecfaf06e84add6041047073596d18af5f626a746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kblackbox-lang \
kblackbox-lang-all \
locale-kblackbox-af \
locale-kblackbox-ar \
locale-kblackbox-be \
locale-kblackbox-bg \
locale-kblackbox-bn \
locale-kblackbox-br \
locale-kblackbox-bs \
locale-kblackbox-ca \
locale-kblackbox-ca@valencia \
locale-kblackbox-cs \
locale-kblackbox-cy \
locale-kblackbox-da \
locale-kblackbox-de \
locale-kblackbox-el \
locale-kblackbox-en-GB \
locale-kblackbox-eo \
locale-kblackbox-es \
locale-kblackbox-et \
locale-kblackbox-eu \
locale-kblackbox-fa \
locale-kblackbox-fi \
locale-kblackbox-fr \
locale-kblackbox-ga \
locale-kblackbox-gl \
locale-kblackbox-he \
locale-kblackbox-hi \
locale-kblackbox-hr \
locale-kblackbox-hu \
locale-kblackbox-id \
locale-kblackbox-is \
locale-kblackbox-it \
locale-kblackbox-ja \
locale-kblackbox-ka \
locale-kblackbox-kk \
locale-kblackbox-km \
locale-kblackbox-ko \
locale-kblackbox-lt \
locale-kblackbox-lv \
locale-kblackbox-mai \
locale-kblackbox-mk \
locale-kblackbox-ml \
locale-kblackbox-mr \
locale-kblackbox-ms \
locale-kblackbox-nb \
locale-kblackbox-nds \
locale-kblackbox-ne \
locale-kblackbox-nl \
locale-kblackbox-nn \
locale-kblackbox-oc \
locale-kblackbox-pa \
locale-kblackbox-pl \
locale-kblackbox-pt \
locale-kblackbox-pt-BR \
locale-kblackbox-ro \
locale-kblackbox-ru \
locale-kblackbox-sk \
locale-kblackbox-sl \
locale-kblackbox-sq \
locale-kblackbox-sr \
locale-kblackbox-sr@ijekavian \
locale-kblackbox-sr@ijekavianlatin \
locale-kblackbox-sr@latin \
locale-kblackbox-sv \
locale-kblackbox-ta \
locale-kblackbox-te \
locale-kblackbox-th \
locale-kblackbox-tr \
locale-kblackbox-ug \
locale-kblackbox-uk \
locale-kblackbox-vi \
locale-kblackbox-zh-CN \
locale-kblackbox-zh-TW"

RDEPENDS:${PN} += "kblackbox"

inherit rpm
