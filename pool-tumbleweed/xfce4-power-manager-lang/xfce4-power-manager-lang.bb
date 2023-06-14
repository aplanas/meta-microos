SUMMARY = "Translations for package xfce4-power-manager"
DESCRIPTION = "Provides translations for the 'xfce4-power-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-power-manager-lang-4.18.2-1.1.noarch.rpm"
RPM_HASH = "4e12710ba2c86ff5a1667914640da6e9a952eef8efdc2ebe11193eeae2648f8f44ef52411d06c07dfb13fa9154c9389cd4c896bc7f5ef8b7f8f44c7f7aa82eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-power-manager-ar \
locale-xfce4-power-manager-ast \
locale-xfce4-power-manager-be \
locale-xfce4-power-manager-bg \
locale-xfce4-power-manager-ca \
locale-xfce4-power-manager-cs \
locale-xfce4-power-manager-da \
locale-xfce4-power-manager-de \
locale-xfce4-power-manager-el \
locale-xfce4-power-manager-en-AU \
locale-xfce4-power-manager-en-CA \
locale-xfce4-power-manager-en-GB \
locale-xfce4-power-manager-es \
locale-xfce4-power-manager-et \
locale-xfce4-power-manager-eu \
locale-xfce4-power-manager-fi \
locale-xfce4-power-manager-fr \
locale-xfce4-power-manager-gl \
locale-xfce4-power-manager-he \
locale-xfce4-power-manager-hr \
locale-xfce4-power-manager-hu \
locale-xfce4-power-manager-id \
locale-xfce4-power-manager-is \
locale-xfce4-power-manager-it \
locale-xfce4-power-manager-ja \
locale-xfce4-power-manager-kk \
locale-xfce4-power-manager-kn \
locale-xfce4-power-manager-ko \
locale-xfce4-power-manager-lt \
locale-xfce4-power-manager-ms \
locale-xfce4-power-manager-nb \
locale-xfce4-power-manager-nl \
locale-xfce4-power-manager-nn \
locale-xfce4-power-manager-oc \
locale-xfce4-power-manager-pa \
locale-xfce4-power-manager-pl \
locale-xfce4-power-manager-pt \
locale-xfce4-power-manager-pt-BR \
locale-xfce4-power-manager-ro \
locale-xfce4-power-manager-ru \
locale-xfce4-power-manager-si \
locale-xfce4-power-manager-sk \
locale-xfce4-power-manager-sl \
locale-xfce4-power-manager-sq \
locale-xfce4-power-manager-sr \
locale-xfce4-power-manager-sv \
locale-xfce4-power-manager-te \
locale-xfce4-power-manager-th \
locale-xfce4-power-manager-tr \
locale-xfce4-power-manager-ug \
locale-xfce4-power-manager-uk \
locale-xfce4-power-manager-vi \
locale-xfce4-power-manager-zh-CN \
locale-xfce4-power-manager-zh-HK \
locale-xfce4-power-manager-zh-TW \
xfce4-power-manager-lang \
xfce4-power-manager-lang-all"

RDEPENDS:${PN} += "xfce4-power-manager"

inherit rpm
