SUMMARY = "Translations for package kig"
DESCRIPTION = "Provides translations for the 'kig' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kig-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "d625ba2baea9f0803e1fb4c64c876c4b8fa5449c502b9131d6bc39845709daa9dd3fd72b5af0c2363145a37174edfdaa2636e771ca3fe92d32eb60549dac67bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kig-lang \
kig-lang-all \
locale-kig-ar \
locale-kig-be \
locale-kig-bg \
locale-kig-bn \
locale-kig-br \
locale-kig-bs \
locale-kig-ca \
locale-kig-ca@valencia \
locale-kig-cs \
locale-kig-cy \
locale-kig-da \
locale-kig-de \
locale-kig-el \
locale-kig-en-GB \
locale-kig-eo \
locale-kig-es \
locale-kig-et \
locale-kig-eu \
locale-kig-fa \
locale-kig-fi \
locale-kig-fr \
locale-kig-ga \
locale-kig-gl \
locale-kig-hi \
locale-kig-hr \
locale-kig-hu \
locale-kig-is \
locale-kig-it \
locale-kig-ja \
locale-kig-ka \
locale-kig-kk \
locale-kig-km \
locale-kig-lt \
locale-kig-lv \
locale-kig-mai \
locale-kig-mk \
locale-kig-ml \
locale-kig-mr \
locale-kig-ms \
locale-kig-nb \
locale-kig-nds \
locale-kig-ne \
locale-kig-nl \
locale-kig-nn \
locale-kig-oc \
locale-kig-pa \
locale-kig-pl \
locale-kig-pt \
locale-kig-pt-BR \
locale-kig-ro \
locale-kig-ru \
locale-kig-si \
locale-kig-sk \
locale-kig-sl \
locale-kig-sq \
locale-kig-sv \
locale-kig-ta \
locale-kig-tr \
locale-kig-ug \
locale-kig-uk \
locale-kig-zh-CN \
locale-kig-zh-TW"

RDEPENDS:${PN} += "kig"

inherit rpm
