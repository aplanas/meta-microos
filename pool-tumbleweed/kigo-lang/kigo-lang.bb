SUMMARY = "Translations for package kigo"
DESCRIPTION = "Provides translations for the 'kigo' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kigo-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e7eef92426aebdcbe96555d53e7c5dc6faaf8bf6d83b8f6cd91db699a49ed8e7b292ba39f3136d6abb10d874560d6a0dc146553f7c7a6976f3c8d69d610c7543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kigo-lang \
kigo-lang-all \
locale-kigo-ar \
locale-kigo-bg \
locale-kigo-bs \
locale-kigo-ca \
locale-kigo-ca@valencia \
locale-kigo-cs \
locale-kigo-da \
locale-kigo-de \
locale-kigo-el \
locale-kigo-en-GB \
locale-kigo-eo \
locale-kigo-es \
locale-kigo-et \
locale-kigo-eu \
locale-kigo-fi \
locale-kigo-fr \
locale-kigo-ga \
locale-kigo-gl \
locale-kigo-hr \
locale-kigo-hu \
locale-kigo-id \
locale-kigo-is \
locale-kigo-it \
locale-kigo-ja \
locale-kigo-ka \
locale-kigo-kk \
locale-kigo-km \
locale-kigo-ko \
locale-kigo-lt \
locale-kigo-lv \
locale-kigo-mai \
locale-kigo-ml \
locale-kigo-mr \
locale-kigo-ms \
locale-kigo-nb \
locale-kigo-nds \
locale-kigo-nl \
locale-kigo-nn \
locale-kigo-pl \
locale-kigo-pt \
locale-kigo-pt-BR \
locale-kigo-ro \
locale-kigo-ru \
locale-kigo-sk \
locale-kigo-sl \
locale-kigo-sr \
locale-kigo-sr@ijekavian \
locale-kigo-sr@ijekavianlatin \
locale-kigo-sr@latin \
locale-kigo-sv \
locale-kigo-th \
locale-kigo-tr \
locale-kigo-ug \
locale-kigo-uk \
locale-kigo-zh-CN \
locale-kigo-zh-TW"

RDEPENDS:${PN} += "kigo"

inherit rpm
