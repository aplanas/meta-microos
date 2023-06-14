SUMMARY = "Translations for package kosmindoormap"
DESCRIPTION = "Provides translations for the 'kosmindoormap' package."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kosmindoormap-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "223508c1c080e10076c3b298ee743e3ad44d3e7c6c8fdcd87857d262272bca40e3dc187fe645a645606bed19c7a87920a15433c12bb838871f65a8ac9401cb42"
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
