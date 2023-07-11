SUMMARY = "Translations for package kcalutils"
DESCRIPTION = "Provides translations for the 'kcalutils' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kcalutils-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "b5f68e1aaa73610fdf484b5037b76034d1823d963903d2f7feb61db62121c8c7055b8520f74584087040470492a6b61358576d557376ce07eb6329c3d868ace8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcalutils-lang \
kcalutils-lang-all \
locale-kcalutils-ar \
locale-kcalutils-az \
locale-kcalutils-bg \
locale-kcalutils-bs \
locale-kcalutils-ca \
locale-kcalutils-ca@valencia \
locale-kcalutils-cs \
locale-kcalutils-da \
locale-kcalutils-de \
locale-kcalutils-el \
locale-kcalutils-en-GB \
locale-kcalutils-es \
locale-kcalutils-et \
locale-kcalutils-eu \
locale-kcalutils-fi \
locale-kcalutils-fr \
locale-kcalutils-ga \
locale-kcalutils-gl \
locale-kcalutils-hr \
locale-kcalutils-hu \
locale-kcalutils-ia \
locale-kcalutils-it \
locale-kcalutils-ja \
locale-kcalutils-ka \
locale-kcalutils-kk \
locale-kcalutils-km \
locale-kcalutils-ko \
locale-kcalutils-lt \
locale-kcalutils-mai \
locale-kcalutils-mr \
locale-kcalutils-nb \
locale-kcalutils-nds \
locale-kcalutils-nl \
locale-kcalutils-nn \
locale-kcalutils-pa \
locale-kcalutils-pl \
locale-kcalutils-pt \
locale-kcalutils-pt-BR \
locale-kcalutils-ro \
locale-kcalutils-ru \
locale-kcalutils-sk \
locale-kcalutils-sl \
locale-kcalutils-sr \
locale-kcalutils-sr@ijekavian \
locale-kcalutils-sr@ijekavianlatin \
locale-kcalutils-sr@latin \
locale-kcalutils-sv \
locale-kcalutils-ta \
locale-kcalutils-tr \
locale-kcalutils-ug \
locale-kcalutils-uk \
locale-kcalutils-zh-CN \
locale-kcalutils-zh-TW"

RDEPENDS:${PN} += "kcalutils"

inherit rpm
