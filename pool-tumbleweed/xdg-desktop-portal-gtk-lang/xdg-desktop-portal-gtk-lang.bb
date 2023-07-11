SUMMARY = "Translations for package xdg-desktop-portal-gtk"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "xdg-desktop-portal-gtk-lang-1.14.1-3.2.noarch.rpm"
RPM_HASH = "3e1ddc4f192056d5138ab7c30db9cd5d8a290416f15f7aabb0f18d00a8b53bba23751373e8312e193663c48feda7cf876d4ce25148af4c986eb139b9b1a04902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-gtk-cs \
locale-xdg-desktop-portal-gtk-da \
locale-xdg-desktop-portal-gtk-de \
locale-xdg-desktop-portal-gtk-en-GB \
locale-xdg-desktop-portal-gtk-es \
locale-xdg-desktop-portal-gtk-fr \
locale-xdg-desktop-portal-gtk-gl \
locale-xdg-desktop-portal-gtk-he \
locale-xdg-desktop-portal-gtk-hi \
locale-xdg-desktop-portal-gtk-hr \
locale-xdg-desktop-portal-gtk-hu \
locale-xdg-desktop-portal-gtk-id \
locale-xdg-desktop-portal-gtk-it \
locale-xdg-desktop-portal-gtk-ka \
locale-xdg-desktop-portal-gtk-lt \
locale-xdg-desktop-portal-gtk-nl \
locale-xdg-desktop-portal-gtk-oc \
locale-xdg-desktop-portal-gtk-pl \
locale-xdg-desktop-portal-gtk-pt \
locale-xdg-desktop-portal-gtk-pt-BR \
locale-xdg-desktop-portal-gtk-ru \
locale-xdg-desktop-portal-gtk-sk \
locale-xdg-desktop-portal-gtk-sr \
locale-xdg-desktop-portal-gtk-sv \
locale-xdg-desktop-portal-gtk-tr \
locale-xdg-desktop-portal-gtk-uk \
locale-xdg-desktop-portal-gtk-zh-CN \
locale-xdg-desktop-portal-gtk-zh-TW \
xdg-desktop-portal-gtk-lang \
xdg-desktop-portal-gtk-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-gtk"

inherit rpm
