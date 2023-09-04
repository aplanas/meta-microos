SUMMARY = "Translations for package xdg-desktop-portal-gnome"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gnome' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "xdg-desktop-portal-gnome-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "d9cdc22f694fd18abb35fefd62cd352aea5dcbb19f6863c20154ba52371112b01289a568506642082782d6caf20a0148bacb6ce93ae86df96a0b9e69a380917c"
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
