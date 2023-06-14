SUMMARY = "Translations for package kcm_flatpak"
DESCRIPTION = "Provides translations for the 'kcm_flatpak' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kcm_flatpak-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "f468fe6acf6abbb07efef500020434c64a20466c558793b330b0eb8b8c287f48ec444cbc0bb9a88eabef779c27e2643a13f6f14c7e56a88028fb91c86afcea2e"
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
