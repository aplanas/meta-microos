SUMMARY = "Translations for package engrampa"
DESCRIPTION = "Provides translations for the 'engrampa' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "engrampa-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "480274e9045ab07fcb3cdae52b027afde35353ed74834a694b4666ac2dcc41e0cea6b3163fda576e33a3e50693553a5c8f0409572138f984e0d35a66bbfb55fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "engrampa-lang \
engrampa-lang-all \
locale-engrampa-af \
locale-engrampa-ar \
locale-engrampa-as \
locale-engrampa-ast \
locale-engrampa-az \
locale-engrampa-be \
locale-engrampa-bg \
locale-engrampa-bn \
locale-engrampa-bn-IN \
locale-engrampa-br \
locale-engrampa-bs \
locale-engrampa-ca \
locale-engrampa-ca@valencia \
locale-engrampa-cs \
locale-engrampa-cy \
locale-engrampa-da \
locale-engrampa-de \
locale-engrampa-dz \
locale-engrampa-el \
locale-engrampa-en-AU \
locale-engrampa-en-CA \
locale-engrampa-en-GB \
locale-engrampa-en-US \
locale-engrampa-eo \
locale-engrampa-es \
locale-engrampa-es-AR \
locale-engrampa-es-CL \
locale-engrampa-es-CO \
locale-engrampa-es-CR \
locale-engrampa-es-DO \
locale-engrampa-es-EC \
locale-engrampa-es-ES \
locale-engrampa-es-MX \
locale-engrampa-es-NI \
locale-engrampa-es-PA \
locale-engrampa-es-PE \
locale-engrampa-es-PR \
locale-engrampa-es-SV \
locale-engrampa-es-UY \
locale-engrampa-es-VE \
locale-engrampa-et \
locale-engrampa-eu \
locale-engrampa-fa \
locale-engrampa-fi \
locale-engrampa-fr \
locale-engrampa-fr-CA \
locale-engrampa-fur \
locale-engrampa-ga \
locale-engrampa-gd \
locale-engrampa-gl \
locale-engrampa-gu \
locale-engrampa-he \
locale-engrampa-hi \
locale-engrampa-hr \
locale-engrampa-hu \
locale-engrampa-ia \
locale-engrampa-id \
locale-engrampa-is \
locale-engrampa-it \
locale-engrampa-ja \
locale-engrampa-ka \
locale-engrampa-kk \
locale-engrampa-kn \
locale-engrampa-ko \
locale-engrampa-lt \
locale-engrampa-lv \
locale-engrampa-mai \
locale-engrampa-mk \
locale-engrampa-ml \
locale-engrampa-mr \
locale-engrampa-ms \
locale-engrampa-nb \
locale-engrampa-nds \
locale-engrampa-ne \
locale-engrampa-nl \
locale-engrampa-nn \
locale-engrampa-oc \
locale-engrampa-or \
locale-engrampa-pa \
locale-engrampa-pl \
locale-engrampa-pt \
locale-engrampa-pt-BR \
locale-engrampa-ro \
locale-engrampa-ru \
locale-engrampa-si \
locale-engrampa-sk \
locale-engrampa-sl \
locale-engrampa-sq \
locale-engrampa-sr \
locale-engrampa-sr@latin \
locale-engrampa-sv \
locale-engrampa-ta \
locale-engrampa-te \
locale-engrampa-th \
locale-engrampa-tr \
locale-engrampa-ug \
locale-engrampa-uk \
locale-engrampa-vi \
locale-engrampa-wa \
locale-engrampa-zh-CN \
locale-engrampa-zh-HK \
locale-engrampa-zh-TW"

RDEPENDS:${PN} += "engrampa"

inherit rpm
