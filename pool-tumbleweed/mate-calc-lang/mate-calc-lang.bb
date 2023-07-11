SUMMARY = "Translations for package mate-calc"
DESCRIPTION = "Provides translations for the 'mate-calc' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-calc-lang-1.26.0-1.10.noarch.rpm"
RPM_HASH = "55bed40ad9e95f0bed810e2bc4e28ffa9ecb54ec37a8121b5d0e8e088769bbffeae89268b0aef39e704c5f8facf57e52f0f5b0d751bbdcd0e20561791d62e3f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-calc-af \
locale-mate-calc-ar \
locale-mate-calc-as \
locale-mate-calc-ast \
locale-mate-calc-az \
locale-mate-calc-be \
locale-mate-calc-bg \
locale-mate-calc-bn \
locale-mate-calc-bn-IN \
locale-mate-calc-br \
locale-mate-calc-bs \
locale-mate-calc-ca \
locale-mate-calc-ca@valencia \
locale-mate-calc-cs \
locale-mate-calc-cy \
locale-mate-calc-da \
locale-mate-calc-de \
locale-mate-calc-dz \
locale-mate-calc-el \
locale-mate-calc-en-AU \
locale-mate-calc-en-CA \
locale-mate-calc-en-GB \
locale-mate-calc-eo \
locale-mate-calc-es \
locale-mate-calc-es-AR \
locale-mate-calc-es-CL \
locale-mate-calc-es-CO \
locale-mate-calc-es-CR \
locale-mate-calc-es-DO \
locale-mate-calc-es-EC \
locale-mate-calc-es-ES \
locale-mate-calc-es-MX \
locale-mate-calc-es-NI \
locale-mate-calc-es-PA \
locale-mate-calc-es-PE \
locale-mate-calc-es-PR \
locale-mate-calc-es-SV \
locale-mate-calc-es-UY \
locale-mate-calc-es-VE \
locale-mate-calc-et \
locale-mate-calc-eu \
locale-mate-calc-fa \
locale-mate-calc-fi \
locale-mate-calc-fr \
locale-mate-calc-fr-CA \
locale-mate-calc-fur \
locale-mate-calc-ga \
locale-mate-calc-gl \
locale-mate-calc-gu \
locale-mate-calc-he \
locale-mate-calc-hi \
locale-mate-calc-hr \
locale-mate-calc-hu \
locale-mate-calc-id \
locale-mate-calc-is \
locale-mate-calc-it \
locale-mate-calc-ja \
locale-mate-calc-ka \
locale-mate-calc-kk \
locale-mate-calc-km \
locale-mate-calc-kn \
locale-mate-calc-ko \
locale-mate-calc-lt \
locale-mate-calc-lv \
locale-mate-calc-mai \
locale-mate-calc-mk \
locale-mate-calc-ml \
locale-mate-calc-mr \
locale-mate-calc-ms \
locale-mate-calc-nb \
locale-mate-calc-nds \
locale-mate-calc-ne \
locale-mate-calc-nl \
locale-mate-calc-nn \
locale-mate-calc-oc \
locale-mate-calc-or \
locale-mate-calc-pa \
locale-mate-calc-pl \
locale-mate-calc-pt \
locale-mate-calc-pt-BR \
locale-mate-calc-ro \
locale-mate-calc-ru \
locale-mate-calc-si \
locale-mate-calc-sk \
locale-mate-calc-sl \
locale-mate-calc-sq \
locale-mate-calc-sr \
locale-mate-calc-sr@latin \
locale-mate-calc-sv \
locale-mate-calc-ta \
locale-mate-calc-te \
locale-mate-calc-th \
locale-mate-calc-tr \
locale-mate-calc-ug \
locale-mate-calc-uk \
locale-mate-calc-vi \
locale-mate-calc-wa \
locale-mate-calc-zh-CN \
locale-mate-calc-zh-HK \
locale-mate-calc-zh-TW \
mate-calc-lang \
mate-calc-lang-all"

RDEPENDS:${PN} += "mate-calc"

inherit rpm
