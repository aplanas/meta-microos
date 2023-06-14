SUMMARY = "Translations for package imageburner"
DESCRIPTION = "Provides translations for the 'imageburner' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "imageburner-lang-1.0.2-1.18.noarch.rpm"
RPM_HASH = "9f16fbc3a78c2a15fa41370e1e1f6a502e01eb0b9047c7aaf2427c6cb69aa927fe6a0392dc6390e68bbd5e7f3235649c75f9cca8daf3331694bbef730df0391f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "imageburner-lang \
imageburner-lang-all \
locale-imageburner-af \
locale-imageburner-ar \
locale-imageburner-as \
locale-imageburner-ast \
locale-imageburner-az \
locale-imageburner-be \
locale-imageburner-bg \
locale-imageburner-bn \
locale-imageburner-br \
locale-imageburner-bs \
locale-imageburner-ca \
locale-imageburner-cs \
locale-imageburner-cy \
locale-imageburner-da \
locale-imageburner-de \
locale-imageburner-dz \
locale-imageburner-el \
locale-imageburner-en-AU \
locale-imageburner-en-CA \
locale-imageburner-en-GB \
locale-imageburner-eo \
locale-imageburner-es \
locale-imageburner-et \
locale-imageburner-eu \
locale-imageburner-fa \
locale-imageburner-fi \
locale-imageburner-fr \
locale-imageburner-fr-CA \
locale-imageburner-ga \
locale-imageburner-gd \
locale-imageburner-gl \
locale-imageburner-gu \
locale-imageburner-he \
locale-imageburner-hi \
locale-imageburner-hr \
locale-imageburner-hu \
locale-imageburner-ia \
locale-imageburner-id \
locale-imageburner-is \
locale-imageburner-it \
locale-imageburner-ja \
locale-imageburner-ka \
locale-imageburner-kk \
locale-imageburner-km \
locale-imageburner-kn \
locale-imageburner-ko \
locale-imageburner-lt \
locale-imageburner-lv \
locale-imageburner-mk \
locale-imageburner-ml \
locale-imageburner-mr \
locale-imageburner-ms \
locale-imageburner-nb \
locale-imageburner-ne \
locale-imageburner-nl \
locale-imageburner-nn \
locale-imageburner-oc \
locale-imageburner-or \
locale-imageburner-pa \
locale-imageburner-pl \
locale-imageburner-pt \
locale-imageburner-pt-BR \
locale-imageburner-ro \
locale-imageburner-ru \
locale-imageburner-si \
locale-imageburner-sk \
locale-imageburner-sl \
locale-imageburner-sq \
locale-imageburner-sr \
locale-imageburner-sv \
locale-imageburner-ta \
locale-imageburner-te \
locale-imageburner-th \
locale-imageburner-tr \
locale-imageburner-ug \
locale-imageburner-uk \
locale-imageburner-vi \
locale-imageburner-wa \
locale-imageburner-zh \
locale-imageburner-zh-HK \
locale-imageburner-zh-TW"

RDEPENDS:${PN} += "imageburner"

inherit rpm
