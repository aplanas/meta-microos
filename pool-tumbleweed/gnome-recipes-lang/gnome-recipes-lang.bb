SUMMARY = "Translations for package gnome-recipes"
DESCRIPTION = "Provides translations for the 'gnome-recipes' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-recipes-lang-2.0.4-1.17.noarch.rpm"
RPM_HASH = "0c9215476f190baa5edeca65c475492b42604e50eef066d662c989334c6afdbbe59fd96b1b828f8e6c94cadfa0f03850a6058a9dd91ebb9e553aadf64027bc3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-recipes-lang \
gnome-recipes-lang-all \
locale-gnome-recipes-ar \
locale-gnome-recipes-ca \
locale-gnome-recipes-cs \
locale-gnome-recipes-de \
locale-gnome-recipes-en-GB \
locale-gnome-recipes-es \
locale-gnome-recipes-fi \
locale-gnome-recipes-fur \
locale-gnome-recipes-hu \
locale-gnome-recipes-id \
locale-gnome-recipes-ko \
locale-gnome-recipes-nb \
locale-gnome-recipes-nl \
locale-gnome-recipes-pl \
locale-gnome-recipes-pt-BR \
locale-gnome-recipes-sk \
locale-gnome-recipes-sl \
locale-gnome-recipes-sr \
locale-gnome-recipes-sv"

RDEPENDS:${PN} += "gnome-recipes"

inherit rpm
