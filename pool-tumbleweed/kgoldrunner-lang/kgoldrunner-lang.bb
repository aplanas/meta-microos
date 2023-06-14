SUMMARY = "Translations for package kgoldrunner"
DESCRIPTION = "Provides translations for the 'kgoldrunner' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgoldrunner-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "c187e88fe3afaf118b6bd6607deda3ad1585083defbc335a91c05ccd1d1bbd7f5ba64388284160e67ba04fc6db286dae3589719f9d609cb44419469e39d4e4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgoldrunner-lang \
kgoldrunner-lang-all \
locale-kgoldrunner-ar \
locale-kgoldrunner-be \
locale-kgoldrunner-bg \
locale-kgoldrunner-bn \
locale-kgoldrunner-br \
locale-kgoldrunner-bs \
locale-kgoldrunner-ca \
locale-kgoldrunner-ca@valencia \
locale-kgoldrunner-cs \
locale-kgoldrunner-cy \
locale-kgoldrunner-da \
locale-kgoldrunner-de \
locale-kgoldrunner-el \
locale-kgoldrunner-en-GB \
locale-kgoldrunner-eo \
locale-kgoldrunner-es \
locale-kgoldrunner-et \
locale-kgoldrunner-eu \
locale-kgoldrunner-fa \
locale-kgoldrunner-fi \
locale-kgoldrunner-fr \
locale-kgoldrunner-ga \
locale-kgoldrunner-gl \
locale-kgoldrunner-hi \
locale-kgoldrunner-hr \
locale-kgoldrunner-hu \
locale-kgoldrunner-id \
locale-kgoldrunner-is \
locale-kgoldrunner-it \
locale-kgoldrunner-ja \
locale-kgoldrunner-kk \
locale-kgoldrunner-km \
locale-kgoldrunner-ko \
locale-kgoldrunner-lt \
locale-kgoldrunner-lv \
locale-kgoldrunner-mai \
locale-kgoldrunner-mk \
locale-kgoldrunner-ml \
locale-kgoldrunner-mr \
locale-kgoldrunner-nb \
locale-kgoldrunner-nds \
locale-kgoldrunner-ne \
locale-kgoldrunner-nl \
locale-kgoldrunner-nn \
locale-kgoldrunner-oc \
locale-kgoldrunner-pa \
locale-kgoldrunner-pl \
locale-kgoldrunner-pt \
locale-kgoldrunner-pt-BR \
locale-kgoldrunner-ro \
locale-kgoldrunner-ru \
locale-kgoldrunner-sk \
locale-kgoldrunner-sl \
locale-kgoldrunner-sq \
locale-kgoldrunner-sr \
locale-kgoldrunner-sr@ijekavian \
locale-kgoldrunner-sr@ijekavianlatin \
locale-kgoldrunner-sr@latin \
locale-kgoldrunner-sv \
locale-kgoldrunner-ta \
locale-kgoldrunner-te \
locale-kgoldrunner-tr \
locale-kgoldrunner-ug \
locale-kgoldrunner-uk \
locale-kgoldrunner-zh-CN \
locale-kgoldrunner-zh-TW"

RDEPENDS:${PN} += "kgoldrunner"

inherit rpm
