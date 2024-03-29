SUMMARY = "Translations for package mate-tweak"
DESCRIPTION = "Provides translations for the 'mate-tweak' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.10.0"

RPM_NAME = "mate-tweak-lang-22.10.0-1.2.noarch.rpm"
RPM_HASH = "fa18594f115419ba0b9c33829018dec331919956a99a6ab60ea35fef78e7bd7ea702c41b0d85df6d52fedba17fadcca3ba0fea753acc0645c5b8f9a4329826c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-tweak-af \
locale-mate-tweak-ar \
locale-mate-tweak-as \
locale-mate-tweak-ast \
locale-mate-tweak-az \
locale-mate-tweak-be \
locale-mate-tweak-bg \
locale-mate-tweak-bn \
locale-mate-tweak-bn-IN \
locale-mate-tweak-br \
locale-mate-tweak-bs \
locale-mate-tweak-ca \
locale-mate-tweak-ca@valencia \
locale-mate-tweak-cs \
locale-mate-tweak-cy \
locale-mate-tweak-da \
locale-mate-tweak-de \
locale-mate-tweak-de-CH \
locale-mate-tweak-dz \
locale-mate-tweak-el \
locale-mate-tweak-en \
locale-mate-tweak-en-AU \
locale-mate-tweak-en-CA \
locale-mate-tweak-en-GB \
locale-mate-tweak-en-US \
locale-mate-tweak-eo \
locale-mate-tweak-es \
locale-mate-tweak-es-AR \
locale-mate-tweak-es-CL \
locale-mate-tweak-es-CO \
locale-mate-tweak-es-CR \
locale-mate-tweak-es-DO \
locale-mate-tweak-es-EC \
locale-mate-tweak-es-ES \
locale-mate-tweak-es-MX \
locale-mate-tweak-es-NI \
locale-mate-tweak-es-PA \
locale-mate-tweak-es-PE \
locale-mate-tweak-es-PR \
locale-mate-tweak-es-SV \
locale-mate-tweak-es-UY \
locale-mate-tweak-es-VE \
locale-mate-tweak-et \
locale-mate-tweak-eu \
locale-mate-tweak-fa \
locale-mate-tweak-fi \
locale-mate-tweak-fr \
locale-mate-tweak-fr-CA \
locale-mate-tweak-fr-FR \
locale-mate-tweak-fur \
locale-mate-tweak-ga \
locale-mate-tweak-gd \
locale-mate-tweak-gl \
locale-mate-tweak-gu \
locale-mate-tweak-he \
locale-mate-tweak-hi \
locale-mate-tweak-hr \
locale-mate-tweak-hu \
locale-mate-tweak-ia \
locale-mate-tweak-id \
locale-mate-tweak-is \
locale-mate-tweak-it \
locale-mate-tweak-ja \
locale-mate-tweak-ka \
locale-mate-tweak-kk \
locale-mate-tweak-km \
locale-mate-tweak-kn \
locale-mate-tweak-ko \
locale-mate-tweak-lt \
locale-mate-tweak-lv \
locale-mate-tweak-mai \
locale-mate-tweak-mk \
locale-mate-tweak-ml \
locale-mate-tweak-mr \
locale-mate-tweak-ms \
locale-mate-tweak-nb \
locale-mate-tweak-nds \
locale-mate-tweak-ne \
locale-mate-tweak-nl \
locale-mate-tweak-nn \
locale-mate-tweak-oc \
locale-mate-tweak-or \
locale-mate-tweak-pa \
locale-mate-tweak-pl \
locale-mate-tweak-pl-PL \
locale-mate-tweak-pt \
locale-mate-tweak-pt-BR \
locale-mate-tweak-ro \
locale-mate-tweak-ru \
locale-mate-tweak-ru-RU \
locale-mate-tweak-si \
locale-mate-tweak-sk \
locale-mate-tweak-sl \
locale-mate-tweak-sq \
locale-mate-tweak-sr \
locale-mate-tweak-sr@latin \
locale-mate-tweak-sv \
locale-mate-tweak-ta \
locale-mate-tweak-te \
locale-mate-tweak-th \
locale-mate-tweak-tr \
locale-mate-tweak-ug \
locale-mate-tweak-uk \
locale-mate-tweak-uk-UA \
locale-mate-tweak-vi \
locale-mate-tweak-wa \
locale-mate-tweak-zh-CN \
locale-mate-tweak-zh-HK \
locale-mate-tweak-zh-TW \
mate-tweak-lang \
mate-tweak-lang-all"

RDEPENDS:${PN} += "mate-tweak"

inherit rpm
