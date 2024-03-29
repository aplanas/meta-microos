SUMMARY = "Translations for package caja"
DESCRIPTION = "Provides translations for the 'caja' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-lang-1.26.1-1.5.noarch.rpm"
RPM_HASH = "383debfffb471d7a70cb21558d3a72e4a8d4dfddd3dc9c605be10e0efebc9ca258f2b9e9aea60491936202e1169454c0076a3e85b25aa6a213d081c258106d13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-lang \
caja-lang-all \
locale-caja-af \
locale-caja-ar \
locale-caja-as \
locale-caja-ast \
locale-caja-az \
locale-caja-be \
locale-caja-bg \
locale-caja-bn \
locale-caja-bn-IN \
locale-caja-br \
locale-caja-bs \
locale-caja-ca \
locale-caja-ca@valencia \
locale-caja-cs \
locale-caja-cy \
locale-caja-da \
locale-caja-de \
locale-caja-dz \
locale-caja-el \
locale-caja-en-AU \
locale-caja-en-CA \
locale-caja-en-GB \
locale-caja-eo \
locale-caja-es \
locale-caja-es-AR \
locale-caja-es-CL \
locale-caja-es-CO \
locale-caja-es-ES \
locale-caja-es-MX \
locale-caja-es-PR \
locale-caja-et \
locale-caja-eu \
locale-caja-fa \
locale-caja-fi \
locale-caja-fr \
locale-caja-fr-CA \
locale-caja-fur \
locale-caja-ga \
locale-caja-gd \
locale-caja-gl \
locale-caja-gu \
locale-caja-he \
locale-caja-hi \
locale-caja-hr \
locale-caja-hu \
locale-caja-ia \
locale-caja-id \
locale-caja-is \
locale-caja-it \
locale-caja-ja \
locale-caja-ka \
locale-caja-kk \
locale-caja-km \
locale-caja-kn \
locale-caja-ko \
locale-caja-lt \
locale-caja-lv \
locale-caja-mai \
locale-caja-mk \
locale-caja-ml \
locale-caja-mr \
locale-caja-ms \
locale-caja-nb \
locale-caja-nds \
locale-caja-ne \
locale-caja-nl \
locale-caja-nn \
locale-caja-oc \
locale-caja-or \
locale-caja-pa \
locale-caja-pl \
locale-caja-pt \
locale-caja-pt-BR \
locale-caja-ro \
locale-caja-ru \
locale-caja-si \
locale-caja-sk \
locale-caja-sl \
locale-caja-sq \
locale-caja-sr \
locale-caja-sr@latin \
locale-caja-sv \
locale-caja-ta \
locale-caja-te \
locale-caja-th \
locale-caja-tr \
locale-caja-ug \
locale-caja-uk \
locale-caja-vi \
locale-caja-wa \
locale-caja-zh-CN \
locale-caja-zh-HK \
locale-caja-zh-TW"

RDEPENDS:${PN} += "caja"

inherit rpm
