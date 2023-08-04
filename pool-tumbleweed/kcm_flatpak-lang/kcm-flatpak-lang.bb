SUMMARY = "Translations for package kcm_flatpak"
DESCRIPTION = "Provides translations for the 'kcm_flatpak' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kcm_flatpak-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "9a411980f70cba20cc78839817f3d8aed49f55abb23d5a4c68febd99780337cd160e6c1b480926a41df49fd6b977ba13d7cbfaf45c79437a99c44133efedbed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm-flatpak-lang \
kcm-flatpak-lang-all \
locale-kcm-flatpak-ar \
locale-kcm-flatpak-ca \
locale-kcm-flatpak-ca@valencia \
locale-kcm-flatpak-cs \
locale-kcm-flatpak-de \
locale-kcm-flatpak-en-GB \
locale-kcm-flatpak-es \
locale-kcm-flatpak-eu \
locale-kcm-flatpak-fi \
locale-kcm-flatpak-fr \
locale-kcm-flatpak-gl \
locale-kcm-flatpak-id \
locale-kcm-flatpak-it \
locale-kcm-flatpak-ja \
locale-kcm-flatpak-ka \
locale-kcm-flatpak-ko \
locale-kcm-flatpak-nl \
locale-kcm-flatpak-nn \
locale-kcm-flatpak-pl \
locale-kcm-flatpak-pt \
locale-kcm-flatpak-pt-BR \
locale-kcm-flatpak-ru \
locale-kcm-flatpak-sk \
locale-kcm-flatpak-sl \
locale-kcm-flatpak-tr \
locale-kcm-flatpak-uk \
locale-kcm-flatpak-zh-CN \
locale-kcm-flatpak-zh-TW"

RDEPENDS:${PN} += "kcm-flatpak"

inherit rpm
