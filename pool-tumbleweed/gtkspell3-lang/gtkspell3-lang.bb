SUMMARY = "Translations for package gtkspell3"
DESCRIPTION = "Provides translations for the 'gtkspell3' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "gtkspell3-lang-3.0.10-3.9.noarch.rpm"
RPM_HASH = "7b79679a5bb48c53b84c878490ecdcb0e1325099f59ae06a9d29fe2328f84243872c169fafdb96b9ab562b3fa1ff2a2f4e434ccf973152db8528c492be8d2d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkspell3-lang \
gtkspell3-lang-all \
locale-gtkspell3-af \
locale-gtkspell3-ast \
locale-gtkspell3-be \
locale-gtkspell3-ca \
locale-gtkspell3-cs \
locale-gtkspell3-da \
locale-gtkspell3-de \
locale-gtkspell3-el \
locale-gtkspell3-eo \
locale-gtkspell3-es \
locale-gtkspell3-eu \
locale-gtkspell3-fi \
locale-gtkspell3-fr \
locale-gtkspell3-ga \
locale-gtkspell3-gl \
locale-gtkspell3-he \
locale-gtkspell3-hr \
locale-gtkspell3-hu \
locale-gtkspell3-id \
locale-gtkspell3-is \
locale-gtkspell3-it \
locale-gtkspell3-ja \
locale-gtkspell3-lt \
locale-gtkspell3-lv \
locale-gtkspell3-ms \
locale-gtkspell3-nb \
locale-gtkspell3-nl \
locale-gtkspell3-pl \
locale-gtkspell3-pt \
locale-gtkspell3-pt-BR \
locale-gtkspell3-ro \
locale-gtkspell3-ru \
locale-gtkspell3-sk \
locale-gtkspell3-sl \
locale-gtkspell3-sq \
locale-gtkspell3-sr \
locale-gtkspell3-sv \
locale-gtkspell3-th \
locale-gtkspell3-tr \
locale-gtkspell3-uk \
locale-gtkspell3-vi \
locale-gtkspell3-wa \
locale-gtkspell3-zh-CN \
locale-gtkspell3-zh-HK \
locale-gtkspell3-zh-TW"

RDEPENDS:${PN} += "gtkspell3"

inherit rpm
