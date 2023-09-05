SUMMARY = "Translations for package kmahjongg"
DESCRIPTION = "Provides translations for the 'kmahjongg' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmahjongg-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "48b53b92d2739fb207b56b5444aeca9f2929f52195edcdd303e5445514a611bb1a4edb10906467ddd468e7311d58e93c36a1a221a9b50def8e8721a7b650d7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmahjongg-lang \
kmahjongg-lang-all \
locale-kmahjongg-af \
locale-kmahjongg-ar \
locale-kmahjongg-be \
locale-kmahjongg-bg \
locale-kmahjongg-bn \
locale-kmahjongg-br \
locale-kmahjongg-bs \
locale-kmahjongg-ca \
locale-kmahjongg-ca@valencia \
locale-kmahjongg-cs \
locale-kmahjongg-cy \
locale-kmahjongg-da \
locale-kmahjongg-de \
locale-kmahjongg-el \
locale-kmahjongg-en-GB \
locale-kmahjongg-eo \
locale-kmahjongg-es \
locale-kmahjongg-et \
locale-kmahjongg-eu \
locale-kmahjongg-fa \
locale-kmahjongg-fi \
locale-kmahjongg-fr \
locale-kmahjongg-ga \
locale-kmahjongg-gl \
locale-kmahjongg-he \
locale-kmahjongg-hi \
locale-kmahjongg-hr \
locale-kmahjongg-hu \
locale-kmahjongg-id \
locale-kmahjongg-is \
locale-kmahjongg-it \
locale-kmahjongg-ja \
locale-kmahjongg-ka \
locale-kmahjongg-kk \
locale-kmahjongg-km \
locale-kmahjongg-ko \
locale-kmahjongg-lt \
locale-kmahjongg-lv \
locale-kmahjongg-mai \
locale-kmahjongg-mk \
locale-kmahjongg-ml \
locale-kmahjongg-mr \
locale-kmahjongg-nb \
locale-kmahjongg-nds \
locale-kmahjongg-ne \
locale-kmahjongg-nl \
locale-kmahjongg-nn \
locale-kmahjongg-oc \
locale-kmahjongg-pa \
locale-kmahjongg-pl \
locale-kmahjongg-pt \
locale-kmahjongg-pt-BR \
locale-kmahjongg-ro \
locale-kmahjongg-ru \
locale-kmahjongg-sk \
locale-kmahjongg-sl \
locale-kmahjongg-sq \
locale-kmahjongg-sr \
locale-kmahjongg-sr@ijekavian \
locale-kmahjongg-sr@ijekavianlatin \
locale-kmahjongg-sr@latin \
locale-kmahjongg-sv \
locale-kmahjongg-ta \
locale-kmahjongg-th \
locale-kmahjongg-tr \
locale-kmahjongg-ug \
locale-kmahjongg-uk \
locale-kmahjongg-wa \
locale-kmahjongg-zh-CN \
locale-kmahjongg-zh-TW"

RDEPENDS:${PN} += "kmahjongg"

inherit rpm
