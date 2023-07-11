SUMMARY = "Translations for package mtpaint"
DESCRIPTION = "Provides translations for the 'mtpaint' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.50"

RPM_NAME = "mtpaint-lang-3.50-1.11.noarch.rpm"
RPM_HASH = "768ad27f4e35bf5d8342c87261caca9d71013783a2d7f301bda0d3ed9dd4ff067b798e743fe62f37ac8712bbd9d22e011de85993c6750eb17773db75bbae9066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mtpaint-cs \
locale-mtpaint-de \
locale-mtpaint-es \
locale-mtpaint-fr \
locale-mtpaint-gl \
locale-mtpaint-hu \
locale-mtpaint-it \
locale-mtpaint-ja \
locale-mtpaint-nl \
locale-mtpaint-pl \
locale-mtpaint-pt \
locale-mtpaint-pt-BR \
locale-mtpaint-ru \
locale-mtpaint-sk \
locale-mtpaint-sv \
locale-mtpaint-tr \
locale-mtpaint-zh-CN \
locale-mtpaint-zh-TW \
mtpaint-lang \
mtpaint-lang-all"

RDEPENDS:${PN} += "mtpaint"

inherit rpm
