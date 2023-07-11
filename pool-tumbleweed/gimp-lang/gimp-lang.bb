SUMMARY = "Translations for package gimp"
DESCRIPTION = "Provides translations for the 'gimp' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.34"

RPM_NAME = "gimp-lang-2.10.34-5.1.noarch.rpm"
RPM_HASH = "d70b9544e6226b99f359d7bb4f5c243bae43c32a803553232002e988e1b619c6428685e30d942e38573176c6cedc1ccef718c6f69860be915e3c55f69b7605e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-lang \
gimp-lang-all \
locale-gimp-ar \
locale-gimp-ast \
locale-gimp-az \
locale-gimp-be \
locale-gimp-bg \
locale-gimp-br \
locale-gimp-bs \
locale-gimp-ca \
locale-gimp-ca@valencia \
locale-gimp-cs \
locale-gimp-da \
locale-gimp-de \
locale-gimp-dz \
locale-gimp-el \
locale-gimp-en-CA \
locale-gimp-en-GB \
locale-gimp-eo \
locale-gimp-es \
locale-gimp-et \
locale-gimp-eu \
locale-gimp-fa \
locale-gimp-fi \
locale-gimp-fr \
locale-gimp-ga \
locale-gimp-gd \
locale-gimp-gl \
locale-gimp-gu \
locale-gimp-he \
locale-gimp-hi \
locale-gimp-hr \
locale-gimp-hu \
locale-gimp-id \
locale-gimp-is \
locale-gimp-it \
locale-gimp-ja \
locale-gimp-ka \
locale-gimp-kk \
locale-gimp-km \
locale-gimp-kn \
locale-gimp-ko \
locale-gimp-lt \
locale-gimp-lv \
locale-gimp-mk \
locale-gimp-ml \
locale-gimp-mr \
locale-gimp-ms \
locale-gimp-nb \
locale-gimp-nds \
locale-gimp-ne \
locale-gimp-nl \
locale-gimp-nn \
locale-gimp-oc \
locale-gimp-pa \
locale-gimp-pl \
locale-gimp-pt \
locale-gimp-pt-BR \
locale-gimp-ro \
locale-gimp-ru \
locale-gimp-si \
locale-gimp-sk \
locale-gimp-sl \
locale-gimp-sr \
locale-gimp-sr@latin \
locale-gimp-sv \
locale-gimp-ta \
locale-gimp-te \
locale-gimp-th \
locale-gimp-tr \
locale-gimp-uk \
locale-gimp-vi \
locale-gimp-zh-CN \
locale-gimp-zh-HK \
locale-gimp-zh-TW"

RDEPENDS:${PN} += "gimp"

inherit rpm
