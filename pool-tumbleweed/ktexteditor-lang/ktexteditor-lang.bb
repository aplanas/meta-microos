SUMMARY = "Translations for package ktexteditor"
DESCRIPTION = "Provides translations for the 'ktexteditor' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "ktexteditor-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "6a4729c1f88ac1f63b24fd060fc4a526e5148ce9ff11f00721cd168795229bfc5e04d3ea265005db079711e69832b012319b56dcf7525aa47635c9f41fbe947e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktexteditor-lang \
ktexteditor-lang-all \
locale-ktexteditor-af \
locale-ktexteditor-ar \
locale-ktexteditor-az \
locale-ktexteditor-be \
locale-ktexteditor-bg \
locale-ktexteditor-bn \
locale-ktexteditor-br \
locale-ktexteditor-bs \
locale-ktexteditor-ca \
locale-ktexteditor-ca@valencia \
locale-ktexteditor-cs \
locale-ktexteditor-cy \
locale-ktexteditor-da \
locale-ktexteditor-de \
locale-ktexteditor-el \
locale-ktexteditor-en-GB \
locale-ktexteditor-eo \
locale-ktexteditor-es \
locale-ktexteditor-et \
locale-ktexteditor-eu \
locale-ktexteditor-fa \
locale-ktexteditor-fi \
locale-ktexteditor-fr \
locale-ktexteditor-ga \
locale-ktexteditor-gl \
locale-ktexteditor-gu \
locale-ktexteditor-he \
locale-ktexteditor-hi \
locale-ktexteditor-hr \
locale-ktexteditor-hu \
locale-ktexteditor-ia \
locale-ktexteditor-id \
locale-ktexteditor-is \
locale-ktexteditor-it \
locale-ktexteditor-ja \
locale-ktexteditor-ka \
locale-ktexteditor-kk \
locale-ktexteditor-km \
locale-ktexteditor-ko \
locale-ktexteditor-lt \
locale-ktexteditor-lv \
locale-ktexteditor-mai \
locale-ktexteditor-mk \
locale-ktexteditor-ml \
locale-ktexteditor-mr \
locale-ktexteditor-ms \
locale-ktexteditor-nb \
locale-ktexteditor-nds \
locale-ktexteditor-ne \
locale-ktexteditor-nl \
locale-ktexteditor-nn \
locale-ktexteditor-oc \
locale-ktexteditor-pa \
locale-ktexteditor-pl \
locale-ktexteditor-pt \
locale-ktexteditor-pt-BR \
locale-ktexteditor-ro \
locale-ktexteditor-ru \
locale-ktexteditor-si \
locale-ktexteditor-sk \
locale-ktexteditor-sl \
locale-ktexteditor-sq \
locale-ktexteditor-sr \
locale-ktexteditor-sr@ijekavian \
locale-ktexteditor-sr@ijekavianlatin \
locale-ktexteditor-sr@latin \
locale-ktexteditor-sv \
locale-ktexteditor-ta \
locale-ktexteditor-th \
locale-ktexteditor-tr \
locale-ktexteditor-ug \
locale-ktexteditor-uk \
locale-ktexteditor-vi \
locale-ktexteditor-wa \
locale-ktexteditor-zh-CN \
locale-ktexteditor-zh-TW"

RDEPENDS:${PN} += "ktexteditor"

inherit rpm
