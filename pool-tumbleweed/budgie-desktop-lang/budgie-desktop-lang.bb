SUMMARY = "Translations for package budgie-desktop"
DESCRIPTION = "Provides translations for the 'budgie-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "budgie-desktop-lang-10.7.2+0-1.2.noarch.rpm"
RPM_HASH = "08324997f6a56f92369cc57fe1487bf6adc66cda46fc672de78fb34d5668da45010b80f0697c9492bac77024d516c33461876e1a368784be9902a440143189a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-lang \
budgie-desktop-lang-all \
locale-budgie-desktop-af \
locale-budgie-desktop-ar \
locale-budgie-desktop-be \
locale-budgie-desktop-bg \
locale-budgie-desktop-bn \
locale-budgie-desktop-br \
locale-budgie-desktop-bs \
locale-budgie-desktop-ca \
locale-budgie-desktop-cs \
locale-budgie-desktop-da \
locale-budgie-desktop-de \
locale-budgie-desktop-de-CH \
locale-budgie-desktop-el-GR \
locale-budgie-desktop-en-AU \
locale-budgie-desktop-en-GB \
locale-budgie-desktop-en-US \
locale-budgie-desktop-eo \
locale-budgie-desktop-es \
locale-budgie-desktop-es-AR \
locale-budgie-desktop-es-CL \
locale-budgie-desktop-es-MX \
locale-budgie-desktop-es-PE \
locale-budgie-desktop-eu \
locale-budgie-desktop-fi \
locale-budgie-desktop-fr \
locale-budgie-desktop-fr-FR \
locale-budgie-desktop-ga \
locale-budgie-desktop-gl \
locale-budgie-desktop-he \
locale-budgie-desktop-hi \
locale-budgie-desktop-hr \
locale-budgie-desktop-hu \
locale-budgie-desktop-id \
locale-budgie-desktop-it \
locale-budgie-desktop-ja \
locale-budgie-desktop-ka \
locale-budgie-desktop-ko \
locale-budgie-desktop-lt \
locale-budgie-desktop-lv \
locale-budgie-desktop-ne \
locale-budgie-desktop-nl \
locale-budgie-desktop-nl-BE \
locale-budgie-desktop-nn \
locale-budgie-desktop-oc \
locale-budgie-desktop-pa \
locale-budgie-desktop-pl \
locale-budgie-desktop-pt \
locale-budgie-desktop-pt-BR \
locale-budgie-desktop-ro \
locale-budgie-desktop-ru \
locale-budgie-desktop-si \
locale-budgie-desktop-sk \
locale-budgie-desktop-sl \
locale-budgie-desktop-sq \
locale-budgie-desktop-sv \
locale-budgie-desktop-tr \
locale-budgie-desktop-uk \
locale-budgie-desktop-uk-UA \
locale-budgie-desktop-vi \
locale-budgie-desktop-zh \
locale-budgie-desktop-zh-HK \
locale-budgie-desktop-zh-TW"

RDEPENDS:${PN} += "budgie-desktop"

inherit rpm
