SUMMARY = "Translations for package kinfocenter5"
DESCRIPTION = "Provides translations for the 'kinfocenter5' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kinfocenter5-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "46c23fb98c8eced3ad0377b499af1408e3e07432ad0c617f6775ccd99b2ec0161e776e380dfc44ccc3da39a7015dde8aee4003cdb6243fcf083d4184ccc0cfb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kinfocenter5-lang \
kinfocenter5-lang-all \
locale-kinfocenter5-af \
locale-kinfocenter5-ar \
locale-kinfocenter5-az \
locale-kinfocenter5-be \
locale-kinfocenter5-bg \
locale-kinfocenter5-bn \
locale-kinfocenter5-bn-IN \
locale-kinfocenter5-br \
locale-kinfocenter5-bs \
locale-kinfocenter5-ca \
locale-kinfocenter5-ca@valencia \
locale-kinfocenter5-cs \
locale-kinfocenter5-cy \
locale-kinfocenter5-da \
locale-kinfocenter5-de \
locale-kinfocenter5-el \
locale-kinfocenter5-en-GB \
locale-kinfocenter5-eo \
locale-kinfocenter5-es \
locale-kinfocenter5-et \
locale-kinfocenter5-eu \
locale-kinfocenter5-fa \
locale-kinfocenter5-fi \
locale-kinfocenter5-fr \
locale-kinfocenter5-ga \
locale-kinfocenter5-gl \
locale-kinfocenter5-gu \
locale-kinfocenter5-he \
locale-kinfocenter5-hi \
locale-kinfocenter5-hr \
locale-kinfocenter5-hu \
locale-kinfocenter5-ia \
locale-kinfocenter5-id \
locale-kinfocenter5-is \
locale-kinfocenter5-it \
locale-kinfocenter5-ja \
locale-kinfocenter5-ka \
locale-kinfocenter5-kk \
locale-kinfocenter5-km \
locale-kinfocenter5-kn \
locale-kinfocenter5-ko \
locale-kinfocenter5-lt \
locale-kinfocenter5-lv \
locale-kinfocenter5-mai \
locale-kinfocenter5-mk \
locale-kinfocenter5-ml \
locale-kinfocenter5-mr \
locale-kinfocenter5-ms \
locale-kinfocenter5-nb \
locale-kinfocenter5-nds \
locale-kinfocenter5-ne \
locale-kinfocenter5-nl \
locale-kinfocenter5-nn \
locale-kinfocenter5-oc \
locale-kinfocenter5-or \
locale-kinfocenter5-pa \
locale-kinfocenter5-pl \
locale-kinfocenter5-pt \
locale-kinfocenter5-pt-BR \
locale-kinfocenter5-ro \
locale-kinfocenter5-ru \
locale-kinfocenter5-si \
locale-kinfocenter5-sk \
locale-kinfocenter5-sl \
locale-kinfocenter5-sq \
locale-kinfocenter5-sr \
locale-kinfocenter5-sr@ijekavian \
locale-kinfocenter5-sr@ijekavianlatin \
locale-kinfocenter5-sr@latin \
locale-kinfocenter5-sv \
locale-kinfocenter5-ta \
locale-kinfocenter5-te \
locale-kinfocenter5-th \
locale-kinfocenter5-tr \
locale-kinfocenter5-ug \
locale-kinfocenter5-uk \
locale-kinfocenter5-vi \
locale-kinfocenter5-wa \
locale-kinfocenter5-zh-CN \
locale-kinfocenter5-zh-TW"

RDEPENDS:${PN} += "kinfocenter5"

inherit rpm
