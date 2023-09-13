SUMMARY = "Translations for package homebank"
DESCRIPTION = "Provides translations for the 'homebank' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.7"

RPM_NAME = "homebank-lang-5.7-1.1.noarch.rpm"
RPM_HASH = "743345fce328be443b7cdbf573d67d32502b17eec00ed254aa990bd4dd79ddf5787cb5a97828c7e47f7632793f794aa8fc39b35180cddc3789eac5953c9bf4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "homebank-lang \
homebank-lang-all \
locale-homebank-ar \
locale-homebank-ast \
locale-homebank-be \
locale-homebank-bg \
locale-homebank-br \
locale-homebank-ca \
locale-homebank-cs \
locale-homebank-cy \
locale-homebank-da \
locale-homebank-de \
locale-homebank-el \
locale-homebank-en-AU \
locale-homebank-en-CA \
locale-homebank-en-GB \
locale-homebank-eo \
locale-homebank-es \
locale-homebank-et \
locale-homebank-eu \
locale-homebank-fa \
locale-homebank-fi \
locale-homebank-fr \
locale-homebank-fr-CA \
locale-homebank-gl \
locale-homebank-he \
locale-homebank-hr \
locale-homebank-hu \
locale-homebank-id \
locale-homebank-is \
locale-homebank-it \
locale-homebank-ja \
locale-homebank-ko \
locale-homebank-lt \
locale-homebank-lv \
locale-homebank-ms \
locale-homebank-nb \
locale-homebank-nds \
locale-homebank-nl \
locale-homebank-oc \
locale-homebank-pl \
locale-homebank-pt \
locale-homebank-pt-BR \
locale-homebank-pt-PT \
locale-homebank-ro \
locale-homebank-ru \
locale-homebank-si \
locale-homebank-sk \
locale-homebank-sl \
locale-homebank-sr \
locale-homebank-sv \
locale-homebank-ta \
locale-homebank-tr \
locale-homebank-uk \
locale-homebank-vi \
locale-homebank-zh-CN \
locale-homebank-zh-TW"

RDEPENDS:${PN} += "homebank"

inherit rpm
