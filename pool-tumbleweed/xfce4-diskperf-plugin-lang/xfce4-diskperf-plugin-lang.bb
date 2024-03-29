SUMMARY = "Translations for package xfce4-diskperf-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-diskperf-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "xfce4-diskperf-plugin-lang-2.7.0-1.8.noarch.rpm"
RPM_HASH = "1aa84fc6fcae61f794131fee9aa00cc9ac392f41544842730309f8b4ba56cab1a5d0298eebad89b3d09b688c014445844e038976e65d007207191a8c91cab1b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-diskperf-plugin-ar \
locale-xfce4-diskperf-plugin-be \
locale-xfce4-diskperf-plugin-bg \
locale-xfce4-diskperf-plugin-ca \
locale-xfce4-diskperf-plugin-cs \
locale-xfce4-diskperf-plugin-da \
locale-xfce4-diskperf-plugin-de \
locale-xfce4-diskperf-plugin-el \
locale-xfce4-diskperf-plugin-en-AU \
locale-xfce4-diskperf-plugin-en-CA \
locale-xfce4-diskperf-plugin-en-GB \
locale-xfce4-diskperf-plugin-es \
locale-xfce4-diskperf-plugin-eu \
locale-xfce4-diskperf-plugin-fr \
locale-xfce4-diskperf-plugin-gl \
locale-xfce4-diskperf-plugin-he \
locale-xfce4-diskperf-plugin-hr \
locale-xfce4-diskperf-plugin-hu \
locale-xfce4-diskperf-plugin-id \
locale-xfce4-diskperf-plugin-is \
locale-xfce4-diskperf-plugin-it \
locale-xfce4-diskperf-plugin-ja \
locale-xfce4-diskperf-plugin-ko \
locale-xfce4-diskperf-plugin-lt \
locale-xfce4-diskperf-plugin-lv \
locale-xfce4-diskperf-plugin-ms \
locale-xfce4-diskperf-plugin-nb \
locale-xfce4-diskperf-plugin-nl \
locale-xfce4-diskperf-plugin-oc \
locale-xfce4-diskperf-plugin-pa \
locale-xfce4-diskperf-plugin-pl \
locale-xfce4-diskperf-plugin-pt \
locale-xfce4-diskperf-plugin-pt-BR \
locale-xfce4-diskperf-plugin-ru \
locale-xfce4-diskperf-plugin-sk \
locale-xfce4-diskperf-plugin-sl \
locale-xfce4-diskperf-plugin-sq \
locale-xfce4-diskperf-plugin-sr \
locale-xfce4-diskperf-plugin-sv \
locale-xfce4-diskperf-plugin-th \
locale-xfce4-diskperf-plugin-tr \
locale-xfce4-diskperf-plugin-ug \
locale-xfce4-diskperf-plugin-uk \
locale-xfce4-diskperf-plugin-zh-CN \
locale-xfce4-diskperf-plugin-zh-TW \
xfce4-diskperf-plugin-lang \
xfce4-diskperf-plugin-lang-all \
xfce4-panel-plugin-diskperf-lang"

RDEPENDS:${PN} += "xfce4-diskperf-plugin"

inherit rpm
