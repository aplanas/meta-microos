SUMMARY = "Translations for package telly-skout"
DESCRIPTION = "Provides translations for the 'telly-skout' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "telly-skout-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "625b15bb9f2702f4ed9691cf245f28bea29d2b02e6802b067f3ee35b454e576b3265ff41f11a94c8ca6a166b76f7fb63b4002e5033327837904d2718d15342f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-telly-skout-ca \
locale-telly-skout-ca@valencia \
locale-telly-skout-cs \
locale-telly-skout-de \
locale-telly-skout-en-GB \
locale-telly-skout-es \
locale-telly-skout-eu \
locale-telly-skout-fi \
locale-telly-skout-fr \
locale-telly-skout-gl \
locale-telly-skout-it \
locale-telly-skout-ja \
locale-telly-skout-ka \
locale-telly-skout-ko \
locale-telly-skout-lt \
locale-telly-skout-nl \
locale-telly-skout-pt \
locale-telly-skout-pt-BR \
locale-telly-skout-ru \
locale-telly-skout-sk \
locale-telly-skout-sl \
locale-telly-skout-sv \
locale-telly-skout-tr \
locale-telly-skout-uk \
locale-telly-skout-zh-CN \
locale-telly-skout-zh-TW \
telly-skout-lang \
telly-skout-lang-all"

RDEPENDS:${PN} += "telly-skout"

inherit rpm
