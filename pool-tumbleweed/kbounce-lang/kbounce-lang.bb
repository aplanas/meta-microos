SUMMARY = "Translations for package kbounce"
DESCRIPTION = "Provides translations for the 'kbounce' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kbounce-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "3a8efa64db579ddb90d83795aaf2dbf112d2fd01f43120f2ec133880aea037ffc734333c83fcddf85b3bdda27654457e042f56888896d2b29f8bddd7f3fb8ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbounce-lang \
kbounce-lang-all \
locale-kbounce-af \
locale-kbounce-ar \
locale-kbounce-be \
locale-kbounce-bg \
locale-kbounce-bn \
locale-kbounce-br \
locale-kbounce-bs \
locale-kbounce-ca \
locale-kbounce-ca@valencia \
locale-kbounce-cs \
locale-kbounce-cy \
locale-kbounce-da \
locale-kbounce-de \
locale-kbounce-el \
locale-kbounce-en-GB \
locale-kbounce-eo \
locale-kbounce-es \
locale-kbounce-et \
locale-kbounce-eu \
locale-kbounce-fa \
locale-kbounce-fi \
locale-kbounce-fr \
locale-kbounce-ga \
locale-kbounce-gl \
locale-kbounce-he \
locale-kbounce-hi \
locale-kbounce-hr \
locale-kbounce-hu \
locale-kbounce-id \
locale-kbounce-is \
locale-kbounce-it \
locale-kbounce-ja \
locale-kbounce-ka \
locale-kbounce-kk \
locale-kbounce-km \
locale-kbounce-ko \
locale-kbounce-lt \
locale-kbounce-lv \
locale-kbounce-mai \
locale-kbounce-mk \
locale-kbounce-ml \
locale-kbounce-mr \
locale-kbounce-ms \
locale-kbounce-nb \
locale-kbounce-nds \
locale-kbounce-ne \
locale-kbounce-nl \
locale-kbounce-nn \
locale-kbounce-oc \
locale-kbounce-pa \
locale-kbounce-pl \
locale-kbounce-pt \
locale-kbounce-pt-BR \
locale-kbounce-ro \
locale-kbounce-ru \
locale-kbounce-sk \
locale-kbounce-sl \
locale-kbounce-sq \
locale-kbounce-sr \
locale-kbounce-sr@ijekavian \
locale-kbounce-sr@ijekavianlatin \
locale-kbounce-sr@latin \
locale-kbounce-sv \
locale-kbounce-ta \
locale-kbounce-te \
locale-kbounce-th \
locale-kbounce-tr \
locale-kbounce-ug \
locale-kbounce-uk \
locale-kbounce-vi \
locale-kbounce-zh-CN \
locale-kbounce-zh-TW"

RDEPENDS:${PN} += "kbounce"

inherit rpm
