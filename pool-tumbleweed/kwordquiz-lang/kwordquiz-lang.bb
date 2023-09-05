SUMMARY = "Translations for package kwordquiz"
DESCRIPTION = "Provides translations for the 'kwordquiz' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwordquiz-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "8c9c9b0b6697a181d7f626b8a4e112aec9140a90636fc1e2ec9facaa0f734b16aa1ae7b29b6662394f9a5de73e9398dd8bbdefb9afe6c991ee75120411252de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwordquiz-lang \
kwordquiz-lang-all \
locale-kwordquiz-ar \
locale-kwordquiz-be \
locale-kwordquiz-bg \
locale-kwordquiz-bn \
locale-kwordquiz-br \
locale-kwordquiz-bs \
locale-kwordquiz-ca \
locale-kwordquiz-ca@valencia \
locale-kwordquiz-cs \
locale-kwordquiz-cy \
locale-kwordquiz-da \
locale-kwordquiz-de \
locale-kwordquiz-el \
locale-kwordquiz-en-GB \
locale-kwordquiz-eo \
locale-kwordquiz-es \
locale-kwordquiz-et \
locale-kwordquiz-eu \
locale-kwordquiz-fa \
locale-kwordquiz-fi \
locale-kwordquiz-fr \
locale-kwordquiz-ga \
locale-kwordquiz-gl \
locale-kwordquiz-hi \
locale-kwordquiz-hr \
locale-kwordquiz-hu \
locale-kwordquiz-ia \
locale-kwordquiz-it \
locale-kwordquiz-ja \
locale-kwordquiz-ka \
locale-kwordquiz-kk \
locale-kwordquiz-km \
locale-kwordquiz-ko \
locale-kwordquiz-lt \
locale-kwordquiz-lv \
locale-kwordquiz-mai \
locale-kwordquiz-mk \
locale-kwordquiz-ml \
locale-kwordquiz-mr \
locale-kwordquiz-ms \
locale-kwordquiz-nb \
locale-kwordquiz-nds \
locale-kwordquiz-ne \
locale-kwordquiz-nl \
locale-kwordquiz-nn \
locale-kwordquiz-oc \
locale-kwordquiz-pa \
locale-kwordquiz-pl \
locale-kwordquiz-pt \
locale-kwordquiz-pt-BR \
locale-kwordquiz-ro \
locale-kwordquiz-ru \
locale-kwordquiz-si \
locale-kwordquiz-sk \
locale-kwordquiz-sl \
locale-kwordquiz-sq \
locale-kwordquiz-sv \
locale-kwordquiz-ta \
locale-kwordquiz-tr \
locale-kwordquiz-ug \
locale-kwordquiz-uk \
locale-kwordquiz-zh-CN \
locale-kwordquiz-zh-TW"

RDEPENDS:${PN} += "kwordquiz"

inherit rpm
