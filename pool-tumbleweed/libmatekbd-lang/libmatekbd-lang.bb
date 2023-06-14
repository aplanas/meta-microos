SUMMARY = "Translations for package libmatekbd"
DESCRIPTION = "Provides translations for the 'libmatekbd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmatekbd-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "6836f1a2939c5fd5f4f6e57a93c13527f70ea1a92f202516e995574685e9ce344c995cc9214cf60a407aba17eb33919448ebf7b8389f2a5db359ee14d2f37db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmatekbd-lang \
libmatekbd-lang-all \
locale-libmatekbd-af \
locale-libmatekbd-ar \
locale-libmatekbd-as \
locale-libmatekbd-ast \
locale-libmatekbd-az \
locale-libmatekbd-be \
locale-libmatekbd-bg \
locale-libmatekbd-bn \
locale-libmatekbd-bn-IN \
locale-libmatekbd-br \
locale-libmatekbd-bs \
locale-libmatekbd-ca \
locale-libmatekbd-ca@valencia \
locale-libmatekbd-cs \
locale-libmatekbd-cy \
locale-libmatekbd-da \
locale-libmatekbd-de \
locale-libmatekbd-de-CH \
locale-libmatekbd-dz \
locale-libmatekbd-el \
locale-libmatekbd-en-AU \
locale-libmatekbd-en-CA \
locale-libmatekbd-en-GB \
locale-libmatekbd-eo \
locale-libmatekbd-es \
locale-libmatekbd-es-AR \
locale-libmatekbd-es-CL \
locale-libmatekbd-es-CO \
locale-libmatekbd-es-CR \
locale-libmatekbd-es-DO \
locale-libmatekbd-es-EC \
locale-libmatekbd-es-ES \
locale-libmatekbd-es-MX \
locale-libmatekbd-es-NI \
locale-libmatekbd-es-PA \
locale-libmatekbd-es-PE \
locale-libmatekbd-es-PR \
locale-libmatekbd-es-SV \
locale-libmatekbd-es-UY \
locale-libmatekbd-es-VE \
locale-libmatekbd-et \
locale-libmatekbd-eu \
locale-libmatekbd-fa \
locale-libmatekbd-fi \
locale-libmatekbd-fr \
locale-libmatekbd-fr-CA \
locale-libmatekbd-fur \
locale-libmatekbd-ga \
locale-libmatekbd-gd \
locale-libmatekbd-gl \
locale-libmatekbd-gu \
locale-libmatekbd-he \
locale-libmatekbd-hi \
locale-libmatekbd-hr \
locale-libmatekbd-hu \
locale-libmatekbd-ia \
locale-libmatekbd-id \
locale-libmatekbd-is \
locale-libmatekbd-it \
locale-libmatekbd-ja \
locale-libmatekbd-ka \
locale-libmatekbd-kk \
locale-libmatekbd-km \
locale-libmatekbd-kn \
locale-libmatekbd-ko \
locale-libmatekbd-lt \
locale-libmatekbd-lv \
locale-libmatekbd-mai \
locale-libmatekbd-mk \
locale-libmatekbd-ml \
locale-libmatekbd-mr \
locale-libmatekbd-ms \
locale-libmatekbd-nb \
locale-libmatekbd-nds \
locale-libmatekbd-ne \
locale-libmatekbd-nl \
locale-libmatekbd-nn \
locale-libmatekbd-oc \
locale-libmatekbd-or \
locale-libmatekbd-pa \
locale-libmatekbd-pl \
locale-libmatekbd-pt \
locale-libmatekbd-pt-BR \
locale-libmatekbd-ro \
locale-libmatekbd-ru \
locale-libmatekbd-si \
locale-libmatekbd-sk \
locale-libmatekbd-sl \
locale-libmatekbd-sq \
locale-libmatekbd-sr \
locale-libmatekbd-sr@latin \
locale-libmatekbd-sv \
locale-libmatekbd-ta \
locale-libmatekbd-te \
locale-libmatekbd-th \
locale-libmatekbd-tr \
locale-libmatekbd-ug \
locale-libmatekbd-uk \
locale-libmatekbd-vi \
locale-libmatekbd-wa \
locale-libmatekbd-zh-CN \
locale-libmatekbd-zh-HK \
locale-libmatekbd-zh-TW"

RDEPENDS:${PN} += "libmatekbd"

inherit rpm
