SUMMARY = "Translations for package colorhug-client"
DESCRIPTION = "Provides translations for the 'colorhug-client' package."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "colorhug-client-lang-0.2.8-1.27.noarch.rpm"
RPM_HASH = "1a2731b98988d0ebcdfb1a15aa488debf73d0b7eaea3a477e82067aaf938c95acd641aa8b6b8b56b8a0c52f6ff110b0f19b5087f107e689c2783fd0fabe22cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colorhug-client-lang \
colorhug-client-lang-all \
locale-colorhug-client-cs-CZ \
locale-colorhug-client-da \
locale-colorhug-client-de \
locale-colorhug-client-de-DE \
locale-colorhug-client-el-GR \
locale-colorhug-client-en-GB \
locale-colorhug-client-en-US \
locale-colorhug-client-es-ES \
locale-colorhug-client-et \
locale-colorhug-client-fa \
locale-colorhug-client-fi \
locale-colorhug-client-fr-FR \
locale-colorhug-client-hu \
locale-colorhug-client-it-IT \
locale-colorhug-client-lv \
locale-colorhug-client-nb \
locale-colorhug-client-nn \
locale-colorhug-client-pl \
locale-colorhug-client-pl-PL \
locale-colorhug-client-pt \
locale-colorhug-client-pt-BR \
locale-colorhug-client-pt-PT \
locale-colorhug-client-ro \
locale-colorhug-client-ru \
locale-colorhug-client-sr \
locale-colorhug-client-sv \
locale-colorhug-client-tr \
locale-colorhug-client-uk \
locale-colorhug-client-zh-TW"

RDEPENDS:${PN} += "colorhug-client"

inherit rpm
