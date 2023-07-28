SUMMARY = "Translations for package nemo"
DESCRIPTION = "Provides translations for the 'nemo' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.2"

RPM_NAME = "nemo-lang-5.8.2-1.1.noarch.rpm"
RPM_HASH = "330e68dc87671c2854789dc92814ca4dc604a7e6a949a4595b89354b8123e71863fe3ae6515c04791cc51c70b6384668c98bab03f1e0c47e5949eccfb1add2db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nemo-af \
locale-nemo-ar \
locale-nemo-as \
locale-nemo-ast \
locale-nemo-az \
locale-nemo-be \
locale-nemo-bg \
locale-nemo-bn \
locale-nemo-bs \
locale-nemo-ca \
locale-nemo-ca@valencia \
locale-nemo-cs \
locale-nemo-cy \
locale-nemo-da \
locale-nemo-de \
locale-nemo-el \
locale-nemo-en-AU \
locale-nemo-en-CA \
locale-nemo-en-GB \
locale-nemo-eo \
locale-nemo-es \
locale-nemo-et \
locale-nemo-eu \
locale-nemo-fa \
locale-nemo-fi \
locale-nemo-fr \
locale-nemo-fr-CA \
locale-nemo-ga \
locale-nemo-gd \
locale-nemo-gl \
locale-nemo-he \
locale-nemo-hi \
locale-nemo-hr \
locale-nemo-hu \
locale-nemo-ia \
locale-nemo-id \
locale-nemo-is \
locale-nemo-it \
locale-nemo-ja \
locale-nemo-ka \
locale-nemo-kk \
locale-nemo-km \
locale-nemo-kn \
locale-nemo-ko \
locale-nemo-lt \
locale-nemo-lv \
locale-nemo-ml \
locale-nemo-mr \
locale-nemo-ms \
locale-nemo-nb \
locale-nemo-nds \
locale-nemo-ne \
locale-nemo-nl \
locale-nemo-nn \
locale-nemo-oc \
locale-nemo-pa \
locale-nemo-pl \
locale-nemo-pt \
locale-nemo-pt-BR \
locale-nemo-ro \
locale-nemo-ru \
locale-nemo-si \
locale-nemo-sk \
locale-nemo-sl \
locale-nemo-sq \
locale-nemo-sr \
locale-nemo-sr@latin \
locale-nemo-sv \
locale-nemo-ta \
locale-nemo-th \
locale-nemo-tr \
locale-nemo-uk \
locale-nemo-vi \
locale-nemo-zh-CN \
locale-nemo-zh-HK \
locale-nemo-zh-TW \
nemo-lang \
nemo-lang-all"

RDEPENDS:${PN} += "nemo"

inherit rpm
