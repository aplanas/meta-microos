SUMMARY = "Translations for package kiten"
DESCRIPTION = "Provides translations for the 'kiten' package."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "23.04.3"

RPM_NAME = "kiten-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "442627459a910274892253aca37d0fac62b96446746b3ce8c492014f2d73e83b8529e08c4e65c7361e8b17d6798f6285120c834df89383fb9ed0c5366a5a11a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kiten-lang \
kiten-lang-all \
locale-kiten-af \
locale-kiten-ar \
locale-kiten-be \
locale-kiten-bg \
locale-kiten-br \
locale-kiten-bs \
locale-kiten-ca \
locale-kiten-ca@valencia \
locale-kiten-cs \
locale-kiten-cy \
locale-kiten-da \
locale-kiten-de \
locale-kiten-el \
locale-kiten-en-GB \
locale-kiten-eo \
locale-kiten-es \
locale-kiten-et \
locale-kiten-eu \
locale-kiten-fa \
locale-kiten-fi \
locale-kiten-fr \
locale-kiten-ga \
locale-kiten-gl \
locale-kiten-hi \
locale-kiten-hr \
locale-kiten-hu \
locale-kiten-is \
locale-kiten-it \
locale-kiten-ja \
locale-kiten-ka \
locale-kiten-kk \
locale-kiten-km \
locale-kiten-ko \
locale-kiten-lt \
locale-kiten-lv \
locale-kiten-mk \
locale-kiten-ml \
locale-kiten-mr \
locale-kiten-ms \
locale-kiten-nb \
locale-kiten-nds \
locale-kiten-ne \
locale-kiten-nl \
locale-kiten-nn \
locale-kiten-oc \
locale-kiten-pl \
locale-kiten-pt \
locale-kiten-pt-BR \
locale-kiten-ro \
locale-kiten-ru \
locale-kiten-si \
locale-kiten-sk \
locale-kiten-sl \
locale-kiten-sq \
locale-kiten-sv \
locale-kiten-ta \
locale-kiten-tr \
locale-kiten-ug \
locale-kiten-uk \
locale-kiten-zh-CN \
locale-kiten-zh-TW"

RDEPENDS:${PN} += "kiten"

inherit rpm
