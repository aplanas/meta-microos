SUMMARY = "Translations for package ksirk"
DESCRIPTION = "Provides translations for the 'ksirk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ksirk-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "dee6f738e9c8af1c11e601cebe8f8215d1bffb71ffcf3727b6047e7bac37fd20166aa2bf735d8f0c4d18fc910d25a398edd30ea7a865b892027b724b862ed790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksirk-lang \
ksirk-lang-all \
locale-ksirk-ar \
locale-ksirk-be \
locale-ksirk-bg \
locale-ksirk-bs \
locale-ksirk-ca \
locale-ksirk-ca@valencia \
locale-ksirk-cs \
locale-ksirk-da \
locale-ksirk-de \
locale-ksirk-el \
locale-ksirk-en-GB \
locale-ksirk-eo \
locale-ksirk-es \
locale-ksirk-et \
locale-ksirk-fi \
locale-ksirk-fr \
locale-ksirk-ga \
locale-ksirk-gl \
locale-ksirk-hi \
locale-ksirk-hr \
locale-ksirk-hu \
locale-ksirk-is \
locale-ksirk-it \
locale-ksirk-ja \
locale-ksirk-ka \
locale-ksirk-kk \
locale-ksirk-km \
locale-ksirk-lt \
locale-ksirk-lv \
locale-ksirk-mai \
locale-ksirk-ml \
locale-ksirk-mr \
locale-ksirk-ms \
locale-ksirk-nb \
locale-ksirk-nds \
locale-ksirk-nl \
locale-ksirk-nn \
locale-ksirk-oc \
locale-ksirk-pl \
locale-ksirk-pt \
locale-ksirk-pt-BR \
locale-ksirk-ro \
locale-ksirk-ru \
locale-ksirk-sk \
locale-ksirk-sl \
locale-ksirk-sr \
locale-ksirk-sr@ijekavian \
locale-ksirk-sr@ijekavianlatin \
locale-ksirk-sr@latin \
locale-ksirk-sv \
locale-ksirk-tr \
locale-ksirk-ug \
locale-ksirk-uk \
locale-ksirk-zh-CN \
locale-ksirk-zh-TW"

RDEPENDS:${PN} += "ksirk"

inherit rpm
