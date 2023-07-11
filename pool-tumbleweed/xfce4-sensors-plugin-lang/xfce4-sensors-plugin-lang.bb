SUMMARY = "Translations for package xfce4-sensors-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-sensors-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-lang-1.4.4-1.4.noarch.rpm"
RPM_HASH = "c177c48e64e9d56cdcb1fa4ed8e40833c29194e464234f52380f13980da61320b551356d7eefa013c711a0397281d31a8e832a68efaa25b27bf46ecfa408b37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-sensors-plugin-ar \
locale-xfce4-sensors-plugin-be \
locale-xfce4-sensors-plugin-bg \
locale-xfce4-sensors-plugin-ca \
locale-xfce4-sensors-plugin-cs \
locale-xfce4-sensors-plugin-da \
locale-xfce4-sensors-plugin-de \
locale-xfce4-sensors-plugin-el \
locale-xfce4-sensors-plugin-en-AU \
locale-xfce4-sensors-plugin-en-GB \
locale-xfce4-sensors-plugin-es \
locale-xfce4-sensors-plugin-eu \
locale-xfce4-sensors-plugin-fi \
locale-xfce4-sensors-plugin-fr \
locale-xfce4-sensors-plugin-gl \
locale-xfce4-sensors-plugin-he \
locale-xfce4-sensors-plugin-hr \
locale-xfce4-sensors-plugin-hu \
locale-xfce4-sensors-plugin-id \
locale-xfce4-sensors-plugin-is \
locale-xfce4-sensors-plugin-it \
locale-xfce4-sensors-plugin-ja \
locale-xfce4-sensors-plugin-ko \
locale-xfce4-sensors-plugin-lt \
locale-xfce4-sensors-plugin-lv \
locale-xfce4-sensors-plugin-ms \
locale-xfce4-sensors-plugin-nb \
locale-xfce4-sensors-plugin-nl \
locale-xfce4-sensors-plugin-oc \
locale-xfce4-sensors-plugin-pl \
locale-xfce4-sensors-plugin-pt \
locale-xfce4-sensors-plugin-pt-BR \
locale-xfce4-sensors-plugin-ru \
locale-xfce4-sensors-plugin-sk \
locale-xfce4-sensors-plugin-sl \
locale-xfce4-sensors-plugin-sq \
locale-xfce4-sensors-plugin-sr \
locale-xfce4-sensors-plugin-sv \
locale-xfce4-sensors-plugin-th \
locale-xfce4-sensors-plugin-tr \
locale-xfce4-sensors-plugin-ug \
locale-xfce4-sensors-plugin-uk \
locale-xfce4-sensors-plugin-vi \
locale-xfce4-sensors-plugin-zh-CN \
locale-xfce4-sensors-plugin-zh-TW \
xfce4-panel-plugin-sensors-lang \
xfce4-sensors-plugin-lang \
xfce4-sensors-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-sensors-plugin"

inherit rpm
