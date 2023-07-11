SUMMARY = "Translations for package vte"
DESCRIPTION = "Provides translations for the 'vte' package."
LICENSE = "CC-BY-4.0 & LGPL-3.0-or-later & GPL-3.0-or-later & MIT"

PV = "0.72.2"

RPM_NAME = "vte-lang-0.72.2-1.1.noarch.rpm"
RPM_HASH = "15c6ce72bc1ff705364be39edd9cf1ecbc7799d5d26083416c8b62763ed9697d40d1cedea641e3432a40c4f8541ba817e987996d65664f49098ae96fce364acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vte-ar \
locale-vte-as \
locale-vte-ast \
locale-vte-az \
locale-vte-be \
locale-vte-be@latin \
locale-vte-bg \
locale-vte-bn \
locale-vte-bn-IN \
locale-vte-bs \
locale-vte-ca \
locale-vte-ca@valencia \
locale-vte-cs \
locale-vte-cy \
locale-vte-da \
locale-vte-de \
locale-vte-dz \
locale-vte-el \
locale-vte-en-CA \
locale-vte-en-GB \
locale-vte-en@shaw \
locale-vte-eo \
locale-vte-es \
locale-vte-et \
locale-vte-eu \
locale-vte-fa \
locale-vte-fi \
locale-vte-fr \
locale-vte-fur \
locale-vte-ga \
locale-vte-gd \
locale-vte-gl \
locale-vte-gu \
locale-vte-he \
locale-vte-hi \
locale-vte-hr \
locale-vte-hu \
locale-vte-id \
locale-vte-is \
locale-vte-it \
locale-vte-ja \
locale-vte-ka \
locale-vte-kk \
locale-vte-kn \
locale-vte-ko \
locale-vte-lt \
locale-vte-lv \
locale-vte-mai \
locale-vte-mk \
locale-vte-ml \
locale-vte-mr \
locale-vte-ms \
locale-vte-nb \
locale-vte-nds \
locale-vte-ne \
locale-vte-nl \
locale-vte-nn \
locale-vte-oc \
locale-vte-or \
locale-vte-pa \
locale-vte-pl \
locale-vte-pt \
locale-vte-pt-BR \
locale-vte-ro \
locale-vte-ru \
locale-vte-si \
locale-vte-sk \
locale-vte-sl \
locale-vte-sq \
locale-vte-sr \
locale-vte-sr@latin \
locale-vte-sv \
locale-vte-ta \
locale-vte-te \
locale-vte-th \
locale-vte-tr \
locale-vte-ug \
locale-vte-uk \
locale-vte-vi \
locale-vte-wa \
locale-vte-zh-CN \
locale-vte-zh-HK \
locale-vte-zh-TW \
vte-lang \
vte-lang-all"

RDEPENDS:${PN} += "vte"

inherit rpm
