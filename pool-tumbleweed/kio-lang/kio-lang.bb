SUMMARY = "Translations for package kio"
DESCRIPTION = "Provides translations for the 'kio' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kio-lang-5.107.0-2.1.noarch.rpm"
RPM_HASH = "153c7e486d9e47f9b5a83a4011a70ccdfca1e63e5ca40794826bab4eeb62b3e52c18a601c2ba66239bb5ccde9d5b03fcf9956e26dd5bc6f193a814194bdfe2d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-lang \
kio-lang-all \
locale-kio-af \
locale-kio-ar \
locale-kio-ast \
locale-kio-az \
locale-kio-be \
locale-kio-be@latin \
locale-kio-bg \
locale-kio-bn \
locale-kio-br \
locale-kio-bs \
locale-kio-ca \
locale-kio-ca@valencia \
locale-kio-cs \
locale-kio-cy \
locale-kio-da \
locale-kio-de \
locale-kio-el \
locale-kio-en-GB \
locale-kio-eo \
locale-kio-es \
locale-kio-et \
locale-kio-eu \
locale-kio-fa \
locale-kio-fi \
locale-kio-fr \
locale-kio-ga \
locale-kio-gl \
locale-kio-gu \
locale-kio-he \
locale-kio-hi \
locale-kio-hr \
locale-kio-hu \
locale-kio-ia \
locale-kio-id \
locale-kio-is \
locale-kio-it \
locale-kio-ja \
locale-kio-ka \
locale-kio-kk \
locale-kio-km \
locale-kio-ko \
locale-kio-lt \
locale-kio-lv \
locale-kio-mai \
locale-kio-mk \
locale-kio-ml \
locale-kio-mr \
locale-kio-ms \
locale-kio-nb \
locale-kio-nds \
locale-kio-ne \
locale-kio-nl \
locale-kio-nn \
locale-kio-oc \
locale-kio-pa \
locale-kio-pl \
locale-kio-pt \
locale-kio-pt-BR \
locale-kio-ro \
locale-kio-ru \
locale-kio-sk \
locale-kio-sl \
locale-kio-sq \
locale-kio-sr \
locale-kio-sr@ijekavian \
locale-kio-sr@ijekavianlatin \
locale-kio-sr@latin \
locale-kio-sv \
locale-kio-ta \
locale-kio-th \
locale-kio-tr \
locale-kio-ug \
locale-kio-uk \
locale-kio-vi \
locale-kio-wa \
locale-kio-zh-CN \
locale-kio-zh-TW"

RDEPENDS:${PN} += "kio"

inherit rpm
