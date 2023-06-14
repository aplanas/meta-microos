SUMMARY = "Translations for package kcolorchooser"
DESCRIPTION = "Provides translations for the 'kcolorchooser' package."
LICENSE = "MIT"

PV = "23.04.1"

RPM_NAME = "kcolorchooser-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "2f42e404535ebdfb3ab81461a6229605edc4a4a1867c6a6c83897b5782dc5cf8f149517af8647cba3080f6601d40a1c8bc89a49acf84cdaa3007e0e092259e5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcolorchooser-lang \
kcolorchooser-lang-all \
locale-kcolorchooser-ar \
locale-kcolorchooser-az \
locale-kcolorchooser-be \
locale-kcolorchooser-bg \
locale-kcolorchooser-bs \
locale-kcolorchooser-ca \
locale-kcolorchooser-ca@valencia \
locale-kcolorchooser-cs \
locale-kcolorchooser-da \
locale-kcolorchooser-de \
locale-kcolorchooser-el \
locale-kcolorchooser-en-GB \
locale-kcolorchooser-eo \
locale-kcolorchooser-es \
locale-kcolorchooser-et \
locale-kcolorchooser-eu \
locale-kcolorchooser-fi \
locale-kcolorchooser-fr \
locale-kcolorchooser-ga \
locale-kcolorchooser-gl \
locale-kcolorchooser-he \
locale-kcolorchooser-hi \
locale-kcolorchooser-hr \
locale-kcolorchooser-hu \
locale-kcolorchooser-ia \
locale-kcolorchooser-is \
locale-kcolorchooser-it \
locale-kcolorchooser-ja \
locale-kcolorchooser-ka \
locale-kcolorchooser-kk \
locale-kcolorchooser-km \
locale-kcolorchooser-ko \
locale-kcolorchooser-lt \
locale-kcolorchooser-lv \
locale-kcolorchooser-mk \
locale-kcolorchooser-ml \
locale-kcolorchooser-mr \
locale-kcolorchooser-nb \
locale-kcolorchooser-nds \
locale-kcolorchooser-nl \
locale-kcolorchooser-nn \
locale-kcolorchooser-oc \
locale-kcolorchooser-pa \
locale-kcolorchooser-pl \
locale-kcolorchooser-pt \
locale-kcolorchooser-pt-BR \
locale-kcolorchooser-ro \
locale-kcolorchooser-ru \
locale-kcolorchooser-si \
locale-kcolorchooser-sk \
locale-kcolorchooser-sl \
locale-kcolorchooser-sq \
locale-kcolorchooser-sr \
locale-kcolorchooser-sr@ijekavian \
locale-kcolorchooser-sr@ijekavianlatin \
locale-kcolorchooser-sr@latin \
locale-kcolorchooser-sv \
locale-kcolorchooser-th \
locale-kcolorchooser-tr \
locale-kcolorchooser-ug \
locale-kcolorchooser-uk \
locale-kcolorchooser-vi \
locale-kcolorchooser-wa \
locale-kcolorchooser-zh-CN \
locale-kcolorchooser-zh-TW"

RDEPENDS:${PN} += "kcolorchooser"

inherit rpm
