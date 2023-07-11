SUMMARY = "Translations for package kicad"
DESCRIPTION = "Provides translations for the 'kicad' package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-lang-7.0.5-1.2.noarch.rpm"
RPM_HASH = "a172f4a4d6a01294f3ab9dbe684aadc7da57ceaad0163c2021d525f3a8d24d1e9140083db16d4294aa9edf6b96ee5001c0f597d7c2584a527ee642b6a55c77cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-lang \
kicad-lang-all \
locale-kicad-cs \
locale-kicad-da \
locale-kicad-de \
locale-kicad-el \
locale-kicad-en \
locale-kicad-es \
locale-kicad-es-MX \
locale-kicad-fi \
locale-kicad-fr \
locale-kicad-it \
locale-kicad-ja \
locale-kicad-ko \
locale-kicad-lt \
locale-kicad-nl \
locale-kicad-pl \
locale-kicad-pt \
locale-kicad-ru \
locale-kicad-sv \
locale-kicad-th \
locale-kicad-uk \
locale-kicad-zh-CN \
locale-kicad-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
