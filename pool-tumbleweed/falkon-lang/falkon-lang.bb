SUMMARY = "Translations for package falkon"
DESCRIPTION = "Provides translations for the 'falkon' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "falkon-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "b8c09d4fde43b3a19f388f3debb563f1ff14746e7d8b17c715cfd1cb6be137c6cf40a3750d921b641053bd0015ce72c90e196a9ac69a10bc3143588b448be9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falkon-lang \
falkon-lang-all \
locale-falkon-ar \
locale-falkon-az \
locale-falkon-bg \
locale-falkon-ca \
locale-falkon-ca@valencia \
locale-falkon-cs \
locale-falkon-da \
locale-falkon-de \
locale-falkon-el \
locale-falkon-en \
locale-falkon-en-GB \
locale-falkon-eo \
locale-falkon-es \
locale-falkon-et \
locale-falkon-eu \
locale-falkon-fa \
locale-falkon-fi \
locale-falkon-fr \
locale-falkon-gl \
locale-falkon-hu \
locale-falkon-ia \
locale-falkon-id \
locale-falkon-is \
locale-falkon-it \
locale-falkon-ja \
locale-falkon-ka \
locale-falkon-ko \
locale-falkon-lt \
locale-falkon-lv \
locale-falkon-nb \
locale-falkon-nl \
locale-falkon-nn \
locale-falkon-pa \
locale-falkon-pl \
locale-falkon-pt \
locale-falkon-pt-BR \
locale-falkon-ro \
locale-falkon-ru \
locale-falkon-sk \
locale-falkon-sl \
locale-falkon-sr \
locale-falkon-sr@ijekavian \
locale-falkon-sr@ijekavianlatin \
locale-falkon-sr@latin \
locale-falkon-sv \
locale-falkon-ta \
locale-falkon-tr \
locale-falkon-uk \
locale-falkon-zh-CN \
locale-falkon-zh-HK \
locale-falkon-zh-TW"

RDEPENDS:${PN} += "falkon"

inherit rpm
