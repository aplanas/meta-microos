SUMMARY = "Translations for package kicad"
DESCRIPTION = "Provides translations for the 'kicad' package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-lang-7.0.6-1.1.noarch.rpm"
RPM_HASH = "cf6545ed38bdcc35b4bcd49dc6c0d8e216388b0de803381718ed31417f6bcb211e78e1a25e6fb55539f52aa687a7cdfb3d84da17a201c9e902ce2b920092c919"
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
