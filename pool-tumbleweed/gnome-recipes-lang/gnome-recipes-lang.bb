SUMMARY = "Translations for package gnome-recipes"
DESCRIPTION = "Provides translations for the 'gnome-recipes' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.4"

RPM_NAME = "gnome-recipes-lang-2.0.4-1.18.noarch.rpm"
RPM_HASH = "2d841040b3c19299cc25611fb23353b5ef83a2d9d1b062ee3fa85cbeeaeee745a527ae5035e59553855832bef2c7b6fad1c89f8994d0fcbd08155fa978f32937"
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
