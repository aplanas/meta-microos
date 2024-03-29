SUMMARY = "Translations for package lokalize"
DESCRIPTION = "Provides translations for the 'lokalize' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "lokalize-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "bc2af181853322ea655351e2db9fa4c9bca1b299927438e08bacd85560848fcab922e1c1c59b8fda436b9eecdd174027362a1c67921037bc15fbcfd4e88fd70d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lokalize-ar \
locale-lokalize-az \
locale-lokalize-be \
locale-lokalize-bg \
locale-lokalize-bs \
locale-lokalize-ca \
locale-lokalize-ca@valencia \
locale-lokalize-cs \
locale-lokalize-da \
locale-lokalize-de \
locale-lokalize-el \
locale-lokalize-en-GB \
locale-lokalize-eo \
locale-lokalize-es \
locale-lokalize-et \
locale-lokalize-eu \
locale-lokalize-fi \
locale-lokalize-fr \
locale-lokalize-ga \
locale-lokalize-gl \
locale-lokalize-he \
locale-lokalize-hr \
locale-lokalize-hu \
locale-lokalize-ia \
locale-lokalize-id \
locale-lokalize-is \
locale-lokalize-it \
locale-lokalize-ja \
locale-lokalize-ka \
locale-lokalize-kk \
locale-lokalize-km \
locale-lokalize-ko \
locale-lokalize-lt \
locale-lokalize-lv \
locale-lokalize-mai \
locale-lokalize-mr \
locale-lokalize-nb \
locale-lokalize-nds \
locale-lokalize-nl \
locale-lokalize-nn \
locale-lokalize-oc \
locale-lokalize-pa \
locale-lokalize-pl \
locale-lokalize-pt \
locale-lokalize-pt-BR \
locale-lokalize-ro \
locale-lokalize-ru \
locale-lokalize-sk \
locale-lokalize-sl \
locale-lokalize-sq \
locale-lokalize-sr \
locale-lokalize-sr@ijekavian \
locale-lokalize-sr@ijekavianlatin \
locale-lokalize-sr@latin \
locale-lokalize-sv \
locale-lokalize-th \
locale-lokalize-tr \
locale-lokalize-ug \
locale-lokalize-uk \
locale-lokalize-vi \
locale-lokalize-wa \
locale-lokalize-zh-CN \
locale-lokalize-zh-TW \
lokalize-lang \
lokalize-lang-all"

RDEPENDS:${PN} += "lokalize"

inherit rpm
