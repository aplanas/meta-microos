SUMMARY = "Translations for package skanlite"
DESCRIPTION = "Provides translations for the 'skanlite' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "skanlite-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "78ba672109b40b029ff2d36d9bf637bb63f36af61d53145ec1b2eed9e21497c2143a8575f71e11c00b0a8f8f477580b8596edd8878153a9c5557d5561226eb28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skanlite-ar \
locale-skanlite-az \
locale-skanlite-be \
locale-skanlite-bg \
locale-skanlite-bs \
locale-skanlite-ca \
locale-skanlite-ca@valencia \
locale-skanlite-cs \
locale-skanlite-da \
locale-skanlite-de \
locale-skanlite-el \
locale-skanlite-en-GB \
locale-skanlite-eo \
locale-skanlite-es \
locale-skanlite-et \
locale-skanlite-eu \
locale-skanlite-fi \
locale-skanlite-fr \
locale-skanlite-ga \
locale-skanlite-gl \
locale-skanlite-hi \
locale-skanlite-hr \
locale-skanlite-hu \
locale-skanlite-ia \
locale-skanlite-id \
locale-skanlite-is \
locale-skanlite-it \
locale-skanlite-ja \
locale-skanlite-ka \
locale-skanlite-km \
locale-skanlite-ko \
locale-skanlite-lt \
locale-skanlite-lv \
locale-skanlite-mai \
locale-skanlite-mr \
locale-skanlite-nb \
locale-skanlite-nds \
locale-skanlite-nl \
locale-skanlite-nn \
locale-skanlite-pa \
locale-skanlite-pl \
locale-skanlite-pt \
locale-skanlite-pt-BR \
locale-skanlite-ro \
locale-skanlite-ru \
locale-skanlite-sk \
locale-skanlite-sl \
locale-skanlite-sq \
locale-skanlite-sv \
locale-skanlite-tr \
locale-skanlite-ug \
locale-skanlite-uk \
locale-skanlite-wa \
locale-skanlite-zh-CN \
locale-skanlite-zh-TW \
skanlite-lang \
skanlite-lang-all"

RDEPENDS:${PN} += "skanlite"

inherit rpm
