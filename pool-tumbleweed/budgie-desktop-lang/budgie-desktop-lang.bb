SUMMARY = "Translations for package budgie-desktop"
DESCRIPTION = "Provides translations for the 'budgie-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "budgie-desktop-lang-10.8+0-1.1.noarch.rpm"
RPM_HASH = "b9f0b7bab22ee1e952087d62a6d4b21efe8e0b631265ce138932a436c2c15b70161dfa915b513f4b8446c46dec129b1a0cbfdfd6735bd5c6e3173e1b8a592af0"
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
locale-budgie-desktop-et \
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
