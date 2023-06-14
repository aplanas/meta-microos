SUMMARY = "Translations for package libgweather4"
DESCRIPTION = "Provides translations for the 'libgweather4' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libgweather4-lang-4.2.0-2.1.noarch.rpm"
RPM_HASH = "74c4b3313532ca275e50d57ee2a7e360325bada91794aeb3c40744640b1cc70a4f74b0fe34002bb576a2c8ef1e67dcaa040a7c51958be90f54e255a54f22adf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgweather4-lang \
libgweather4-lang-all \
locale-libgweather4-af \
locale-libgweather4-ar \
locale-libgweather4-as \
locale-libgweather4-ast \
locale-libgweather4-az \
locale-libgweather4-be \
locale-libgweather4-be@latin \
locale-libgweather4-bg \
locale-libgweather4-bn \
locale-libgweather4-bn-IN \
locale-libgweather4-br \
locale-libgweather4-bs \
locale-libgweather4-ca \
locale-libgweather4-ca@valencia \
locale-libgweather4-cs \
locale-libgweather4-cy \
locale-libgweather4-da \
locale-libgweather4-de \
locale-libgweather4-dz \
locale-libgweather4-el \
locale-libgweather4-en-CA \
locale-libgweather4-en-GB \
locale-libgweather4-en@shaw \
locale-libgweather4-eo \
locale-libgweather4-es \
locale-libgweather4-es-AR \
locale-libgweather4-es-CL \
locale-libgweather4-es-CO \
locale-libgweather4-es-CR \
locale-libgweather4-es-DO \
locale-libgweather4-es-EC \
locale-libgweather4-es-ES \
locale-libgweather4-es-GT \
locale-libgweather4-es-HN \
locale-libgweather4-es-MX \
locale-libgweather4-es-NI \
locale-libgweather4-es-PA \
locale-libgweather4-es-PE \
locale-libgweather4-es-PR \
locale-libgweather4-es-SV \
locale-libgweather4-es-UY \
locale-libgweather4-es-VE \
locale-libgweather4-et \
locale-libgweather4-eu \
locale-libgweather4-fa \
locale-libgweather4-fi \
locale-libgweather4-fr \
locale-libgweather4-fur \
locale-libgweather4-ga \
locale-libgweather4-gd \
locale-libgweather4-gl \
locale-libgweather4-gu \
locale-libgweather4-he \
locale-libgweather4-hi \
locale-libgweather4-hr \
locale-libgweather4-hu \
locale-libgweather4-id \
locale-libgweather4-is \
locale-libgweather4-it \
locale-libgweather4-ja \
locale-libgweather4-ka \
locale-libgweather4-kk \
locale-libgweather4-kn \
locale-libgweather4-ko \
locale-libgweather4-lt \
locale-libgweather4-lv \
locale-libgweather4-mai \
locale-libgweather4-mk \
locale-libgweather4-ml \
locale-libgweather4-mr \
locale-libgweather4-ms \
locale-libgweather4-nb \
locale-libgweather4-nds \
locale-libgweather4-ne \
locale-libgweather4-nl \
locale-libgweather4-nn \
locale-libgweather4-oc \
locale-libgweather4-or \
locale-libgweather4-pa \
locale-libgweather4-pl \
locale-libgweather4-pt \
locale-libgweather4-pt-BR \
locale-libgweather4-ro \
locale-libgweather4-ru \
locale-libgweather4-si \
locale-libgweather4-sk \
locale-libgweather4-sl \
locale-libgweather4-sq \
locale-libgweather4-sr \
locale-libgweather4-sr@latin \
locale-libgweather4-sv \
locale-libgweather4-ta \
locale-libgweather4-te \
locale-libgweather4-th \
locale-libgweather4-tr \
locale-libgweather4-ug \
locale-libgweather4-uk \
locale-libgweather4-vi \
locale-libgweather4-wa \
locale-libgweather4-zh-CN \
locale-libgweather4-zh-HK \
locale-libgweather4-zh-TW"

RDEPENDS:${PN} += "libgweather4"

inherit rpm
