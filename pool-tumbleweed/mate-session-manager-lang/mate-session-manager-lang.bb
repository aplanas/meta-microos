SUMMARY = "Translations for package mate-session-manager"
DESCRIPTION = "Provides translations for the 'mate-session-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-session-manager-lang-1.26.1-2.1.noarch.rpm"
RPM_HASH = "e0890d88a00f03057cf6a8e5c2ba15c1564e8f09ca077a1168de35165b5a9d6e2cdf47b3f7873043636e8f8a2dfa2e441ff95adb2936ba29984bd588fc81c41d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-session-manager-af \
locale-mate-session-manager-ar \
locale-mate-session-manager-as \
locale-mate-session-manager-ast \
locale-mate-session-manager-az \
locale-mate-session-manager-be \
locale-mate-session-manager-bg \
locale-mate-session-manager-bn \
locale-mate-session-manager-bn-IN \
locale-mate-session-manager-br \
locale-mate-session-manager-bs \
locale-mate-session-manager-ca \
locale-mate-session-manager-ca@valencia \
locale-mate-session-manager-cs \
locale-mate-session-manager-cy \
locale-mate-session-manager-da \
locale-mate-session-manager-de \
locale-mate-session-manager-dz \
locale-mate-session-manager-el \
locale-mate-session-manager-en-AU \
locale-mate-session-manager-en-CA \
locale-mate-session-manager-en-GB \
locale-mate-session-manager-en-US \
locale-mate-session-manager-eo \
locale-mate-session-manager-es \
locale-mate-session-manager-es-AR \
locale-mate-session-manager-es-CL \
locale-mate-session-manager-es-CO \
locale-mate-session-manager-es-CR \
locale-mate-session-manager-es-DO \
locale-mate-session-manager-es-EC \
locale-mate-session-manager-es-ES \
locale-mate-session-manager-es-MX \
locale-mate-session-manager-es-NI \
locale-mate-session-manager-es-PA \
locale-mate-session-manager-es-PE \
locale-mate-session-manager-es-PR \
locale-mate-session-manager-es-SV \
locale-mate-session-manager-es-UY \
locale-mate-session-manager-es-VE \
locale-mate-session-manager-et \
locale-mate-session-manager-eu \
locale-mate-session-manager-fa \
locale-mate-session-manager-fi \
locale-mate-session-manager-fr \
locale-mate-session-manager-fr-CA \
locale-mate-session-manager-fur \
locale-mate-session-manager-ga \
locale-mate-session-manager-gd \
locale-mate-session-manager-gl \
locale-mate-session-manager-gu \
locale-mate-session-manager-he \
locale-mate-session-manager-hi \
locale-mate-session-manager-hr \
locale-mate-session-manager-hu \
locale-mate-session-manager-ia \
locale-mate-session-manager-id \
locale-mate-session-manager-is \
locale-mate-session-manager-it \
locale-mate-session-manager-ja \
locale-mate-session-manager-ka \
locale-mate-session-manager-kk \
locale-mate-session-manager-kn \
locale-mate-session-manager-ko \
locale-mate-session-manager-lt \
locale-mate-session-manager-lv \
locale-mate-session-manager-mai \
locale-mate-session-manager-mk \
locale-mate-session-manager-ml \
locale-mate-session-manager-mr \
locale-mate-session-manager-ms \
locale-mate-session-manager-nb \
locale-mate-session-manager-nds \
locale-mate-session-manager-ne \
locale-mate-session-manager-nl \
locale-mate-session-manager-nn \
locale-mate-session-manager-oc \
locale-mate-session-manager-or \
locale-mate-session-manager-pa \
locale-mate-session-manager-pl \
locale-mate-session-manager-pt \
locale-mate-session-manager-pt-BR \
locale-mate-session-manager-ro \
locale-mate-session-manager-ru \
locale-mate-session-manager-si \
locale-mate-session-manager-sk \
locale-mate-session-manager-sl \
locale-mate-session-manager-sq \
locale-mate-session-manager-sr \
locale-mate-session-manager-sr@latin \
locale-mate-session-manager-sv \
locale-mate-session-manager-ta \
locale-mate-session-manager-te \
locale-mate-session-manager-th \
locale-mate-session-manager-tr \
locale-mate-session-manager-ug \
locale-mate-session-manager-uk \
locale-mate-session-manager-vi \
locale-mate-session-manager-wa \
locale-mate-session-manager-zh-CN \
locale-mate-session-manager-zh-HK \
locale-mate-session-manager-zh-TW \
mate-session-manager-lang \
mate-session-manager-lang-all"

RDEPENDS:${PN} += "mate-session-manager"

inherit rpm
