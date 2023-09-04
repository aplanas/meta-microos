SUMMARY = "Translations for package libgedit-gtksourceview"
DESCRIPTION = "Provides translations for the 'libgedit-gtksourceview' package."
LICENSE = "LGPL-2.1-or-later"

PV = "299.0.3"

RPM_NAME = "libgedit-gtksourceview-lang-299.0.3-1.1.noarch.rpm"
RPM_HASH = "84cbd0f9b9b147ba6d079389b6ec2fd167cc5302c65ed841554c1ec7f6c4b714dec3dffadae253d2fb813ba75e7897a29037cb9567aadd48db7e25ee89f4aa35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgedit-gtksourceview-lang \
libgedit-gtksourceview-lang-all \
locale-libgedit-gtksourceview-ar \
locale-libgedit-gtksourceview-as \
locale-libgedit-gtksourceview-ast \
locale-libgedit-gtksourceview-az \
locale-libgedit-gtksourceview-be \
locale-libgedit-gtksourceview-bg \
locale-libgedit-gtksourceview-bn \
locale-libgedit-gtksourceview-bn-IN \
locale-libgedit-gtksourceview-bs \
locale-libgedit-gtksourceview-ca \
locale-libgedit-gtksourceview-ca@valencia \
locale-libgedit-gtksourceview-cs \
locale-libgedit-gtksourceview-cy \
locale-libgedit-gtksourceview-da \
locale-libgedit-gtksourceview-de \
locale-libgedit-gtksourceview-dz \
locale-libgedit-gtksourceview-el \
locale-libgedit-gtksourceview-en-CA \
locale-libgedit-gtksourceview-en-GB \
locale-libgedit-gtksourceview-en@shaw \
locale-libgedit-gtksourceview-eo \
locale-libgedit-gtksourceview-es \
locale-libgedit-gtksourceview-et \
locale-libgedit-gtksourceview-eu \
locale-libgedit-gtksourceview-fa \
locale-libgedit-gtksourceview-fi \
locale-libgedit-gtksourceview-fr \
locale-libgedit-gtksourceview-fur \
locale-libgedit-gtksourceview-ga \
locale-libgedit-gtksourceview-gl \
locale-libgedit-gtksourceview-gu \
locale-libgedit-gtksourceview-he \
locale-libgedit-gtksourceview-hi \
locale-libgedit-gtksourceview-hr \
locale-libgedit-gtksourceview-hu \
locale-libgedit-gtksourceview-id \
locale-libgedit-gtksourceview-it \
locale-libgedit-gtksourceview-ja \
locale-libgedit-gtksourceview-kk \
locale-libgedit-gtksourceview-kn \
locale-libgedit-gtksourceview-ko \
locale-libgedit-gtksourceview-lt \
locale-libgedit-gtksourceview-lv \
locale-libgedit-gtksourceview-mai \
locale-libgedit-gtksourceview-mk \
locale-libgedit-gtksourceview-ml \
locale-libgedit-gtksourceview-mr \
locale-libgedit-gtksourceview-ms \
locale-libgedit-gtksourceview-nb \
locale-libgedit-gtksourceview-ne \
locale-libgedit-gtksourceview-nl \
locale-libgedit-gtksourceview-nn \
locale-libgedit-gtksourceview-oc \
locale-libgedit-gtksourceview-or \
locale-libgedit-gtksourceview-pa \
locale-libgedit-gtksourceview-pl \
locale-libgedit-gtksourceview-pt \
locale-libgedit-gtksourceview-pt-BR \
locale-libgedit-gtksourceview-ro \
locale-libgedit-gtksourceview-ru \
locale-libgedit-gtksourceview-si \
locale-libgedit-gtksourceview-sk \
locale-libgedit-gtksourceview-sl \
locale-libgedit-gtksourceview-sq \
locale-libgedit-gtksourceview-sr \
locale-libgedit-gtksourceview-sr@latin \
locale-libgedit-gtksourceview-sv \
locale-libgedit-gtksourceview-ta \
locale-libgedit-gtksourceview-te \
locale-libgedit-gtksourceview-th \
locale-libgedit-gtksourceview-tr \
locale-libgedit-gtksourceview-ug \
locale-libgedit-gtksourceview-uk \
locale-libgedit-gtksourceview-vi \
locale-libgedit-gtksourceview-zh-CN \
locale-libgedit-gtksourceview-zh-HK \
locale-libgedit-gtksourceview-zh-TW"

RDEPENDS:${PN} += "libgedit-gtksourceview"

inherit rpm
