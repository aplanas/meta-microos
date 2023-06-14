SUMMARY = "Translations for package nautilus-share"
DESCRIPTION = "Provides translations for the 'nautilus-share' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5"

RPM_NAME = "nautilus-share-lang-0.7.5-2.3.noarch.rpm"
RPM_HASH = "abc41f937be4953d06da5c4b1af9ea33b1bf97638cd7536903c90542a377566821c4fa30b9e70e05e3577575ef87fdc82107540a1fb0874f88e2fdf7260915d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nautilus-share-ar \
locale-nautilus-share-as \
locale-nautilus-share-ast \
locale-nautilus-share-bn-IN \
locale-nautilus-share-bs \
locale-nautilus-share-ca \
locale-nautilus-share-ca@valencia \
locale-nautilus-share-cs \
locale-nautilus-share-da \
locale-nautilus-share-de \
locale-nautilus-share-dz \
locale-nautilus-share-el \
locale-nautilus-share-en-GB \
locale-nautilus-share-eo \
locale-nautilus-share-es \
locale-nautilus-share-et \
locale-nautilus-share-eu \
locale-nautilus-share-fi \
locale-nautilus-share-fr \
locale-nautilus-share-gl \
locale-nautilus-share-gu \
locale-nautilus-share-he \
locale-nautilus-share-hr \
locale-nautilus-share-hu \
locale-nautilus-share-id \
locale-nautilus-share-it \
locale-nautilus-share-ja \
locale-nautilus-share-kn \
locale-nautilus-share-ko \
locale-nautilus-share-lt \
locale-nautilus-share-lv \
locale-nautilus-share-ml \
locale-nautilus-share-mr \
locale-nautilus-share-nb \
locale-nautilus-share-oc \
locale-nautilus-share-or \
locale-nautilus-share-pa \
locale-nautilus-share-pl \
locale-nautilus-share-pt \
locale-nautilus-share-pt-BR \
locale-nautilus-share-ro \
locale-nautilus-share-ru \
locale-nautilus-share-sk \
locale-nautilus-share-sl \
locale-nautilus-share-sr \
locale-nautilus-share-sr@latin \
locale-nautilus-share-sv \
locale-nautilus-share-ta \
locale-nautilus-share-te \
locale-nautilus-share-uk \
locale-nautilus-share-vi \
locale-nautilus-share-zh-CN \
locale-nautilus-share-zh-HK \
locale-nautilus-share-zh-TW \
nautilus-share-lang \
nautilus-share-lang-all"

RDEPENDS:${PN} += "nautilus-share"

inherit rpm
