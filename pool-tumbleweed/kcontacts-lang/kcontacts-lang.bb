SUMMARY = "Translations for package kcontacts"
DESCRIPTION = "Provides translations for the 'kcontacts' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcontacts-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "e28cb5adcf7833555efef4d29b093aa3ec0c875d660ab2668e1dd38fa40b20aeac54c43fad3607f0172f95e8a61d5247b927d02dc384eabfa4d54159c140590a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcontacts-lang \
kcontacts-lang-all \
locale-kcontacts-ar \
locale-kcontacts-az \
locale-kcontacts-be \
locale-kcontacts-bg \
locale-kcontacts-bs \
locale-kcontacts-ca \
locale-kcontacts-ca@valencia \
locale-kcontacts-cs \
locale-kcontacts-da \
locale-kcontacts-de \
locale-kcontacts-el \
locale-kcontacts-en-GB \
locale-kcontacts-eo \
locale-kcontacts-es \
locale-kcontacts-et \
locale-kcontacts-eu \
locale-kcontacts-fi \
locale-kcontacts-fr \
locale-kcontacts-ga \
locale-kcontacts-gl \
locale-kcontacts-hi \
locale-kcontacts-hu \
locale-kcontacts-ia \
locale-kcontacts-id \
locale-kcontacts-it \
locale-kcontacts-ja \
locale-kcontacts-ka \
locale-kcontacts-kk \
locale-kcontacts-km \
locale-kcontacts-ko \
locale-kcontacts-lt \
locale-kcontacts-lv \
locale-kcontacts-mai \
locale-kcontacts-ml \
locale-kcontacts-mr \
locale-kcontacts-nb \
locale-kcontacts-nds \
locale-kcontacts-nl \
locale-kcontacts-nn \
locale-kcontacts-pa \
locale-kcontacts-pl \
locale-kcontacts-pt \
locale-kcontacts-pt-BR \
locale-kcontacts-ro \
locale-kcontacts-ru \
locale-kcontacts-sk \
locale-kcontacts-sl \
locale-kcontacts-sq \
locale-kcontacts-sr \
locale-kcontacts-sr@ijekavian \
locale-kcontacts-sr@ijekavianlatin \
locale-kcontacts-sr@latin \
locale-kcontacts-sv \
locale-kcontacts-th \
locale-kcontacts-tr \
locale-kcontacts-ug \
locale-kcontacts-uk \
locale-kcontacts-zh-CN \
locale-kcontacts-zh-TW"

RDEPENDS:${PN} += "kcontacts"

inherit rpm
