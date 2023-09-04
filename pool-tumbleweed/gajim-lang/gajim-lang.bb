SUMMARY = "Translations for package gajim"
DESCRIPTION = "Provides translations for the 'gajim' package."
LICENSE = "GPL-3.0-only"

PV = "1.8.1"

RPM_NAME = "gajim-lang-1.8.1-1.1.noarch.rpm"
RPM_HASH = "d1c94092f446fe9e985085cf3da1d435a82b29871a151091fddd285e968ae1dd4fbd874c62a261755cad3ceb39b32526587b6023e902c3d39dacb5f5e44d6315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim-lang \
gajim-lang-all \
locale-gajim-ar \
locale-gajim-be \
locale-gajim-be@latin \
locale-gajim-bg \
locale-gajim-br \
locale-gajim-ca \
locale-gajim-cs \
locale-gajim-da \
locale-gajim-de \
locale-gajim-el \
locale-gajim-en-GB \
locale-gajim-eo \
locale-gajim-es \
locale-gajim-eu \
locale-gajim-fr \
locale-gajim-gl \
locale-gajim-he \
locale-gajim-hr \
locale-gajim-hu \
locale-gajim-it \
locale-gajim-ja \
locale-gajim-kk \
locale-gajim-ko \
locale-gajim-lt \
locale-gajim-nb-NO \
locale-gajim-nl \
locale-gajim-pl \
locale-gajim-pt \
locale-gajim-pt-BR \
locale-gajim-ro \
locale-gajim-ru \
locale-gajim-sk \
locale-gajim-sr \
locale-gajim-sv \
locale-gajim-tr \
locale-gajim-uk \
locale-gajim-zh-CN \
locale-gajim-zh-TW"

RDEPENDS:${PN} += "gajim"

inherit rpm
