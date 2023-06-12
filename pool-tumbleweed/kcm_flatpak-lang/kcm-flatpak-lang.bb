SUMMARY = "Translations for package kcm_flatpak"
DESCRIPTION = "Provides translations for the 'kcm_flatpak' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kcm_flatpak-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "f468fe6acf6abbb07efef500020434c64a20466c558793b330b0eb8b8c287f48ec444cbc0bb9a88eabef779c27e2643a13f6f14c7e56a88028fb91c86afcea2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm_flatpak-lang \
kcm_flatpak-lang-all \
locale(kcm_flatpak:ar) \
locale(kcm_flatpak:ca) \
locale(kcm_flatpak:ca@valencia) \
locale(kcm_flatpak:cs) \
locale(kcm_flatpak:de) \
locale(kcm_flatpak:en_GB) \
locale(kcm_flatpak:es) \
locale(kcm_flatpak:eu) \
locale(kcm_flatpak:fi) \
locale(kcm_flatpak:fr) \
locale(kcm_flatpak:it) \
locale(kcm_flatpak:ja) \
locale(kcm_flatpak:ka) \
locale(kcm_flatpak:ko) \
locale(kcm_flatpak:nl) \
locale(kcm_flatpak:nn) \
locale(kcm_flatpak:pl) \
locale(kcm_flatpak:pt) \
locale(kcm_flatpak:pt_BR) \
locale(kcm_flatpak:ru) \
locale(kcm_flatpak:sk) \
locale(kcm_flatpak:sl) \
locale(kcm_flatpak:tr) \
locale(kcm_flatpak:uk) \
locale(kcm_flatpak:zh_CN) \
locale(kcm_flatpak:zh_TW)"
RDEPENDS:${PN} += "kcm_flatpak"

inherit rpm
