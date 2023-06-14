SUMMARY = "Translations for package xfce4-settings"
DESCRIPTION = "Provides translations for the 'xfce4-settings' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-lang-4.18.2-1.3.noarch.rpm"
RPM_HASH = "8c31399566cb4d57b15ee79e5b980f974bf70d438db390b179744920473413714aff49ed2ffd0508fcda1320a01a3c0f55e40df2a684b1fc8796516ce91cec62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-settings-ar \
locale-xfce4-settings-be \
locale-xfce4-settings-bg \
locale-xfce4-settings-bn \
locale-xfce4-settings-ca \
locale-xfce4-settings-cs \
locale-xfce4-settings-da \
locale-xfce4-settings-de \
locale-xfce4-settings-el \
locale-xfce4-settings-en-AU \
locale-xfce4-settings-en-CA \
locale-xfce4-settings-en-GB \
locale-xfce4-settings-es \
locale-xfce4-settings-et \
locale-xfce4-settings-eu \
locale-xfce4-settings-fi \
locale-xfce4-settings-fr \
locale-xfce4-settings-gl \
locale-xfce4-settings-he \
locale-xfce4-settings-hr \
locale-xfce4-settings-hu \
locale-xfce4-settings-id \
locale-xfce4-settings-is \
locale-xfce4-settings-it \
locale-xfce4-settings-ja \
locale-xfce4-settings-ka \
locale-xfce4-settings-ko \
locale-xfce4-settings-lt \
locale-xfce4-settings-lv \
locale-xfce4-settings-ms \
locale-xfce4-settings-nb \
locale-xfce4-settings-nl \
locale-xfce4-settings-nn \
locale-xfce4-settings-oc \
locale-xfce4-settings-pa \
locale-xfce4-settings-pl \
locale-xfce4-settings-pt \
locale-xfce4-settings-pt-BR \
locale-xfce4-settings-ro \
locale-xfce4-settings-ru \
locale-xfce4-settings-si \
locale-xfce4-settings-sk \
locale-xfce4-settings-sl \
locale-xfce4-settings-sq \
locale-xfce4-settings-sr \
locale-xfce4-settings-sv \
locale-xfce4-settings-te \
locale-xfce4-settings-th \
locale-xfce4-settings-tr \
locale-xfce4-settings-ug \
locale-xfce4-settings-uk \
locale-xfce4-settings-zh-CN \
locale-xfce4-settings-zh-HK \
locale-xfce4-settings-zh-TW \
xfce4-settings-lang \
xfce4-settings-lang-all"

RDEPENDS:${PN} += "xfce4-settings"

inherit rpm
