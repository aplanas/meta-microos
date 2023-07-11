SUMMARY = "Translations for package palapeli"
DESCRIPTION = "Provides translations for the 'palapeli' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "palapeli-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "864e332b9702cfc18e4bc37bcf7469db17e9ed7ed851bc26f8131b605f90d3e9d196c0c9cb31c58c5f07a449ea4d1adb9510f6fcc31d4a111543f1d4e57864d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-palapeli-bg \
locale-palapeli-bs \
locale-palapeli-ca \
locale-palapeli-ca@valencia \
locale-palapeli-cs \
locale-palapeli-da \
locale-palapeli-de \
locale-palapeli-el \
locale-palapeli-en-GB \
locale-palapeli-eo \
locale-palapeli-es \
locale-palapeli-et \
locale-palapeli-eu \
locale-palapeli-fi \
locale-palapeli-fr \
locale-palapeli-ga \
locale-palapeli-gl \
locale-palapeli-hr \
locale-palapeli-hu \
locale-palapeli-is \
locale-palapeli-it \
locale-palapeli-ja \
locale-palapeli-ka \
locale-palapeli-kk \
locale-palapeli-km \
locale-palapeli-ko \
locale-palapeli-lt \
locale-palapeli-lv \
locale-palapeli-mai \
locale-palapeli-ml \
locale-palapeli-mr \
locale-palapeli-nb \
locale-palapeli-nds \
locale-palapeli-nl \
locale-palapeli-nn \
locale-palapeli-pl \
locale-palapeli-pt \
locale-palapeli-pt-BR \
locale-palapeli-ro \
locale-palapeli-ru \
locale-palapeli-sk \
locale-palapeli-sl \
locale-palapeli-sq \
locale-palapeli-sr \
locale-palapeli-sr@ijekavian \
locale-palapeli-sr@ijekavianlatin \
locale-palapeli-sr@latin \
locale-palapeli-sv \
locale-palapeli-tr \
locale-palapeli-ug \
locale-palapeli-uk \
locale-palapeli-zh-CN \
locale-palapeli-zh-TW \
palapeli-lang \
palapeli-lang-all"

RDEPENDS:${PN} += "palapeli"

inherit rpm
