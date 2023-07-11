SUMMARY = "Translations for package xdg-desktop-portal-gnome"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gnome' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "xdg-desktop-portal-gnome-lang-44.1-1.2.noarch.rpm"
RPM_HASH = "481e09cb1653f9dbfc4011c3303968ddffab74b36172d57d8c73b5ea22df9ac7aa26fbde31c39f9f35cdc0f06c3546226c6f7a19cdf9dfac83f0be6a276ad740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-gnome-be \
locale-xdg-desktop-portal-gnome-bg \
locale-xdg-desktop-portal-gnome-ca \
locale-xdg-desktop-portal-gnome-cs \
locale-xdg-desktop-portal-gnome-da \
locale-xdg-desktop-portal-gnome-de \
locale-xdg-desktop-portal-gnome-el \
locale-xdg-desktop-portal-gnome-en-GB \
locale-xdg-desktop-portal-gnome-es \
locale-xdg-desktop-portal-gnome-eu \
locale-xdg-desktop-portal-gnome-fa \
locale-xdg-desktop-portal-gnome-fi \
locale-xdg-desktop-portal-gnome-fr \
locale-xdg-desktop-portal-gnome-fur \
locale-xdg-desktop-portal-gnome-gl \
locale-xdg-desktop-portal-gnome-he \
locale-xdg-desktop-portal-gnome-hi \
locale-xdg-desktop-portal-gnome-hr \
locale-xdg-desktop-portal-gnome-hu \
locale-xdg-desktop-portal-gnome-id \
locale-xdg-desktop-portal-gnome-is \
locale-xdg-desktop-portal-gnome-it \
locale-xdg-desktop-portal-gnome-ja \
locale-xdg-desktop-portal-gnome-ka \
locale-xdg-desktop-portal-gnome-kk \
locale-xdg-desktop-portal-gnome-ko \
locale-xdg-desktop-portal-gnome-lt \
locale-xdg-desktop-portal-gnome-ne \
locale-xdg-desktop-portal-gnome-nl \
locale-xdg-desktop-portal-gnome-oc \
locale-xdg-desktop-portal-gnome-pa \
locale-xdg-desktop-portal-gnome-pl \
locale-xdg-desktop-portal-gnome-pt \
locale-xdg-desktop-portal-gnome-pt-BR \
locale-xdg-desktop-portal-gnome-ro \
locale-xdg-desktop-portal-gnome-ru \
locale-xdg-desktop-portal-gnome-sk \
locale-xdg-desktop-portal-gnome-sl \
locale-xdg-desktop-portal-gnome-sr \
locale-xdg-desktop-portal-gnome-sv \
locale-xdg-desktop-portal-gnome-tr \
locale-xdg-desktop-portal-gnome-uk \
locale-xdg-desktop-portal-gnome-zh-CN \
locale-xdg-desktop-portal-gnome-zh-TW \
xdg-desktop-portal-gnome-lang \
xdg-desktop-portal-gnome-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-gnome"

inherit rpm
