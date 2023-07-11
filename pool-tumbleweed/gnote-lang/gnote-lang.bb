SUMMARY = "Translations for package gnote"
DESCRIPTION = "Provides translations for the 'gnote' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnote-lang-44.0-1.2.noarch.rpm"
RPM_HASH = "9da4fb9c597b9125c348a365282a0e635f169bc411daee5df96d6f5be2a28eb0c696f4798713a5d6649dd4f41b09a3c774561f94877d5d3b9fb79f884014a23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnote-lang \
gnote-lang-all \
locale-gnote-ar \
locale-gnote-as \
locale-gnote-bg \
locale-gnote-bn-IN \
locale-gnote-bs \
locale-gnote-ca \
locale-gnote-ca@valencia \
locale-gnote-cs \
locale-gnote-da \
locale-gnote-de \
locale-gnote-el \
locale-gnote-en-GB \
locale-gnote-eo \
locale-gnote-es \
locale-gnote-eu \
locale-gnote-fi \
locale-gnote-fr \
locale-gnote-gl \
locale-gnote-gu \
locale-gnote-he \
locale-gnote-hi \
locale-gnote-hu \
locale-gnote-id \
locale-gnote-it \
locale-gnote-ja \
locale-gnote-kn \
locale-gnote-ko \
locale-gnote-lt \
locale-gnote-lv \
locale-gnote-ml \
locale-gnote-mr \
locale-gnote-nb \
locale-gnote-nl \
locale-gnote-oc \
locale-gnote-or \
locale-gnote-pa \
locale-gnote-pl \
locale-gnote-pt \
locale-gnote-pt-BR \
locale-gnote-ro \
locale-gnote-ru \
locale-gnote-sk \
locale-gnote-sl \
locale-gnote-sr \
locale-gnote-sr@latin \
locale-gnote-sv \
locale-gnote-ta \
locale-gnote-te \
locale-gnote-th \
locale-gnote-tr \
locale-gnote-uk \
locale-gnote-zh-CN \
locale-gnote-zh-HK \
locale-gnote-zh-TW"

RDEPENDS:${PN} += "gnote"

inherit rpm
