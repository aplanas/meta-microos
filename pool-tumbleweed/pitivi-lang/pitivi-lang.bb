SUMMARY = "Translations for package pitivi"
DESCRIPTION = "Provides translations for the 'pitivi' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.03"

RPM_NAME = "pitivi-lang-2023.03-1.2.noarch.rpm"
RPM_HASH = "4f4e5fb0c238d27fa2a6182672ef34daf9e28e8ee214ef6f74104c1769195a0d89c4e230414bd1110f2b6f61a6c9272dd85a2d6e4b10e2e10835c5121dcd45bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pitivi-ar \
locale-pitivi-ast \
locale-pitivi-bg \
locale-pitivi-bs \
locale-pitivi-ca \
locale-pitivi-ca@valencia \
locale-pitivi-cs \
locale-pitivi-da \
locale-pitivi-de \
locale-pitivi-dz \
locale-pitivi-el \
locale-pitivi-en-GB \
locale-pitivi-eo \
locale-pitivi-es \
locale-pitivi-et \
locale-pitivi-eu \
locale-pitivi-fi \
locale-pitivi-fr \
locale-pitivi-gl \
locale-pitivi-gu \
locale-pitivi-he \
locale-pitivi-hu \
locale-pitivi-id \
locale-pitivi-it \
locale-pitivi-ja \
locale-pitivi-ko \
locale-pitivi-lt \
locale-pitivi-lv \
locale-pitivi-mr \
locale-pitivi-nb \
locale-pitivi-nds \
locale-pitivi-nl \
locale-pitivi-oc \
locale-pitivi-pa \
locale-pitivi-pl \
locale-pitivi-pt \
locale-pitivi-pt-BR \
locale-pitivi-ro \
locale-pitivi-ru \
locale-pitivi-sk \
locale-pitivi-sl \
locale-pitivi-sr \
locale-pitivi-sr@latin \
locale-pitivi-sv \
locale-pitivi-te \
locale-pitivi-tr \
locale-pitivi-uk \
locale-pitivi-vi \
locale-pitivi-zh-CN \
locale-pitivi-zh-HK \
locale-pitivi-zh-TW \
pitivi-lang \
pitivi-lang-all"

RDEPENDS:${PN} += "pitivi"

inherit rpm
