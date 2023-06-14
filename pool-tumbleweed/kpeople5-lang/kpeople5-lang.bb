SUMMARY = "Translations for package kpeople5"
DESCRIPTION = "Provides translations for the 'kpeople5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kpeople5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "6f5144862006bd299a1774f7c2d43a18615c09af7a7e31e6e514e6fc502d6a499837d90b48a96ad3dcad9af1905aa638cc41875f6c5c5917640c4234921088fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpeople5-lang \
kpeople5-lang-all \
locale-kpeople5-ar \
locale-kpeople5-az \
locale-kpeople5-bg \
locale-kpeople5-bs \
locale-kpeople5-ca \
locale-kpeople5-ca@valencia \
locale-kpeople5-cs \
locale-kpeople5-da \
locale-kpeople5-de \
locale-kpeople5-el \
locale-kpeople5-en-GB \
locale-kpeople5-es \
locale-kpeople5-et \
locale-kpeople5-eu \
locale-kpeople5-fi \
locale-kpeople5-fr \
locale-kpeople5-gd \
locale-kpeople5-gl \
locale-kpeople5-he \
locale-kpeople5-hi \
locale-kpeople5-hu \
locale-kpeople5-ia \
locale-kpeople5-id \
locale-kpeople5-it \
locale-kpeople5-ja \
locale-kpeople5-ka \
locale-kpeople5-ko \
locale-kpeople5-lt \
locale-kpeople5-ml \
locale-kpeople5-nb \
locale-kpeople5-nl \
locale-kpeople5-nn \
locale-kpeople5-pl \
locale-kpeople5-pt \
locale-kpeople5-pt-BR \
locale-kpeople5-ro \
locale-kpeople5-ru \
locale-kpeople5-sk \
locale-kpeople5-sl \
locale-kpeople5-sr \
locale-kpeople5-sr@ijekavian \
locale-kpeople5-sr@ijekavianlatin \
locale-kpeople5-sr@latin \
locale-kpeople5-sv \
locale-kpeople5-tr \
locale-kpeople5-uk \
locale-kpeople5-zh-CN \
locale-kpeople5-zh-TW"

RDEPENDS:${PN} += "kpeople5"

inherit rpm
