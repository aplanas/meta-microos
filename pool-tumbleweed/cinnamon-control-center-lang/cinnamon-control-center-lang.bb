SUMMARY = "Translations for package cinnamon-control-center"
DESCRIPTION = "Provides translations for the 'cinnamon-control-center' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.2"

RPM_NAME = "cinnamon-control-center-lang-5.8.2-1.1.noarch.rpm"
RPM_HASH = "dd83ccdacbc25c3c989d652c5a2c5e72c3b3b6b54eebe5d271eca03ac1ef47620d17026dec3cd5082be009213ddb31cb7052ba448495012422bb295b5ea25fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-control-center-lang \
cinnamon-control-center-lang-all \
locale-cinnamon-control-center-af \
locale-cinnamon-control-center-ar \
locale-cinnamon-control-center-as \
locale-cinnamon-control-center-ast \
locale-cinnamon-control-center-az \
locale-cinnamon-control-center-be \
locale-cinnamon-control-center-be@latin \
locale-cinnamon-control-center-bg \
locale-cinnamon-control-center-bn \
locale-cinnamon-control-center-bn-IN \
locale-cinnamon-control-center-br \
locale-cinnamon-control-center-bs \
locale-cinnamon-control-center-ca \
locale-cinnamon-control-center-ca@valencia \
locale-cinnamon-control-center-cs \
locale-cinnamon-control-center-cy \
locale-cinnamon-control-center-da \
locale-cinnamon-control-center-de \
locale-cinnamon-control-center-dz \
locale-cinnamon-control-center-el \
locale-cinnamon-control-center-en-AU \
locale-cinnamon-control-center-en-CA \
locale-cinnamon-control-center-en-GB \
locale-cinnamon-control-center-en@shaw \
locale-cinnamon-control-center-eo \
locale-cinnamon-control-center-es \
locale-cinnamon-control-center-et \
locale-cinnamon-control-center-eu \
locale-cinnamon-control-center-fa \
locale-cinnamon-control-center-fi \
locale-cinnamon-control-center-fr \
locale-cinnamon-control-center-fr-CA \
locale-cinnamon-control-center-ga \
locale-cinnamon-control-center-gd \
locale-cinnamon-control-center-gl \
locale-cinnamon-control-center-gu \
locale-cinnamon-control-center-he \
locale-cinnamon-control-center-hi \
locale-cinnamon-control-center-hr \
locale-cinnamon-control-center-hu \
locale-cinnamon-control-center-ia \
locale-cinnamon-control-center-id \
locale-cinnamon-control-center-is \
locale-cinnamon-control-center-it \
locale-cinnamon-control-center-ja \
locale-cinnamon-control-center-ka \
locale-cinnamon-control-center-kk \
locale-cinnamon-control-center-km \
locale-cinnamon-control-center-kn \
locale-cinnamon-control-center-ko \
locale-cinnamon-control-center-lt \
locale-cinnamon-control-center-lv \
locale-cinnamon-control-center-mai \
locale-cinnamon-control-center-mk \
locale-cinnamon-control-center-ml \
locale-cinnamon-control-center-mr \
locale-cinnamon-control-center-ms \
locale-cinnamon-control-center-nb \
locale-cinnamon-control-center-nds \
locale-cinnamon-control-center-ne \
locale-cinnamon-control-center-nl \
locale-cinnamon-control-center-nn \
locale-cinnamon-control-center-oc \
locale-cinnamon-control-center-or \
locale-cinnamon-control-center-pa \
locale-cinnamon-control-center-pl \
locale-cinnamon-control-center-pt \
locale-cinnamon-control-center-pt-BR \
locale-cinnamon-control-center-ro \
locale-cinnamon-control-center-ru \
locale-cinnamon-control-center-si \
locale-cinnamon-control-center-sk \
locale-cinnamon-control-center-sl \
locale-cinnamon-control-center-sq \
locale-cinnamon-control-center-sr \
locale-cinnamon-control-center-sr@latin \
locale-cinnamon-control-center-sv \
locale-cinnamon-control-center-ta \
locale-cinnamon-control-center-te \
locale-cinnamon-control-center-th \
locale-cinnamon-control-center-tr \
locale-cinnamon-control-center-ug \
locale-cinnamon-control-center-uk \
locale-cinnamon-control-center-vi \
locale-cinnamon-control-center-wa \
locale-cinnamon-control-center-zh-CN \
locale-cinnamon-control-center-zh-HK \
locale-cinnamon-control-center-zh-TW"

RDEPENDS:${PN} += "cinnamon-control-center"

inherit rpm
