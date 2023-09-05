SUMMARY = "Translations for package kcalutils"
DESCRIPTION = "Provides translations for the 'kcalutils' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kcalutils-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b1d4297ebb13faf3bb4453d5fde322cc90ad2ecd8b11a08869b897c76f91adbadda9cb0d36c64df3070ec03f83404533b3a5ef0dc7fbde04a4da65431357a32a"
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
