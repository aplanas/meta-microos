SUMMARY = "Translations for package kreversi"
DESCRIPTION = "Provides translations for the 'kreversi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kreversi-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "5c5b8347e7fab416ff4e6e6c84e6f61462634c60d3c9492d9918fcbd7f20406c7202d3a395edb06367098b7f1428b1cfe845349aae39ee29810b32df5aded8bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kreversi-lang \
kreversi-lang-all \
locale-kreversi-af \
locale-kreversi-ar \
locale-kreversi-be \
locale-kreversi-bg \
locale-kreversi-bn \
locale-kreversi-br \
locale-kreversi-bs \
locale-kreversi-ca \
locale-kreversi-ca@valencia \
locale-kreversi-cs \
locale-kreversi-cy \
locale-kreversi-da \
locale-kreversi-de \
locale-kreversi-el \
locale-kreversi-en-GB \
locale-kreversi-eo \
locale-kreversi-es \
locale-kreversi-et \
locale-kreversi-eu \
locale-kreversi-fa \
locale-kreversi-fi \
locale-kreversi-fr \
locale-kreversi-ga \
locale-kreversi-gl \
locale-kreversi-he \
locale-kreversi-hi \
locale-kreversi-hr \
locale-kreversi-hu \
locale-kreversi-id \
locale-kreversi-is \
locale-kreversi-it \
locale-kreversi-ja \
locale-kreversi-ka \
locale-kreversi-kk \
locale-kreversi-km \
locale-kreversi-ko \
locale-kreversi-lt \
locale-kreversi-lv \
locale-kreversi-mai \
locale-kreversi-mk \
locale-kreversi-ml \
locale-kreversi-mr \
locale-kreversi-nb \
locale-kreversi-nds \
locale-kreversi-ne \
locale-kreversi-nl \
locale-kreversi-nn \
locale-kreversi-oc \
locale-kreversi-pa \
locale-kreversi-pl \
locale-kreversi-pt \
locale-kreversi-pt-BR \
locale-kreversi-ro \
locale-kreversi-ru \
locale-kreversi-sk \
locale-kreversi-sl \
locale-kreversi-sq \
locale-kreversi-sr \
locale-kreversi-sr@ijekavian \
locale-kreversi-sr@ijekavianlatin \
locale-kreversi-sr@latin \
locale-kreversi-sv \
locale-kreversi-ta \
locale-kreversi-th \
locale-kreversi-tr \
locale-kreversi-ug \
locale-kreversi-uk \
locale-kreversi-zh-CN \
locale-kreversi-zh-TW"

RDEPENDS:${PN} += "kreversi"

inherit rpm
