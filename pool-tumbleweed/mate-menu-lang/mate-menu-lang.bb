SUMMARY = "Translations for package mate-menu"
DESCRIPTION = "Provides translations for the 'mate-menu' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.04.2"

RPM_NAME = "mate-menu-lang-22.04.2-1.5.noarch.rpm"
RPM_HASH = "9e8f829d0f6c533ebcaad898056069205bd165c6ea394ca0e1705b9f8c5b2d66f13a2001fbc5d574374a985c5f52cf2a2b17b1a7f633fc86dde64d183b19fbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-menu-af \
locale-mate-menu-ar \
locale-mate-menu-as \
locale-mate-menu-ast \
locale-mate-menu-az \
locale-mate-menu-be \
locale-mate-menu-bg \
locale-mate-menu-bn \
locale-mate-menu-bn-IN \
locale-mate-menu-br \
locale-mate-menu-bs \
locale-mate-menu-ca \
locale-mate-menu-ca@valencia \
locale-mate-menu-cs \
locale-mate-menu-cy \
locale-mate-menu-da \
locale-mate-menu-de \
locale-mate-menu-de-CH \
locale-mate-menu-dz \
locale-mate-menu-el \
locale-mate-menu-en \
locale-mate-menu-en-AU \
locale-mate-menu-en-CA \
locale-mate-menu-en-GB \
locale-mate-menu-en-US \
locale-mate-menu-eo \
locale-mate-menu-es \
locale-mate-menu-es-AR \
locale-mate-menu-es-CL \
locale-mate-menu-es-CO \
locale-mate-menu-es-CR \
locale-mate-menu-es-DO \
locale-mate-menu-es-EC \
locale-mate-menu-es-ES \
locale-mate-menu-es-MX \
locale-mate-menu-es-NI \
locale-mate-menu-es-PA \
locale-mate-menu-es-PE \
locale-mate-menu-es-PR \
locale-mate-menu-es-SV \
locale-mate-menu-es-UY \
locale-mate-menu-es-VE \
locale-mate-menu-et \
locale-mate-menu-eu \
locale-mate-menu-fa \
locale-mate-menu-fi \
locale-mate-menu-fr \
locale-mate-menu-fr-CA \
locale-mate-menu-fur \
locale-mate-menu-ga \
locale-mate-menu-gd \
locale-mate-menu-gl \
locale-mate-menu-gu \
locale-mate-menu-he \
locale-mate-menu-hi \
locale-mate-menu-hr \
locale-mate-menu-hu \
locale-mate-menu-ia \
locale-mate-menu-id \
locale-mate-menu-is \
locale-mate-menu-it \
locale-mate-menu-ja \
locale-mate-menu-ka \
locale-mate-menu-kk \
locale-mate-menu-km \
locale-mate-menu-kn \
locale-mate-menu-ko \
locale-mate-menu-lt \
locale-mate-menu-lv \
locale-mate-menu-mai \
locale-mate-menu-mk \
locale-mate-menu-ml \
locale-mate-menu-mr \
locale-mate-menu-ms \
locale-mate-menu-nb \
locale-mate-menu-nds \
locale-mate-menu-ne \
locale-mate-menu-nl \
locale-mate-menu-nn \
locale-mate-menu-oc \
locale-mate-menu-or \
locale-mate-menu-pa \
locale-mate-menu-pl \
locale-mate-menu-pl-PL \
locale-mate-menu-pt \
locale-mate-menu-pt-BR \
locale-mate-menu-ro \
locale-mate-menu-ru \
locale-mate-menu-ru-RU \
locale-mate-menu-si \
locale-mate-menu-sk \
locale-mate-menu-sl \
locale-mate-menu-sq \
locale-mate-menu-sr \
locale-mate-menu-sr@latin \
locale-mate-menu-sv \
locale-mate-menu-ta \
locale-mate-menu-te \
locale-mate-menu-th \
locale-mate-menu-tr \
locale-mate-menu-ug \
locale-mate-menu-uk \
locale-mate-menu-uk-UA \
locale-mate-menu-vi \
locale-mate-menu-wa \
locale-mate-menu-zh-CN \
locale-mate-menu-zh-HK \
locale-mate-menu-zh-TW \
mate-menu-lang \
mate-menu-lang-all"

RDEPENDS:${PN} += "mate-menu"

inherit rpm
