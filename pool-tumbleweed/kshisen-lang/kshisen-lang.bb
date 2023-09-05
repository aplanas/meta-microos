SUMMARY = "Translations for package kshisen"
DESCRIPTION = "Provides translations for the 'kshisen' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kshisen-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "e27902ea2cc35e8ac3e2bb55d18abea23833af72fd59dd89613967257850c7c5f2d63d7c8e3827e2342e0e934754298f30a7d7879cb426a57c5e61a18bfba1f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kshisen-lang \
kshisen-lang-all \
locale-kshisen-af \
locale-kshisen-ar \
locale-kshisen-be \
locale-kshisen-bg \
locale-kshisen-bn \
locale-kshisen-br \
locale-kshisen-bs \
locale-kshisen-ca \
locale-kshisen-ca@valencia \
locale-kshisen-cs \
locale-kshisen-cy \
locale-kshisen-da \
locale-kshisen-de \
locale-kshisen-el \
locale-kshisen-en-GB \
locale-kshisen-eo \
locale-kshisen-es \
locale-kshisen-et \
locale-kshisen-eu \
locale-kshisen-fa \
locale-kshisen-fi \
locale-kshisen-fr \
locale-kshisen-ga \
locale-kshisen-gl \
locale-kshisen-he \
locale-kshisen-hi \
locale-kshisen-hr \
locale-kshisen-hu \
locale-kshisen-id \
locale-kshisen-is \
locale-kshisen-it \
locale-kshisen-ja \
locale-kshisen-ka \
locale-kshisen-kk \
locale-kshisen-km \
locale-kshisen-ko \
locale-kshisen-lt \
locale-kshisen-lv \
locale-kshisen-mai \
locale-kshisen-mk \
locale-kshisen-ml \
locale-kshisen-mr \
locale-kshisen-nb \
locale-kshisen-nds \
locale-kshisen-ne \
locale-kshisen-nl \
locale-kshisen-nn \
locale-kshisen-oc \
locale-kshisen-pa \
locale-kshisen-pl \
locale-kshisen-pt \
locale-kshisen-pt-BR \
locale-kshisen-ro \
locale-kshisen-ru \
locale-kshisen-sk \
locale-kshisen-sl \
locale-kshisen-sq \
locale-kshisen-sr \
locale-kshisen-sr@ijekavian \
locale-kshisen-sr@ijekavianlatin \
locale-kshisen-sr@latin \
locale-kshisen-sv \
locale-kshisen-ta \
locale-kshisen-th \
locale-kshisen-tr \
locale-kshisen-ug \
locale-kshisen-uk \
locale-kshisen-zh-CN \
locale-kshisen-zh-TW"

RDEPENDS:${PN} += "kshisen"

inherit rpm
