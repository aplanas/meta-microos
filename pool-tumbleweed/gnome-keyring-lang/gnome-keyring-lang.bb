SUMMARY = "Translations for package gnome-keyring"
DESCRIPTION = "Provides translations for the 'gnome-keyring' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "gnome-keyring-lang-42.1-2.4.noarch.rpm"
RPM_HASH = "b4f1c30a79612d529c10cd3f6c9b5ac50ab897b3e166ea1bf9ed7862a497d25347a341f6ec3e21e521952e0de0b4382eb337e1f1dd8805afb77f0b525c9c2d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-keyring-lang \
gnome-keyring-lang-all \
locale-gnome-keyring-af \
locale-gnome-keyring-ar \
locale-gnome-keyring-as \
locale-gnome-keyring-ast \
locale-gnome-keyring-az \
locale-gnome-keyring-be \
locale-gnome-keyring-be@latin \
locale-gnome-keyring-bg \
locale-gnome-keyring-bn \
locale-gnome-keyring-bn-IN \
locale-gnome-keyring-bs \
locale-gnome-keyring-ca \
locale-gnome-keyring-ca@valencia \
locale-gnome-keyring-cs \
locale-gnome-keyring-cy \
locale-gnome-keyring-da \
locale-gnome-keyring-de \
locale-gnome-keyring-dz \
locale-gnome-keyring-el \
locale-gnome-keyring-en-CA \
locale-gnome-keyring-en-GB \
locale-gnome-keyring-en@shaw \
locale-gnome-keyring-eo \
locale-gnome-keyring-es \
locale-gnome-keyring-et \
locale-gnome-keyring-eu \
locale-gnome-keyring-fa \
locale-gnome-keyring-fi \
locale-gnome-keyring-fr \
locale-gnome-keyring-fur \
locale-gnome-keyring-ga \
locale-gnome-keyring-gd \
locale-gnome-keyring-gl \
locale-gnome-keyring-gu \
locale-gnome-keyring-he \
locale-gnome-keyring-hi \
locale-gnome-keyring-hr \
locale-gnome-keyring-hu \
locale-gnome-keyring-id \
locale-gnome-keyring-is \
locale-gnome-keyring-it \
locale-gnome-keyring-ja \
locale-gnome-keyring-ka \
locale-gnome-keyring-kk \
locale-gnome-keyring-km \
locale-gnome-keyring-kn \
locale-gnome-keyring-ko \
locale-gnome-keyring-lt \
locale-gnome-keyring-lv \
locale-gnome-keyring-mai \
locale-gnome-keyring-mk \
locale-gnome-keyring-ml \
locale-gnome-keyring-mr \
locale-gnome-keyring-ms \
locale-gnome-keyring-nb \
locale-gnome-keyring-ne \
locale-gnome-keyring-nl \
locale-gnome-keyring-nn \
locale-gnome-keyring-oc \
locale-gnome-keyring-or \
locale-gnome-keyring-pa \
locale-gnome-keyring-pl \
locale-gnome-keyring-pt \
locale-gnome-keyring-pt-BR \
locale-gnome-keyring-ro \
locale-gnome-keyring-ru \
locale-gnome-keyring-si \
locale-gnome-keyring-sk \
locale-gnome-keyring-sl \
locale-gnome-keyring-sq \
locale-gnome-keyring-sr \
locale-gnome-keyring-sr@latin \
locale-gnome-keyring-sv \
locale-gnome-keyring-ta \
locale-gnome-keyring-te \
locale-gnome-keyring-th \
locale-gnome-keyring-tr \
locale-gnome-keyring-ug \
locale-gnome-keyring-uk \
locale-gnome-keyring-vi \
locale-gnome-keyring-zh-CN \
locale-gnome-keyring-zh-HK \
locale-gnome-keyring-zh-TW"

RDEPENDS:${PN} += "gnome-keyring"

inherit rpm
