SUMMARY = "Translations for package kreversi"
DESCRIPTION = "Provides translations for the 'kreversi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kreversi-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "dc976ca1984e6f1284d615b7a20625768ac93277814d4e88f1b9b30759fafb2e9cd1b22645f6e397d087a90c2510e1ed2dc9c73a60d072868e33f921aa5b9f34"
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
