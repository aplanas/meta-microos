SUMMARY = "Translations for package xfce4-taskmanager"
DESCRIPTION = "Provides translations for the 'xfce4-taskmanager' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.5"

RPM_NAME = "xfce4-taskmanager-lang-1.5.5-1.4.noarch.rpm"
RPM_HASH = "138a95242ff6def6c809f101d5acdf4c0d1804d3276e830503b256f7b47e0b6eb3581bc25c48c99c821f3d78cbc76d9a849c343e21d8caea9cbec4cabf4ce543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-taskmanager-ar \
locale-xfce4-taskmanager-ast \
locale-xfce4-taskmanager-az \
locale-xfce4-taskmanager-be \
locale-xfce4-taskmanager-bg \
locale-xfce4-taskmanager-ca \
locale-xfce4-taskmanager-cs \
locale-xfce4-taskmanager-da \
locale-xfce4-taskmanager-de \
locale-xfce4-taskmanager-el \
locale-xfce4-taskmanager-en-AU \
locale-xfce4-taskmanager-en-GB \
locale-xfce4-taskmanager-es \
locale-xfce4-taskmanager-et \
locale-xfce4-taskmanager-eu \
locale-xfce4-taskmanager-fi \
locale-xfce4-taskmanager-fr \
locale-xfce4-taskmanager-gl \
locale-xfce4-taskmanager-he \
locale-xfce4-taskmanager-hr \
locale-xfce4-taskmanager-hu \
locale-xfce4-taskmanager-id \
locale-xfce4-taskmanager-is \
locale-xfce4-taskmanager-it \
locale-xfce4-taskmanager-ja \
locale-xfce4-taskmanager-kk \
locale-xfce4-taskmanager-ko \
locale-xfce4-taskmanager-lt \
locale-xfce4-taskmanager-lv \
locale-xfce4-taskmanager-ms \
locale-xfce4-taskmanager-nb \
locale-xfce4-taskmanager-nl \
locale-xfce4-taskmanager-oc \
locale-xfce4-taskmanager-pa \
locale-xfce4-taskmanager-pl \
locale-xfce4-taskmanager-pt \
locale-xfce4-taskmanager-pt-BR \
locale-xfce4-taskmanager-ru \
locale-xfce4-taskmanager-si \
locale-xfce4-taskmanager-sk \
locale-xfce4-taskmanager-sl \
locale-xfce4-taskmanager-sq \
locale-xfce4-taskmanager-sr \
locale-xfce4-taskmanager-sv \
locale-xfce4-taskmanager-te \
locale-xfce4-taskmanager-th \
locale-xfce4-taskmanager-tr \
locale-xfce4-taskmanager-ug \
locale-xfce4-taskmanager-uk \
locale-xfce4-taskmanager-vi \
locale-xfce4-taskmanager-zh-CN \
locale-xfce4-taskmanager-zh-HK \
locale-xfce4-taskmanager-zh-TW \
xfce4-taskmanager-lang \
xfce4-taskmanager-lang-all"

RDEPENDS:${PN} += "xfce4-taskmanager"

inherit rpm
