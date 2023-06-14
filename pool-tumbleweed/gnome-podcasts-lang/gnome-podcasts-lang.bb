SUMMARY = "Translations for package gnome-podcasts"
DESCRIPTION = "Provides translations for the 'gnome-podcasts' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.1"

RPM_NAME = "gnome-podcasts-lang-0.5.1-2.9.noarch.rpm"
RPM_HASH = "7f9cbcf30f465eb7306a7c29887dfcbe62b56680999f7b8fdc4c35312b0aadade52eca628bef311df836b78b418dceaf141ccdbdf6572339421e0a21ef7fdec0"
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
