SUMMARY = "Translations for package ark"
DESCRIPTION = "Provides translations for the 'ark' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ark-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "90ba01994182e1a6a4cadea4ed4923bd377dae876a4da55c45f37254278beebfaac1ed0824a63d4175e03eb1dc0edf47f44f1144be409be737f206e18e5d1aac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ark-lang \
ark-lang-all \
locale-ark-af \
locale-ark-ar \
locale-ark-ast \
locale-ark-az \
locale-ark-be \
locale-ark-bg \
locale-ark-br \
locale-ark-bs \
locale-ark-ca \
locale-ark-ca@valencia \
locale-ark-cs \
locale-ark-cy \
locale-ark-da \
locale-ark-de \
locale-ark-el \
locale-ark-en-GB \
locale-ark-eo \
locale-ark-es \
locale-ark-et \
locale-ark-eu \
locale-ark-fa \
locale-ark-fi \
locale-ark-fr \
locale-ark-ga \
locale-ark-gl \
locale-ark-he \
locale-ark-hi \
locale-ark-hr \
locale-ark-hu \
locale-ark-ia \
locale-ark-id \
locale-ark-is \
locale-ark-it \
locale-ark-ja \
locale-ark-ka \
locale-ark-kk \
locale-ark-km \
locale-ark-ko \
locale-ark-lt \
locale-ark-lv \
locale-ark-mk \
locale-ark-mr \
locale-ark-ms \
locale-ark-nb \
locale-ark-nds \
locale-ark-ne \
locale-ark-nl \
locale-ark-nn \
locale-ark-oc \
locale-ark-pa \
locale-ark-pl \
locale-ark-pt \
locale-ark-pt-BR \
locale-ark-ro \
locale-ark-ru \
locale-ark-sk \
locale-ark-sl \
locale-ark-sq \
locale-ark-sr \
locale-ark-sr@ijekavian \
locale-ark-sr@ijekavianlatin \
locale-ark-sr@latin \
locale-ark-sv \
locale-ark-ta \
locale-ark-th \
locale-ark-tr \
locale-ark-ug \
locale-ark-uk \
locale-ark-zh-CN \
locale-ark-zh-HK \
locale-ark-zh-TW"

RDEPENDS:${PN} += "ark"

inherit rpm
