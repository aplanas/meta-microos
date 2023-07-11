SUMMARY = "Translations for package mate-applets"
DESCRIPTION = "Provides translations for the 'mate-applets' package."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-applets-lang-1.26.1-1.5.noarch.rpm"
RPM_HASH = "0ee3f80e80e12f9fbd665fb7b559f3b112037733e8c47dda8f03b9a45863dc934413de9c59cfefd1aa19b7a9ca34a6bc0b933fe61d6a5f30757bb281a61902cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-applets-af \
locale-mate-applets-ar \
locale-mate-applets-as \
locale-mate-applets-ast \
locale-mate-applets-az \
locale-mate-applets-be \
locale-mate-applets-bg \
locale-mate-applets-bn \
locale-mate-applets-bn-IN \
locale-mate-applets-br \
locale-mate-applets-bs \
locale-mate-applets-ca \
locale-mate-applets-ca@valencia \
locale-mate-applets-cs \
locale-mate-applets-cy \
locale-mate-applets-da \
locale-mate-applets-de \
locale-mate-applets-dz \
locale-mate-applets-el \
locale-mate-applets-en-AU \
locale-mate-applets-en-CA \
locale-mate-applets-en-GB \
locale-mate-applets-eo \
locale-mate-applets-es \
locale-mate-applets-es-AR \
locale-mate-applets-es-CL \
locale-mate-applets-es-CO \
locale-mate-applets-es-CR \
locale-mate-applets-es-DO \
locale-mate-applets-es-EC \
locale-mate-applets-es-ES \
locale-mate-applets-es-MX \
locale-mate-applets-es-NI \
locale-mate-applets-es-PA \
locale-mate-applets-es-PE \
locale-mate-applets-es-PR \
locale-mate-applets-es-SV \
locale-mate-applets-es-UY \
locale-mate-applets-es-VE \
locale-mate-applets-et \
locale-mate-applets-eu \
locale-mate-applets-fa \
locale-mate-applets-fi \
locale-mate-applets-fr \
locale-mate-applets-fr-CA \
locale-mate-applets-fur \
locale-mate-applets-ga \
locale-mate-applets-gl \
locale-mate-applets-gu \
locale-mate-applets-he \
locale-mate-applets-hi \
locale-mate-applets-hr \
locale-mate-applets-hu \
locale-mate-applets-id \
locale-mate-applets-is \
locale-mate-applets-it \
locale-mate-applets-ja \
locale-mate-applets-ka \
locale-mate-applets-kk \
locale-mate-applets-km \
locale-mate-applets-kn \
locale-mate-applets-ko \
locale-mate-applets-lt \
locale-mate-applets-lv \
locale-mate-applets-mai \
locale-mate-applets-mk \
locale-mate-applets-ml \
locale-mate-applets-mr \
locale-mate-applets-ms \
locale-mate-applets-nb \
locale-mate-applets-nds \
locale-mate-applets-ne \
locale-mate-applets-nl \
locale-mate-applets-nn \
locale-mate-applets-oc \
locale-mate-applets-or \
locale-mate-applets-pa \
locale-mate-applets-pl \
locale-mate-applets-pt \
locale-mate-applets-pt-BR \
locale-mate-applets-ro \
locale-mate-applets-ru \
locale-mate-applets-si \
locale-mate-applets-sk \
locale-mate-applets-sl \
locale-mate-applets-sq \
locale-mate-applets-sr \
locale-mate-applets-sr@latin \
locale-mate-applets-sv \
locale-mate-applets-ta \
locale-mate-applets-te \
locale-mate-applets-th \
locale-mate-applets-tr \
locale-mate-applets-ug \
locale-mate-applets-uk \
locale-mate-applets-vi \
locale-mate-applets-wa \
locale-mate-applets-zh-CN \
locale-mate-applets-zh-HK \
locale-mate-applets-zh-TW \
mate-applets-lang \
mate-applets-lang-all"

RDEPENDS:${PN} += "mate-applets"

inherit rpm
