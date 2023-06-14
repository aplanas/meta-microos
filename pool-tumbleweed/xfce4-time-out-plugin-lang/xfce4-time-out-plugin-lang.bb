SUMMARY = "Translations for package xfce4-time-out-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-time-out-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.3"

RPM_NAME = "xfce4-time-out-plugin-lang-1.1.3-1.1.noarch.rpm"
RPM_HASH = "b38dfe676147506442a845d51d3e8dc4c417cf1d2458e4fdc7073cddb7304e7943bb8d327ff4593d3c6f3acac90cfa4778638ed1eba3d753d69d066a6c93d15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-time-out-plugin-ar \
locale-xfce4-time-out-plugin-be \
locale-xfce4-time-out-plugin-bg \
locale-xfce4-time-out-plugin-ca \
locale-xfce4-time-out-plugin-cs \
locale-xfce4-time-out-plugin-da \
locale-xfce4-time-out-plugin-de \
locale-xfce4-time-out-plugin-el \
locale-xfce4-time-out-plugin-en-AU \
locale-xfce4-time-out-plugin-en-CA \
locale-xfce4-time-out-plugin-en-GB \
locale-xfce4-time-out-plugin-eo \
locale-xfce4-time-out-plugin-es \
locale-xfce4-time-out-plugin-et \
locale-xfce4-time-out-plugin-eu \
locale-xfce4-time-out-plugin-fi \
locale-xfce4-time-out-plugin-fr \
locale-xfce4-time-out-plugin-gl \
locale-xfce4-time-out-plugin-he \
locale-xfce4-time-out-plugin-hr \
locale-xfce4-time-out-plugin-hu \
locale-xfce4-time-out-plugin-id \
locale-xfce4-time-out-plugin-is \
locale-xfce4-time-out-plugin-it \
locale-xfce4-time-out-plugin-ja \
locale-xfce4-time-out-plugin-ko \
locale-xfce4-time-out-plugin-lt \
locale-xfce4-time-out-plugin-lv \
locale-xfce4-time-out-plugin-ms \
locale-xfce4-time-out-plugin-nb \
locale-xfce4-time-out-plugin-nl \
locale-xfce4-time-out-plugin-oc \
locale-xfce4-time-out-plugin-pl \
locale-xfce4-time-out-plugin-pt \
locale-xfce4-time-out-plugin-pt-BR \
locale-xfce4-time-out-plugin-ru \
locale-xfce4-time-out-plugin-sk \
locale-xfce4-time-out-plugin-sl \
locale-xfce4-time-out-plugin-sq \
locale-xfce4-time-out-plugin-sr \
locale-xfce4-time-out-plugin-sv \
locale-xfce4-time-out-plugin-tr \
locale-xfce4-time-out-plugin-ug \
locale-xfce4-time-out-plugin-uk \
locale-xfce4-time-out-plugin-zh-CN \
locale-xfce4-time-out-plugin-zh-TW \
xfce4-panel-plugin-timeout-lang \
xfce4-time-out-plugin-lang \
xfce4-time-out-plugin-lang-all"

RDEPENDS:${PN} += "xfce4-time-out-plugin"

inherit rpm
