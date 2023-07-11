SUMMARY = "Translations for package lskat"
DESCRIPTION = "Provides translations for the 'lskat' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "lskat-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "27255c86bed7f2a3c246da1c425524b3fabc50508c7d84d00a17a58db6fdefab06bffbc7904d81d52a822bd6019ddeb7cb6db515439052cc02ea35abb24a767e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lskat-af \
locale-lskat-ar \
locale-lskat-be \
locale-lskat-bg \
locale-lskat-br \
locale-lskat-bs \
locale-lskat-ca \
locale-lskat-ca@valencia \
locale-lskat-cs \
locale-lskat-cy \
locale-lskat-da \
locale-lskat-de \
locale-lskat-el \
locale-lskat-en-GB \
locale-lskat-eo \
locale-lskat-es \
locale-lskat-et \
locale-lskat-eu \
locale-lskat-fa \
locale-lskat-fi \
locale-lskat-fr \
locale-lskat-ga \
locale-lskat-gl \
locale-lskat-he \
locale-lskat-hi \
locale-lskat-hr \
locale-lskat-hu \
locale-lskat-id \
locale-lskat-is \
locale-lskat-it \
locale-lskat-ja \
locale-lskat-ka \
locale-lskat-kk \
locale-lskat-km \
locale-lskat-ko \
locale-lskat-lt \
locale-lskat-lv \
locale-lskat-mai \
locale-lskat-mk \
locale-lskat-ml \
locale-lskat-mr \
locale-lskat-ms \
locale-lskat-nb \
locale-lskat-nds \
locale-lskat-ne \
locale-lskat-nl \
locale-lskat-nn \
locale-lskat-oc \
locale-lskat-pa \
locale-lskat-pl \
locale-lskat-pt \
locale-lskat-pt-BR \
locale-lskat-ro \
locale-lskat-ru \
locale-lskat-sk \
locale-lskat-sl \
locale-lskat-sq \
locale-lskat-sr \
locale-lskat-sr@ijekavian \
locale-lskat-sr@ijekavianlatin \
locale-lskat-sr@latin \
locale-lskat-sv \
locale-lskat-ta \
locale-lskat-tr \
locale-lskat-ug \
locale-lskat-uk \
locale-lskat-zh-CN \
locale-lskat-zh-TW \
lskat-lang \
lskat-lang-all"

RDEPENDS:${PN} += "lskat"

inherit rpm
