SUMMARY = "Translations for package gnome-connections"
DESCRIPTION = "Provides translations for the 'gnome-connections' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-connections-lang-44.1-1.3.noarch.rpm"
RPM_HASH = "f07fb5ad2d1f3b494a145030da8a12661ae7f81f63b13284ece0224deac901af67d4bb5bbd39b88b9bee7314ae7f4563c39d119a038433628465cdec26528957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-connections-lang \
gnome-connections-lang-all \
locale-gnome-connections-be \
locale-gnome-connections-bg \
locale-gnome-connections-ca \
locale-gnome-connections-cs \
locale-gnome-connections-da \
locale-gnome-connections-de \
locale-gnome-connections-el \
locale-gnome-connections-en-GB \
locale-gnome-connections-eo \
locale-gnome-connections-es \
locale-gnome-connections-eu \
locale-gnome-connections-fa \
locale-gnome-connections-fi \
locale-gnome-connections-fr \
locale-gnome-connections-fur \
locale-gnome-connections-gl \
locale-gnome-connections-he \
locale-gnome-connections-hr \
locale-gnome-connections-hu \
locale-gnome-connections-id \
locale-gnome-connections-is \
locale-gnome-connections-it \
locale-gnome-connections-ja \
locale-gnome-connections-ka \
locale-gnome-connections-kk \
locale-gnome-connections-ko \
locale-gnome-connections-lt \
locale-gnome-connections-lv \
locale-gnome-connections-nb \
locale-gnome-connections-ne \
locale-gnome-connections-nl \
locale-gnome-connections-oc \
locale-gnome-connections-pa \
locale-gnome-connections-pl \
locale-gnome-connections-pt \
locale-gnome-connections-pt-BR \
locale-gnome-connections-ro \
locale-gnome-connections-ru \
locale-gnome-connections-sk \
locale-gnome-connections-sl \
locale-gnome-connections-sr \
locale-gnome-connections-sv \
locale-gnome-connections-tr \
locale-gnome-connections-uk \
locale-gnome-connections-vi \
locale-gnome-connections-zh-CN \
locale-gnome-connections-zh-TW"

RDEPENDS:${PN} += "gnome-connections"

inherit rpm
