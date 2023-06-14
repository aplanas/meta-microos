SUMMARY = "Translations for package kcron"
DESCRIPTION = "Provides translations for the 'kcron' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcron-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ec681786ad7303924b7d8f400f9c08514fed5a56578c2ce1083b694f35d948d6b6a98255bfb72b92ea0e44110510a026e6bd4dd4d373b217adf22b5dd07ed791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcron-lang \
kcron-lang-all \
locale-kcron-af \
locale-kcron-ar \
locale-kcron-be \
locale-kcron-bg \
locale-kcron-br \
locale-kcron-bs \
locale-kcron-ca \
locale-kcron-ca@valencia \
locale-kcron-cs \
locale-kcron-cy \
locale-kcron-da \
locale-kcron-de \
locale-kcron-el \
locale-kcron-en-GB \
locale-kcron-eo \
locale-kcron-es \
locale-kcron-et \
locale-kcron-eu \
locale-kcron-fa \
locale-kcron-fi \
locale-kcron-fr \
locale-kcron-ga \
locale-kcron-gl \
locale-kcron-he \
locale-kcron-hi \
locale-kcron-hr \
locale-kcron-hu \
locale-kcron-ia \
locale-kcron-is \
locale-kcron-it \
locale-kcron-ja \
locale-kcron-ka \
locale-kcron-kk \
locale-kcron-km \
locale-kcron-ko \
locale-kcron-lt \
locale-kcron-lv \
locale-kcron-mk \
locale-kcron-mr \
locale-kcron-ms \
locale-kcron-nb \
locale-kcron-nds \
locale-kcron-ne \
locale-kcron-nl \
locale-kcron-nn \
locale-kcron-oc \
locale-kcron-pa \
locale-kcron-pl \
locale-kcron-pt \
locale-kcron-pt-BR \
locale-kcron-ro \
locale-kcron-ru \
locale-kcron-sk \
locale-kcron-sl \
locale-kcron-sq \
locale-kcron-sr \
locale-kcron-sr@ijekavian \
locale-kcron-sr@ijekavianlatin \
locale-kcron-sr@latin \
locale-kcron-sv \
locale-kcron-ta \
locale-kcron-th \
locale-kcron-tr \
locale-kcron-ug \
locale-kcron-uk \
locale-kcron-vi \
locale-kcron-wa \
locale-kcron-zh-CN \
locale-kcron-zh-HK \
locale-kcron-zh-TW"

RDEPENDS:${PN} += "kcron"

inherit rpm
