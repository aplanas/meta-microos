SUMMARY = "Translations for package gnome-network-displays"
DESCRIPTION = "Provides translations for the 'gnome-network-displays' package."
LICENSE = "GPL-3.0-only"

PV = "0.90.5"

RPM_NAME = "gnome-network-displays-lang-0.90.5-1.7.noarch.rpm"
RPM_HASH = "b8ae9df167562811812ac3b5f073d947c89219047dd5837b3f99db6915661091dd34c4087c628bf5574511dc15f21125c329effaaa8f4986f9f4f7a12d9b6fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-network-displays-lang \
gnome-network-displays-lang-all \
locale-gnome-network-displays-ca \
locale-gnome-network-displays-cs \
locale-gnome-network-displays-de \
locale-gnome-network-displays-en-GB \
locale-gnome-network-displays-es \
locale-gnome-network-displays-eu \
locale-gnome-network-displays-fi \
locale-gnome-network-displays-fr \
locale-gnome-network-displays-hr \
locale-gnome-network-displays-id \
locale-gnome-network-displays-it \
locale-gnome-network-displays-ja \
locale-gnome-network-displays-nl \
locale-gnome-network-displays-pl \
locale-gnome-network-displays-pt-BR \
locale-gnome-network-displays-ro \
locale-gnome-network-displays-sl \
locale-gnome-network-displays-sr \
locale-gnome-network-displays-sv \
locale-gnome-network-displays-tr \
locale-gnome-network-displays-uk \
locale-gnome-network-displays-zh-CN"

RDEPENDS:${PN} += "gnome-network-displays"

inherit rpm
