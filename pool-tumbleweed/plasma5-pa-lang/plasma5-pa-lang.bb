SUMMARY = "Translations for package plasma5-pa"
DESCRIPTION = "Provides translations for the 'plasma5-pa' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "plasma5-pa-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "1289ac8807692f12edc09803bb6779fad8ea90171bb5d85702af624de9f7b058c33300fb84e8ae51cafe56a13459d9356ca6207195543febee3475c5f474eab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-pa-ar \
locale-plasma5-pa-az \
locale-plasma5-pa-bg \
locale-plasma5-pa-ca \
locale-plasma5-pa-ca@valencia \
locale-plasma5-pa-cs \
locale-plasma5-pa-da \
locale-plasma5-pa-de \
locale-plasma5-pa-el \
locale-plasma5-pa-en-GB \
locale-plasma5-pa-es \
locale-plasma5-pa-et \
locale-plasma5-pa-eu \
locale-plasma5-pa-fi \
locale-plasma5-pa-fr \
locale-plasma5-pa-gl \
locale-plasma5-pa-he \
locale-plasma5-pa-hu \
locale-plasma5-pa-ia \
locale-plasma5-pa-id \
locale-plasma5-pa-it \
locale-plasma5-pa-ja \
locale-plasma5-pa-ka \
locale-plasma5-pa-ko \
locale-plasma5-pa-lt \
locale-plasma5-pa-lv \
locale-plasma5-pa-ml \
locale-plasma5-pa-nb \
locale-plasma5-pa-nl \
locale-plasma5-pa-nn \
locale-plasma5-pa-pa \
locale-plasma5-pa-pl \
locale-plasma5-pa-pt \
locale-plasma5-pa-pt-BR \
locale-plasma5-pa-ro \
locale-plasma5-pa-ru \
locale-plasma5-pa-sk \
locale-plasma5-pa-sl \
locale-plasma5-pa-sr \
locale-plasma5-pa-sr@ijekavian \
locale-plasma5-pa-sr@ijekavianlatin \
locale-plasma5-pa-sr@latin \
locale-plasma5-pa-sv \
locale-plasma5-pa-ta \
locale-plasma5-pa-tr \
locale-plasma5-pa-uk \
locale-plasma5-pa-zh-CN \
locale-plasma5-pa-zh-TW \
plasma5-pa-lang \
plasma5-pa-lang-all"

RDEPENDS:${PN} += "plasma5-pa"

inherit rpm
