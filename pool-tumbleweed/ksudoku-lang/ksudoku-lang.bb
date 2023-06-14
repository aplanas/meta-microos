SUMMARY = "Translations for package ksudoku"
DESCRIPTION = "Provides translations for the 'ksudoku' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksudoku-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "569a499025dd7ca45b5042b1adbecc7bbee9c41575c64ef0c0cd88f683a68ff1c26ce2c2b4e07b95aa6ce4ad3edac701005fffc35f9d78a17cf2bc28438f62a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksudoku-lang \
ksudoku-lang-all \
locale-ksudoku-ar \
locale-ksudoku-be \
locale-ksudoku-bg \
locale-ksudoku-bs \
locale-ksudoku-ca \
locale-ksudoku-ca@valencia \
locale-ksudoku-cs \
locale-ksudoku-da \
locale-ksudoku-de \
locale-ksudoku-el \
locale-ksudoku-en-GB \
locale-ksudoku-eo \
locale-ksudoku-es \
locale-ksudoku-et \
locale-ksudoku-eu \
locale-ksudoku-fa \
locale-ksudoku-fi \
locale-ksudoku-fr \
locale-ksudoku-ga \
locale-ksudoku-gl \
locale-ksudoku-hi \
locale-ksudoku-hr \
locale-ksudoku-hu \
locale-ksudoku-is \
locale-ksudoku-it \
locale-ksudoku-ja \
locale-ksudoku-ka \
locale-ksudoku-kk \
locale-ksudoku-km \
locale-ksudoku-ko \
locale-ksudoku-lt \
locale-ksudoku-lv \
locale-ksudoku-mai \
locale-ksudoku-ml \
locale-ksudoku-mr \
locale-ksudoku-nb \
locale-ksudoku-nds \
locale-ksudoku-nl \
locale-ksudoku-nn \
locale-ksudoku-oc \
locale-ksudoku-pa \
locale-ksudoku-pl \
locale-ksudoku-pt \
locale-ksudoku-pt-BR \
locale-ksudoku-ro \
locale-ksudoku-ru \
locale-ksudoku-si \
locale-ksudoku-sk \
locale-ksudoku-sl \
locale-ksudoku-sr \
locale-ksudoku-sr@ijekavian \
locale-ksudoku-sr@ijekavianlatin \
locale-ksudoku-sr@latin \
locale-ksudoku-sv \
locale-ksudoku-th \
locale-ksudoku-tr \
locale-ksudoku-ug \
locale-ksudoku-uk \
locale-ksudoku-zh-CN \
locale-ksudoku-zh-TW"

RDEPENDS:${PN} += "ksudoku"

inherit rpm
