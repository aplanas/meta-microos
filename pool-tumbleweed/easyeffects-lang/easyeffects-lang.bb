SUMMARY = "Translations for package easyeffects"
DESCRIPTION = "Provides translations for the 'easyeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "easyeffects-lang-7.0.3-1.2.noarch.rpm"
RPM_HASH = "57ff7226a60502b860c04ee53d1b7f92f7594d79a5268483362d1dc3b97c040625756380e883433a532fb64ade766623559cad5932a98e76c5893c074bac7eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easyeffects-lang \
easyeffects-lang-all \
locale-easyeffects-af \
locale-easyeffects-bg \
locale-easyeffects-cs \
locale-easyeffects-da \
locale-easyeffects-de \
locale-easyeffects-es \
locale-easyeffects-es-CO \
locale-easyeffects-es-MX \
locale-easyeffects-es-VE \
locale-easyeffects-fr-FR \
locale-easyeffects-gl \
locale-easyeffects-hr \
locale-easyeffects-it-IT \
locale-easyeffects-ja \
locale-easyeffects-ka \
locale-easyeffects-km \
locale-easyeffects-ko \
locale-easyeffects-nb-NO \
locale-easyeffects-nl \
locale-easyeffects-pl \
locale-easyeffects-pt-BR \
locale-easyeffects-ro \
locale-easyeffects-ru \
locale-easyeffects-sk \
locale-easyeffects-sv \
locale-easyeffects-th \
locale-easyeffects-tr \
locale-easyeffects-zh-CN"

RDEPENDS:${PN} += "easyeffects"

inherit rpm
