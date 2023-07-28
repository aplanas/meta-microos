SUMMARY = "Translations for package xfce4-verve-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-verve-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "xfce4-verve-plugin-lang-2.0.3-1.1.noarch.rpm"
RPM_HASH = "b86cce36173c071346a03da3926982df0583d301e96db5f6f85503d72baad87aa6b0c605323b5c7f83422e4c779a378eeb73c16fe91bec2c8b7b31f2ea486b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-verve-plugin-ar \
locale-xfce4-verve-plugin-ast \
locale-xfce4-verve-plugin-be \
locale-xfce4-verve-plugin-bg \
locale-xfce4-verve-plugin-ca \
locale-xfce4-verve-plugin-cs \
locale-xfce4-verve-plugin-da \
locale-xfce4-verve-plugin-de \
locale-xfce4-verve-plugin-el \
locale-xfce4-verve-plugin-en-AU \
locale-xfce4-verve-plugin-en-CA \
locale-xfce4-verve-plugin-en-GB \
locale-xfce4-verve-plugin-eo \
locale-xfce4-verve-plugin-es \
locale-xfce4-verve-plugin-et \
locale-xfce4-verve-plugin-eu \
locale-xfce4-verve-plugin-fi \
locale-xfce4-verve-plugin-fr \
locale-xfce4-verve-plugin-gl \
locale-xfce4-verve-plugin-he \
locale-xfce4-verve-plugin-hr \
locale-xfce4-verve-plugin-hu \
locale-xfce4-verve-plugin-id \
locale-xfce4-verve-plugin-is \
locale-xfce4-verve-plugin-it \
locale-xfce4-verve-plugin-ja \
locale-xfce4-verve-plugin-ko \
locale-xfce4-verve-plugin-lt \
locale-xfce4-verve-plugin-lv \
locale-xfce4-verve-plugin-ms \
locale-xfce4-verve-plugin-nb \
locale-xfce4-verve-plugin-nl \
locale-xfce4-verve-plugin-oc \
locale-xfce4-verve-plugin-pa \
locale-xfce4-verve-plugin-pl \
locale-xfce4-verve-plugin-pt \
locale-xfce4-verve-plugin-pt-BR \
locale-xfce4-verve-plugin-ro \
locale-xfce4-verve-plugin-ru \
locale-xfce4-verve-plugin-sk \
locale-xfce4-verve-plugin-sl \
locale-xfce4-verve-plugin-sq \
locale-xfce4-verve-plugin-sr \
locale-xfce4-verve-plugin-sv \
locale-xfce4-verve-plugin-th \
locale-xfce4-verve-plugin-tr \
locale-xfce4-verve-plugin-ug \
locale-xfce4-verve-plugin-uk \
locale-xfce4-verve-plugin-vi \
locale-xfce4-verve-plugin-zh-CN \
locale-xfce4-verve-plugin-zh-TW \
xfce4-panel-plugin-verve-lang \
xfce4-verve-plugin-lang \
xfce4-verve-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-verve-plugin"

inherit rpm
