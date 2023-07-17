SUMMARY = "Translations for package kcontacts"
DESCRIPTION = "Provides translations for the 'kcontacts' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcontacts-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "ff010fbc3c7ab92212f484087c9d062996ed6aed345bda4a72629f417523924d3c878eaf1bb01c7849ab18e31cf447b5cde9af2632acbf13c1e93178b03ebddc"
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
