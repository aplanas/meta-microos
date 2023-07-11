SUMMARY = "Translations for package gnome-2048"
DESCRIPTION = "Provides translations for the 'gnome-2048' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-2048-lang-3.38.2-2.8.noarch.rpm"
RPM_HASH = "0e01c3dd67043ac2617e238b1622a9abdb8d0fbe2d24c2a805b96ffa23905a3fca6f6b4af1cbe0c7199164ca23429d1342e013fe4f50659b83a739341141804e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-2048-lang \
gnome-2048-lang-all \
locale-gnome-2048-bs \
locale-gnome-2048-ca \
locale-gnome-2048-cs \
locale-gnome-2048-da \
locale-gnome-2048-de \
locale-gnome-2048-el \
locale-gnome-2048-en-GB \
locale-gnome-2048-es \
locale-gnome-2048-eu \
locale-gnome-2048-fi \
locale-gnome-2048-fr \
locale-gnome-2048-fur \
locale-gnome-2048-he \
locale-gnome-2048-hr \
locale-gnome-2048-hu \
locale-gnome-2048-id \
locale-gnome-2048-it \
locale-gnome-2048-kk \
locale-gnome-2048-ko \
locale-gnome-2048-lt \
locale-gnome-2048-nb \
locale-gnome-2048-nl \
locale-gnome-2048-pl \
locale-gnome-2048-pt \
locale-gnome-2048-pt-BR \
locale-gnome-2048-ro \
locale-gnome-2048-ru \
locale-gnome-2048-sk \
locale-gnome-2048-sl \
locale-gnome-2048-sr \
locale-gnome-2048-sr@latin \
locale-gnome-2048-sv \
locale-gnome-2048-tr \
locale-gnome-2048-uk \
locale-gnome-2048-zh-CN"

RDEPENDS:${PN} += "gnome-2048"

inherit rpm
