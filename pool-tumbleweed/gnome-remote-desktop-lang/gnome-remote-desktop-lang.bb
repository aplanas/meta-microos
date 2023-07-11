SUMMARY = "Translations for package gnome-remote-desktop"
DESCRIPTION = "Provides translations for the 'gnome-remote-desktop' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-remote-desktop-lang-44.2-1.2.noarch.rpm"
RPM_HASH = "8e63bae032f1c9dfff284bd4065c335b689c7cfa1996eafe66927c9f75568d26849c586a698e445dc0242a2fe12b05aab3ac079833133f97746536aa1f63254c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-remote-desktop-lang \
gnome-remote-desktop-lang-all \
locale-gnome-remote-desktop-be \
locale-gnome-remote-desktop-bg \
locale-gnome-remote-desktop-ca \
locale-gnome-remote-desktop-cs \
locale-gnome-remote-desktop-da \
locale-gnome-remote-desktop-de \
locale-gnome-remote-desktop-el \
locale-gnome-remote-desktop-en-GB \
locale-gnome-remote-desktop-es \
locale-gnome-remote-desktop-eu \
locale-gnome-remote-desktop-fa \
locale-gnome-remote-desktop-fi \
locale-gnome-remote-desktop-fr \
locale-gnome-remote-desktop-fur \
locale-gnome-remote-desktop-gl \
locale-gnome-remote-desktop-he \
locale-gnome-remote-desktop-hr \
locale-gnome-remote-desktop-hu \
locale-gnome-remote-desktop-id \
locale-gnome-remote-desktop-is \
locale-gnome-remote-desktop-it \
locale-gnome-remote-desktop-ka \
locale-gnome-remote-desktop-kk \
locale-gnome-remote-desktop-ko \
locale-gnome-remote-desktop-lt \
locale-gnome-remote-desktop-lv \
locale-gnome-remote-desktop-nb \
locale-gnome-remote-desktop-ne \
locale-gnome-remote-desktop-nl \
locale-gnome-remote-desktop-oc \
locale-gnome-remote-desktop-pa \
locale-gnome-remote-desktop-pl \
locale-gnome-remote-desktop-pt \
locale-gnome-remote-desktop-pt-BR \
locale-gnome-remote-desktop-ro \
locale-gnome-remote-desktop-ru \
locale-gnome-remote-desktop-sk \
locale-gnome-remote-desktop-sl \
locale-gnome-remote-desktop-sr \
locale-gnome-remote-desktop-sv \
locale-gnome-remote-desktop-tr \
locale-gnome-remote-desktop-uk \
locale-gnome-remote-desktop-vi \
locale-gnome-remote-desktop-zh-CN \
locale-gnome-remote-desktop-zh-TW"

RDEPENDS:${PN} += "gnome-remote-desktop"

inherit rpm
