SUMMARY = "Translations for package orage"
DESCRIPTION = "Provides translations for the 'orage' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "orage-lang-4.18.0-1.4.noarch.rpm"
RPM_HASH = "ac37bb619545227d9b4c5da4768248b5b27a5ba0db66ce88c5474452ce102bc041aacad60260e6a7c6dbae3afef17ff4c6f158cfa250fd0a28abc8818f0518a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-orage-ar \
locale-orage-ast \
locale-orage-be \
locale-orage-bg \
locale-orage-ca \
locale-orage-cs \
locale-orage-da \
locale-orage-de \
locale-orage-el \
locale-orage-en-AU \
locale-orage-en-GB \
locale-orage-eo \
locale-orage-es \
locale-orage-et \
locale-orage-eu \
locale-orage-fi \
locale-orage-fr \
locale-orage-gl \
locale-orage-he \
locale-orage-hr \
locale-orage-hu \
locale-orage-id \
locale-orage-is \
locale-orage-it \
locale-orage-ja \
locale-orage-kk \
locale-orage-ko \
locale-orage-lt \
locale-orage-lv \
locale-orage-ms \
locale-orage-nb \
locale-orage-nl \
locale-orage-nn \
locale-orage-oc \
locale-orage-pa \
locale-orage-pl \
locale-orage-pt \
locale-orage-pt-BR \
locale-orage-ro \
locale-orage-ru \
locale-orage-si \
locale-orage-sk \
locale-orage-sq \
locale-orage-sr \
locale-orage-sv \
locale-orage-th \
locale-orage-tr \
locale-orage-ug \
locale-orage-uk \
locale-orage-vi \
locale-orage-zh-CN \
locale-orage-zh-TW \
orage-lang \
orage-lang-all"

RDEPENDS:${PN} += "orage"

inherit rpm
