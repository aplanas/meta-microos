SUMMARY = "Translations for package eom"
DESCRIPTION = "Provides translations for the 'eom' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "eom-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "6f57ea9f643d34991cef16802b89d0beba924a961cf9bd20e0af2196bf3c632cbb13ccac2a69c9892d727fbcd4079d40b69fbdf8fa83ca417439b2a4211f9bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eom-lang \
eom-lang-all \
locale-eom-af \
locale-eom-ar \
locale-eom-as \
locale-eom-ast \
locale-eom-az \
locale-eom-be \
locale-eom-bg \
locale-eom-bn \
locale-eom-bn-IN \
locale-eom-br \
locale-eom-bs \
locale-eom-ca \
locale-eom-ca@valencia \
locale-eom-cs \
locale-eom-cy \
locale-eom-da \
locale-eom-de \
locale-eom-dz \
locale-eom-el \
locale-eom-en-AU \
locale-eom-en-CA \
locale-eom-en-GB \
locale-eom-en-US \
locale-eom-eo \
locale-eom-es \
locale-eom-es-AR \
locale-eom-es-CL \
locale-eom-es-CO \
locale-eom-es-CR \
locale-eom-es-DO \
locale-eom-es-EC \
locale-eom-es-ES \
locale-eom-es-MX \
locale-eom-es-NI \
locale-eom-es-PA \
locale-eom-es-PE \
locale-eom-es-PR \
locale-eom-es-SV \
locale-eom-es-UY \
locale-eom-es-VE \
locale-eom-et \
locale-eom-eu \
locale-eom-fa \
locale-eom-fi \
locale-eom-fr \
locale-eom-fr-CA \
locale-eom-fur \
locale-eom-ga \
locale-eom-gd \
locale-eom-gl \
locale-eom-gu \
locale-eom-he \
locale-eom-hi \
locale-eom-hr \
locale-eom-hu \
locale-eom-ia \
locale-eom-id \
locale-eom-is \
locale-eom-it \
locale-eom-ja \
locale-eom-ka \
locale-eom-kk \
locale-eom-km \
locale-eom-kn \
locale-eom-ko \
locale-eom-lt \
locale-eom-lv \
locale-eom-mai \
locale-eom-mk \
locale-eom-ml \
locale-eom-mr \
locale-eom-ms \
locale-eom-nb \
locale-eom-nds \
locale-eom-ne \
locale-eom-nl \
locale-eom-nn \
locale-eom-oc \
locale-eom-or \
locale-eom-pa \
locale-eom-pl \
locale-eom-pt \
locale-eom-pt-BR \
locale-eom-ro \
locale-eom-ru \
locale-eom-si \
locale-eom-sk \
locale-eom-sl \
locale-eom-sq \
locale-eom-sr \
locale-eom-sr@latin \
locale-eom-sv \
locale-eom-ta \
locale-eom-te \
locale-eom-th \
locale-eom-tr \
locale-eom-ug \
locale-eom-uk \
locale-eom-vi \
locale-eom-wa \
locale-eom-zh-CN \
locale-eom-zh-HK \
locale-eom-zh-TW"

RDEPENDS:${PN} += "eom"

inherit rpm
