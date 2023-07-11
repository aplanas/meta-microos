SUMMARY = "Translations for package kcm_flatpak"
DESCRIPTION = "Provides translations for the 'kcm_flatpak' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kcm_flatpak-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "8e1c0e165c609fa2d8ee4943dd0ffc78864a2c524e26258c7341b3a0dfbd03491707f24e83e90902146123e05042dfe70eca2e1362a9cf66a70a03a74d184540"
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
