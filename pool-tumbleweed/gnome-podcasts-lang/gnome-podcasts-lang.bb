SUMMARY = "Translations for package gnome-podcasts"
DESCRIPTION = "Provides translations for the 'gnome-podcasts' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "gnome-podcasts-lang-0.5.1-2.11.noarch.rpm"
RPM_HASH = "dbdc00656da2eba2bd520c116c2eb98ae4430580d45dc0c2462a9e92ce09e011c2ce7d3b0883a2ab53a7671e3f672bd86eeae1c8993fecea9117cc0c3a673b3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-podcasts-lang \
gnome-podcasts-lang-all \
locale-gnome-podcasts-ca \
locale-gnome-podcasts-cs \
locale-gnome-podcasts-da \
locale-gnome-podcasts-de \
locale-gnome-podcasts-en-GB \
locale-gnome-podcasts-es \
locale-gnome-podcasts-eu \
locale-gnome-podcasts-fi \
locale-gnome-podcasts-fr \
locale-gnome-podcasts-fur \
locale-gnome-podcasts-gl \
locale-gnome-podcasts-hr \
locale-gnome-podcasts-hu \
locale-gnome-podcasts-id \
locale-gnome-podcasts-it \
locale-gnome-podcasts-ko \
locale-gnome-podcasts-lv \
locale-gnome-podcasts-nl \
locale-gnome-podcasts-oc \
locale-gnome-podcasts-pl \
locale-gnome-podcasts-pt \
locale-gnome-podcasts-pt-BR \
locale-gnome-podcasts-ro \
locale-gnome-podcasts-sk \
locale-gnome-podcasts-sl \
locale-gnome-podcasts-sr \
locale-gnome-podcasts-sv \
locale-gnome-podcasts-tr \
locale-gnome-podcasts-uk \
locale-gnome-podcasts-zh-CN"

RDEPENDS:${PN} += "gnome-podcasts"

inherit rpm
