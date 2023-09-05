SUMMARY = "Translations for package kosmindoormap"
DESCRIPTION = "Provides translations for the 'kosmindoormap' package."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "kosmindoormap-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "1b2170378a7a10163f5f34622d7d03db7356424a720843e583165aea1cc15407b556eb7ba0beac3946880d5773494cea7a4616b4f097b979fa9cddf590e63bd1"
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
