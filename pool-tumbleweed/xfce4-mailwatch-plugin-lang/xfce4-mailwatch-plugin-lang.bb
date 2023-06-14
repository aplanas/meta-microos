SUMMARY = "Translations for package xfce4-mailwatch-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-mailwatch-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.1"

RPM_NAME = "xfce4-mailwatch-plugin-lang-1.3.1-1.1.noarch.rpm"
RPM_HASH = "7954e699415dce6aa5a320bca96a5c3d8891cfc35964ced1dab6433cc3343d7a3ebe1b732be51c1d84ba233c72965525084113a284e3e32dce17452584c3e369"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-mailwatch-plugin-ar \
locale-xfce4-mailwatch-plugin-be \
locale-xfce4-mailwatch-plugin-bg \
locale-xfce4-mailwatch-plugin-ca \
locale-xfce4-mailwatch-plugin-cs \
locale-xfce4-mailwatch-plugin-da \
locale-xfce4-mailwatch-plugin-de \
locale-xfce4-mailwatch-plugin-el \
locale-xfce4-mailwatch-plugin-en-AU \
locale-xfce4-mailwatch-plugin-en-GB \
locale-xfce4-mailwatch-plugin-es \
locale-xfce4-mailwatch-plugin-eu \
locale-xfce4-mailwatch-plugin-fi \
locale-xfce4-mailwatch-plugin-fr \
locale-xfce4-mailwatch-plugin-gl \
locale-xfce4-mailwatch-plugin-he \
locale-xfce4-mailwatch-plugin-hr \
locale-xfce4-mailwatch-plugin-hu \
locale-xfce4-mailwatch-plugin-id \
locale-xfce4-mailwatch-plugin-is \
locale-xfce4-mailwatch-plugin-it \
locale-xfce4-mailwatch-plugin-ja \
locale-xfce4-mailwatch-plugin-ko \
locale-xfce4-mailwatch-plugin-lt \
locale-xfce4-mailwatch-plugin-lv \
locale-xfce4-mailwatch-plugin-ms \
locale-xfce4-mailwatch-plugin-nb \
locale-xfce4-mailwatch-plugin-nl \
locale-xfce4-mailwatch-plugin-oc \
locale-xfce4-mailwatch-plugin-pl \
locale-xfce4-mailwatch-plugin-pt \
locale-xfce4-mailwatch-plugin-pt-BR \
locale-xfce4-mailwatch-plugin-ru \
locale-xfce4-mailwatch-plugin-sk \
locale-xfce4-mailwatch-plugin-sl \
locale-xfce4-mailwatch-plugin-sq \
locale-xfce4-mailwatch-plugin-sr \
locale-xfce4-mailwatch-plugin-sv \
locale-xfce4-mailwatch-plugin-th \
locale-xfce4-mailwatch-plugin-tr \
locale-xfce4-mailwatch-plugin-ug \
locale-xfce4-mailwatch-plugin-uk \
locale-xfce4-mailwatch-plugin-vi \
locale-xfce4-mailwatch-plugin-zh-CN \
locale-xfce4-mailwatch-plugin-zh-TW \
xfce4-mailwatch-plugin-lang \
xfce4-mailwatch-plugin-lang-all \
xfce4-panel-plugin-mailwatch-lang"

RDEPENDS:${PN} += "xfce4-mailwatch-plugin"

inherit rpm
