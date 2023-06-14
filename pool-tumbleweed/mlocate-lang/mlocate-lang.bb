SUMMARY = "Translations for package mlocate"
DESCRIPTION = "Provides translations for the 'mlocate' package."
LICENSE = "GPL-2.0-only"

PV = "0.26"

RPM_NAME = "mlocate-lang-0.26-33.1.noarch.rpm"
RPM_HASH = "5814d6561e88302a39f56b8b7ec0081818c4c3c83616bbd0f92774244502f0edf6ce5ec0229b0c787bec0a40ac1451b73c57c98bcb48a7ae72eec42a70796d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mlocate-ar \
locale-mlocate-as \
locale-mlocate-ast \
locale-mlocate-bg \
locale-mlocate-bs \
locale-mlocate-ca \
locale-mlocate-cs \
locale-mlocate-da \
locale-mlocate-de \
locale-mlocate-el \
locale-mlocate-en-GB \
locale-mlocate-es \
locale-mlocate-et \
locale-mlocate-fa \
locale-mlocate-fi \
locale-mlocate-fr \
locale-mlocate-gu \
locale-mlocate-hu \
locale-mlocate-it \
locale-mlocate-ja \
locale-mlocate-ko \
locale-mlocate-lv \
locale-mlocate-ms \
locale-mlocate-nds \
locale-mlocate-nl \
locale-mlocate-pl \
locale-mlocate-pt \
locale-mlocate-pt-BR \
locale-mlocate-ru \
locale-mlocate-sr \
locale-mlocate-sr@latin \
locale-mlocate-sv \
locale-mlocate-ta \
locale-mlocate-tr \
locale-mlocate-uk \
locale-mlocate-zh-CN \
locale-mlocate-zh-TW \
mlocate-lang \
mlocate-lang-all"

RDEPENDS:${PN} += "mlocate"

inherit rpm
