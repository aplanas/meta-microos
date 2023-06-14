SUMMARY = "Translations for package mate-panel"
DESCRIPTION = "Provides translations for the 'mate-panel' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "mate-panel-lang-1.26.3-1.1.noarch.rpm"
RPM_HASH = "11d4791832e63d6ddef4a4d4a3bc1dbf3d4be19513d703ecbac06c25d5847be4e2475b3a8efc98fee65a312e69a3c30063ef10134f14a7dd3798641fd2b7b2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-panel-af \
locale-mate-panel-ar \
locale-mate-panel-as \
locale-mate-panel-ast \
locale-mate-panel-az \
locale-mate-panel-be \
locale-mate-panel-bg \
locale-mate-panel-bn \
locale-mate-panel-bn-IN \
locale-mate-panel-br \
locale-mate-panel-bs \
locale-mate-panel-ca \
locale-mate-panel-ca@valencia \
locale-mate-panel-cs \
locale-mate-panel-cy \
locale-mate-panel-da \
locale-mate-panel-de \
locale-mate-panel-dz \
locale-mate-panel-el \
locale-mate-panel-en-AU \
locale-mate-panel-en-CA \
locale-mate-panel-en-GB \
locale-mate-panel-en-US \
locale-mate-panel-eo \
locale-mate-panel-es \
locale-mate-panel-es-AR \
locale-mate-panel-es-CL \
locale-mate-panel-es-CO \
locale-mate-panel-es-CR \
locale-mate-panel-es-DO \
locale-mate-panel-es-EC \
locale-mate-panel-es-ES \
locale-mate-panel-es-MX \
locale-mate-panel-es-NI \
locale-mate-panel-es-PA \
locale-mate-panel-es-PE \
locale-mate-panel-es-PR \
locale-mate-panel-es-SV \
locale-mate-panel-es-UY \
locale-mate-panel-es-VE \
locale-mate-panel-et \
locale-mate-panel-eu \
locale-mate-panel-fa \
locale-mate-panel-fi \
locale-mate-panel-fr \
locale-mate-panel-fr-CA \
locale-mate-panel-fur \
locale-mate-panel-ga \
locale-mate-panel-gl \
locale-mate-panel-gu \
locale-mate-panel-he \
locale-mate-panel-hi \
locale-mate-panel-hr \
locale-mate-panel-hu \
locale-mate-panel-ia \
locale-mate-panel-id \
locale-mate-panel-is \
locale-mate-panel-it \
locale-mate-panel-ja \
locale-mate-panel-ka \
locale-mate-panel-kk \
locale-mate-panel-km \
locale-mate-panel-kn \
locale-mate-panel-ko \
locale-mate-panel-lt \
locale-mate-panel-lv \
locale-mate-panel-mai \
locale-mate-panel-mk \
locale-mate-panel-ml \
locale-mate-panel-mr \
locale-mate-panel-ms \
locale-mate-panel-nb \
locale-mate-panel-nds \
locale-mate-panel-ne \
locale-mate-panel-nl \
locale-mate-panel-nn \
locale-mate-panel-oc \
locale-mate-panel-or \
locale-mate-panel-pa \
locale-mate-panel-pl \
locale-mate-panel-pt \
locale-mate-panel-pt-BR \
locale-mate-panel-ro \
locale-mate-panel-ru \
locale-mate-panel-si \
locale-mate-panel-sk \
locale-mate-panel-sl \
locale-mate-panel-sq \
locale-mate-panel-sr \
locale-mate-panel-sr@latin \
locale-mate-panel-sv \
locale-mate-panel-ta \
locale-mate-panel-te \
locale-mate-panel-th \
locale-mate-panel-tr \
locale-mate-panel-ug \
locale-mate-panel-uk \
locale-mate-panel-vi \
locale-mate-panel-wa \
locale-mate-panel-zh-CN \
locale-mate-panel-zh-HK \
locale-mate-panel-zh-TW \
mate-panel-lang \
mate-panel-lang-all"

RDEPENDS:${PN} += "mate-panel"

inherit rpm
