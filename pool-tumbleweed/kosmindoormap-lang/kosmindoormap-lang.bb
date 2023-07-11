SUMMARY = "Translations for package kosmindoormap"
DESCRIPTION = "Provides translations for the 'kosmindoormap' package."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "kosmindoormap-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "96b0b61656a8dde1f4a9e165c3b412641c82d579969856546ba1caf343b0f16113a24e4b29509d4625a645150c01d60f6f5b68d6f47a61227099b1ee7e96eeb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kosmindoormap-lang \
kosmindoormap-lang-all \
locale-kosmindoormap-ca \
locale-kosmindoormap-ca@valencia \
locale-kosmindoormap-cs \
locale-kosmindoormap-de \
locale-kosmindoormap-en-GB \
locale-kosmindoormap-es \
locale-kosmindoormap-fi \
locale-kosmindoormap-fr \
locale-kosmindoormap-it \
locale-kosmindoormap-ja \
locale-kosmindoormap-ka \
locale-kosmindoormap-ko \
locale-kosmindoormap-lt \
locale-kosmindoormap-nl \
locale-kosmindoormap-pl \
locale-kosmindoormap-pt \
locale-kosmindoormap-pt-BR \
locale-kosmindoormap-ru \
locale-kosmindoormap-sk \
locale-kosmindoormap-sl \
locale-kosmindoormap-sv \
locale-kosmindoormap-tr \
locale-kosmindoormap-uk \
locale-kosmindoormap-zh-CN \
locale-kosmindoormap-zh-TW"

RDEPENDS:${PN} += "kosmindoormap"

inherit rpm
