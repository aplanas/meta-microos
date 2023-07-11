SUMMARY = "Translations for package krita"
DESCRIPTION = "Provides translations for the 'krita' package."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & CC0-1.0 & LGPL-2.0-only"

PV = "5.1.5"

RPM_NAME = "krita-lang-5.1.5-2.1.noarch.rpm"
RPM_HASH = "2274851096035c39559674c49c226b2aefde1be290682af7a07a088cbe6c5329f7f68ce016e9114af3a317b4eb6271c7ef3479806dade1375f73a9c4ac1ca116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krita-lang \
krita-lang-all \
locale-krita-af \
locale-krita-ar \
locale-krita-ast \
locale-krita-be \
locale-krita-bg \
locale-krita-br \
locale-krita-bs \
locale-krita-ca \
locale-krita-ca@valencia \
locale-krita-cs \
locale-krita-cy \
locale-krita-da \
locale-krita-de \
locale-krita-el \
locale-krita-en-GB \
locale-krita-eo \
locale-krita-es \
locale-krita-et \
locale-krita-eu \
locale-krita-fa \
locale-krita-fi \
locale-krita-fr \
locale-krita-ga \
locale-krita-gl \
locale-krita-he \
locale-krita-hi \
locale-krita-hr \
locale-krita-hu \
locale-krita-ia \
locale-krita-id \
locale-krita-is \
locale-krita-it \
locale-krita-ja \
locale-krita-ka \
locale-krita-kk \
locale-krita-km \
locale-krita-ko \
locale-krita-lt \
locale-krita-lv \
locale-krita-mai \
locale-krita-mk \
locale-krita-mr \
locale-krita-ms \
locale-krita-nb \
locale-krita-nds \
locale-krita-ne \
locale-krita-nl \
locale-krita-nn \
locale-krita-oc \
locale-krita-pa \
locale-krita-pl \
locale-krita-pt \
locale-krita-pt-BR \
locale-krita-ro \
locale-krita-ru \
locale-krita-sk \
locale-krita-sl \
locale-krita-sq \
locale-krita-sv \
locale-krita-ta \
locale-krita-th \
locale-krita-tr \
locale-krita-ug \
locale-krita-uk \
locale-krita-vi \
locale-krita-wa \
locale-krita-zh-CN \
locale-krita-zh-TW"

RDEPENDS:${PN} += "krita"

inherit rpm
