SUMMARY = "Translations for package xfce4-verve-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-verve-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "xfce4-verve-plugin-lang-2.0.1-1.11.noarch.rpm"
RPM_HASH = "2d3eb4d5cb4298595564c9a3b41d5e3c4948fdecad05c9fa0dcd75fa1186670520b6d056f75cf96855b0cdee9edaf5c91cc866edaffb93b1d5d87fe888f25940"
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
