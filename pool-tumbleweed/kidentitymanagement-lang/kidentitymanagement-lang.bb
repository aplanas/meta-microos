SUMMARY = "Translations for package kidentitymanagement"
DESCRIPTION = "Provides translations for the 'kidentitymanagement' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kidentitymanagement-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3c9941c84eeb0ee948229d74f0b4400c073c72ae9278fa80205894df86c6f1d8e9c46c15c5de1693c07c36614dac30c7793be698c33e824eee0e606d2b19270b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kidentitymanagement-lang \
kidentitymanagement-lang-all \
locale-kidentitymanagement-ar \
locale-kidentitymanagement-az \
locale-kidentitymanagement-be \
locale-kidentitymanagement-bs \
locale-kidentitymanagement-ca \
locale-kidentitymanagement-ca@valencia \
locale-kidentitymanagement-cs \
locale-kidentitymanagement-da \
locale-kidentitymanagement-de \
locale-kidentitymanagement-el \
locale-kidentitymanagement-en-GB \
locale-kidentitymanagement-eo \
locale-kidentitymanagement-es \
locale-kidentitymanagement-et \
locale-kidentitymanagement-eu \
locale-kidentitymanagement-fi \
locale-kidentitymanagement-fr \
locale-kidentitymanagement-ga \
locale-kidentitymanagement-gl \
locale-kidentitymanagement-hi \
locale-kidentitymanagement-hu \
locale-kidentitymanagement-ia \
locale-kidentitymanagement-it \
locale-kidentitymanagement-ja \
locale-kidentitymanagement-ka \
locale-kidentitymanagement-kk \
locale-kidentitymanagement-km \
locale-kidentitymanagement-ko \
locale-kidentitymanagement-lt \
locale-kidentitymanagement-lv \
locale-kidentitymanagement-mr \
locale-kidentitymanagement-nb \
locale-kidentitymanagement-nds \
locale-kidentitymanagement-nl \
locale-kidentitymanagement-nn \
locale-kidentitymanagement-pa \
locale-kidentitymanagement-pl \
locale-kidentitymanagement-pt \
locale-kidentitymanagement-pt-BR \
locale-kidentitymanagement-ro \
locale-kidentitymanagement-ru \
locale-kidentitymanagement-sk \
locale-kidentitymanagement-sl \
locale-kidentitymanagement-sq \
locale-kidentitymanagement-sr \
locale-kidentitymanagement-sr@ijekavian \
locale-kidentitymanagement-sr@ijekavianlatin \
locale-kidentitymanagement-sr@latin \
locale-kidentitymanagement-sv \
locale-kidentitymanagement-th \
locale-kidentitymanagement-tr \
locale-kidentitymanagement-ug \
locale-kidentitymanagement-uk \
locale-kidentitymanagement-zh-CN \
locale-kidentitymanagement-zh-TW"

RDEPENDS:${PN} += "kidentitymanagement"

inherit rpm
