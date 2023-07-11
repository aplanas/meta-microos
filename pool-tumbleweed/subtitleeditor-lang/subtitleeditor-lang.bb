SUMMARY = "Translations for package subtitleeditor"
DESCRIPTION = "Provides translations for the 'subtitleeditor' package."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "subtitleeditor-lang-0.54.0-4.17.noarch.rpm"
RPM_HASH = "c613a0ee874c53561febbd365eeabf7b9953fe9525c47b6e5e1ae3bdfde87827cf8d2f0d72bd9d799e574064b9a065a06044304e4d509dfbcdf7b240f952ef3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subtitleeditor-bg \
locale-subtitleeditor-ca \
locale-subtitleeditor-cs \
locale-subtitleeditor-da \
locale-subtitleeditor-de \
locale-subtitleeditor-el \
locale-subtitleeditor-en-GB \
locale-subtitleeditor-eo \
locale-subtitleeditor-es \
locale-subtitleeditor-fr \
locale-subtitleeditor-gl \
locale-subtitleeditor-hu \
locale-subtitleeditor-it \
locale-subtitleeditor-lt \
locale-subtitleeditor-nl \
locale-subtitleeditor-pl \
locale-subtitleeditor-pt \
locale-subtitleeditor-pt-BR \
locale-subtitleeditor-pt-PT \
locale-subtitleeditor-ru \
locale-subtitleeditor-sr \
locale-subtitleeditor-tr \
locale-subtitleeditor-zh-CN \
locale-subtitleeditor-zh-TW \
subtitleeditor-lang \
subtitleeditor-lang-all"

RDEPENDS:${PN} += "subtitleeditor"

inherit rpm
