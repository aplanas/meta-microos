SUMMARY = "Translations for package haruna"
DESCRIPTION = "Provides translations for the 'haruna' package."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.12.0"

RPM_NAME = "haruna-lang-0.12.0-1.1.noarch.rpm"
RPM_HASH = "651ff99623292cbac06d27b28bd4c5bbd0c7e6f11043adf823525bcff9fe9d79ebb62ff194144d750f3e67c505adc9ea680e1357f4aa305c6678b77625663bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haruna-lang \
haruna-lang-all \
locale-haruna-ar \
locale-haruna-ca \
locale-haruna-ca@valencia \
locale-haruna-cs \
locale-haruna-de \
locale-haruna-en-GB \
locale-haruna-es \
locale-haruna-eu \
locale-haruna-fi \
locale-haruna-fr \
locale-haruna-hi \
locale-haruna-id \
locale-haruna-it \
locale-haruna-ja \
locale-haruna-ka \
locale-haruna-ko \
locale-haruna-lt \
locale-haruna-nl \
locale-haruna-pl \
locale-haruna-pt \
locale-haruna-pt-BR \
locale-haruna-ru \
locale-haruna-sk \
locale-haruna-sl \
locale-haruna-sv \
locale-haruna-ta \
locale-haruna-tr \
locale-haruna-uk \
locale-haruna-zh-CN \
locale-haruna-zh-TW"

RDEPENDS:${PN} += "haruna"

inherit rpm
