SUMMARY = "Translations for package plasma-nm5"
DESCRIPTION = "Provides translations for the 'plasma-nm5' package."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "3755bd91ae3e735ead4e1e4916081869bacfe2ef0bd4846f8307a91da4be5ec113bf892372452f569718d17ace41d081200feb29bbf48d3472cb87659d8c55e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-nm5-ar \
locale-plasma-nm5-az \
locale-plasma-nm5-bg \
locale-plasma-nm5-bs \
locale-plasma-nm5-ca \
locale-plasma-nm5-ca@valencia \
locale-plasma-nm5-cs \
locale-plasma-nm5-da \
locale-plasma-nm5-de \
locale-plasma-nm5-el \
locale-plasma-nm5-en-GB \
locale-plasma-nm5-eo \
locale-plasma-nm5-es \
locale-plasma-nm5-et \
locale-plasma-nm5-eu \
locale-plasma-nm5-fa \
locale-plasma-nm5-fi \
locale-plasma-nm5-fr \
locale-plasma-nm5-ga \
locale-plasma-nm5-gl \
locale-plasma-nm5-he \
locale-plasma-nm5-hr \
locale-plasma-nm5-hu \
locale-plasma-nm5-ia \
locale-plasma-nm5-id \
locale-plasma-nm5-is \
locale-plasma-nm5-it \
locale-plasma-nm5-ja \
locale-plasma-nm5-ka \
locale-plasma-nm5-km \
locale-plasma-nm5-ko \
locale-plasma-nm5-lt \
locale-plasma-nm5-lv \
locale-plasma-nm5-mai \
locale-plasma-nm5-ml \
locale-plasma-nm5-mr \
locale-plasma-nm5-ms \
locale-plasma-nm5-nb \
locale-plasma-nm5-nds \
locale-plasma-nm5-nl \
locale-plasma-nm5-nn \
locale-plasma-nm5-pa \
locale-plasma-nm5-pl \
locale-plasma-nm5-pt \
locale-plasma-nm5-pt-BR \
locale-plasma-nm5-ro \
locale-plasma-nm5-ru \
locale-plasma-nm5-sk \
locale-plasma-nm5-sl \
locale-plasma-nm5-sr \
locale-plasma-nm5-sr@ijekavian \
locale-plasma-nm5-sr@ijekavianlatin \
locale-plasma-nm5-sr@latin \
locale-plasma-nm5-sv \
locale-plasma-nm5-ta \
locale-plasma-nm5-th \
locale-plasma-nm5-tr \
locale-plasma-nm5-ug \
locale-plasma-nm5-uk \
locale-plasma-nm5-zh-CN \
locale-plasma-nm5-zh-TW \
plasma-nm5-lang \
plasma-nm5-lang-all"

RDEPENDS:${PN} += "plasma-nm5"

inherit rpm
