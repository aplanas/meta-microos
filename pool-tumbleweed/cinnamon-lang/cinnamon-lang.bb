SUMMARY = "Translations for package cinnamon"
DESCRIPTION = "Provides translations for the 'cinnamon' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.2"

RPM_NAME = "cinnamon-lang-5.8.2-1.1.noarch.rpm"
RPM_HASH = "a47d94784753033d7fcc6b04f1317165f7b817b382fbfd3a4c4eb9dc3909e7c9dc8592598682adee6448c48aeea67c7d904c94c2a464e83e654f8c887a44d077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-lang \
cinnamon-lang-all \
locale-cinnamon-af \
locale-cinnamon-ar \
locale-cinnamon-ast \
locale-cinnamon-az \
locale-cinnamon-be \
locale-cinnamon-bg \
locale-cinnamon-bn \
locale-cinnamon-br \
locale-cinnamon-bs \
locale-cinnamon-ca \
locale-cinnamon-ca@valencia \
locale-cinnamon-cs \
locale-cinnamon-cy \
locale-cinnamon-da \
locale-cinnamon-de \
locale-cinnamon-el \
locale-cinnamon-en-AU \
locale-cinnamon-en-CA \
locale-cinnamon-en-GB \
locale-cinnamon-en-NZ \
locale-cinnamon-eo \
locale-cinnamon-es \
locale-cinnamon-es-AR \
locale-cinnamon-et \
locale-cinnamon-eu \
locale-cinnamon-fa \
locale-cinnamon-fi \
locale-cinnamon-fr \
locale-cinnamon-fr-CA \
locale-cinnamon-fur \
locale-cinnamon-ga \
locale-cinnamon-gd \
locale-cinnamon-gl \
locale-cinnamon-gu \
locale-cinnamon-he \
locale-cinnamon-hi \
locale-cinnamon-hr \
locale-cinnamon-hu \
locale-cinnamon-ia \
locale-cinnamon-id \
locale-cinnamon-is \
locale-cinnamon-it \
locale-cinnamon-ja \
locale-cinnamon-ka \
locale-cinnamon-kk \
locale-cinnamon-km \
locale-cinnamon-kn \
locale-cinnamon-ko \
locale-cinnamon-lt \
locale-cinnamon-lv \
locale-cinnamon-mai \
locale-cinnamon-mk \
locale-cinnamon-ml \
locale-cinnamon-mr \
locale-cinnamon-ms \
locale-cinnamon-nb \
locale-cinnamon-nds \
locale-cinnamon-ne \
locale-cinnamon-nl \
locale-cinnamon-nn \
locale-cinnamon-oc \
locale-cinnamon-or \
locale-cinnamon-pa \
locale-cinnamon-pl \
locale-cinnamon-pt \
locale-cinnamon-pt-BR \
locale-cinnamon-ro \
locale-cinnamon-ru \
locale-cinnamon-si \
locale-cinnamon-sk \
locale-cinnamon-sl \
locale-cinnamon-sq \
locale-cinnamon-sr \
locale-cinnamon-sr@ijekavian \
locale-cinnamon-sr@ijekavianlatin \
locale-cinnamon-sr@latin \
locale-cinnamon-sv \
locale-cinnamon-ta \
locale-cinnamon-te \
locale-cinnamon-th \
locale-cinnamon-tr \
locale-cinnamon-ug \
locale-cinnamon-uk \
locale-cinnamon-vi \
locale-cinnamon-wa \
locale-cinnamon-zh-CN \
locale-cinnamon-zh-HK \
locale-cinnamon-zh-TW"

RDEPENDS:${PN} += "cinnamon"

inherit rpm
