SUMMARY = "Translations for package marble"
DESCRIPTION = "Provides translations for the 'marble' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "2a7188556570944d1704a4d049bb7e168e8fb36bd1bbc12a2dfe40e4b62165ef108ff971a8775700920cfbd88c0d6a0918d30e8dd384b07d43df02af4a7c7f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-marble-ar \
locale-marble-be \
locale-marble-bg \
locale-marble-bs \
locale-marble-ca \
locale-marble-ca@valencia \
locale-marble-cs \
locale-marble-da \
locale-marble-de \
locale-marble-el \
locale-marble-en \
locale-marble-en-GB \
locale-marble-eo \
locale-marble-es \
locale-marble-et \
locale-marble-eu \
locale-marble-fi \
locale-marble-fr \
locale-marble-ga \
locale-marble-gl \
locale-marble-gu \
locale-marble-he \
locale-marble-hi \
locale-marble-hr \
locale-marble-hu \
locale-marble-id \
locale-marble-is \
locale-marble-it \
locale-marble-ja \
locale-marble-ka \
locale-marble-kk \
locale-marble-km \
locale-marble-ko \
locale-marble-lt \
locale-marble-lv \
locale-marble-mai \
locale-marble-ml \
locale-marble-mr \
locale-marble-nb \
locale-marble-nds \
locale-marble-nl \
locale-marble-nn \
locale-marble-oc \
locale-marble-pa \
locale-marble-pl \
locale-marble-pt \
locale-marble-pt-BR \
locale-marble-ro \
locale-marble-ru \
locale-marble-si \
locale-marble-sk \
locale-marble-sl \
locale-marble-sv \
locale-marble-th \
locale-marble-tr \
locale-marble-ug \
locale-marble-uk \
locale-marble-wa \
locale-marble-zh-CN \
locale-marble-zh-TW \
marble-lang \
marble-lang-all"

RDEPENDS:${PN} += "marble"

inherit rpm
