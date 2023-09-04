SUMMARY = "Translations for package easyeffects"
DESCRIPTION = "Provides translations for the 'easyeffects' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "easyeffects-lang-7.0.6-1.1.noarch.rpm"
RPM_HASH = "49b37a34dd6aea8a2cd68d6e2070fa526341ad73f3dbc51cc4016d9030de1b6e64ed2e39c09f03da7395b485731b2f56565aec4950cfcce7591dd9980b9f93e6"
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
locale-easyeffects-eu \
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
locale-easyeffects-nn \
locale-easyeffects-pl \
locale-easyeffects-pt-BR \
locale-easyeffects-ro \
locale-easyeffects-ru \
locale-easyeffects-sk \
locale-easyeffects-sv \
locale-easyeffects-th \
locale-easyeffects-tr \
locale-easyeffects-uk \
locale-easyeffects-zh-CN"

RDEPENDS:${PN} += "easyeffects"

inherit rpm
