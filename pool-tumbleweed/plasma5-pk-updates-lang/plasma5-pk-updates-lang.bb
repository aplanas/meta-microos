SUMMARY = "Translations for package plasma5-pk-updates"
DESCRIPTION = "Provides translations for the 'plasma5-pk-updates' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2+git70"

RPM_NAME = "plasma5-pk-updates-lang-0.3.2+git70-2.7.noarch.rpm"
RPM_HASH = "804f66c4f6ab0c75d1ff64309cac8a5c01290f41907481e98ec7d3631b4e5cfa2c3a3a843aead6fa09ce4e3fb5b5e070755868f4df4f2098a1f634044b23b406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-pk-updates-ast \
locale-plasma5-pk-updates-ca \
locale-plasma5-pk-updates-ca@valencia \
locale-plasma5-pk-updates-cs \
locale-plasma5-pk-updates-da \
locale-plasma5-pk-updates-de \
locale-plasma5-pk-updates-en-GB \
locale-plasma5-pk-updates-es \
locale-plasma5-pk-updates-et \
locale-plasma5-pk-updates-eu \
locale-plasma5-pk-updates-fi \
locale-plasma5-pk-updates-fr \
locale-plasma5-pk-updates-gl \
locale-plasma5-pk-updates-he \
locale-plasma5-pk-updates-hu \
locale-plasma5-pk-updates-id \
locale-plasma5-pk-updates-it \
locale-plasma5-pk-updates-ja \
locale-plasma5-pk-updates-ko \
locale-plasma5-pk-updates-lt \
locale-plasma5-pk-updates-nl \
locale-plasma5-pk-updates-nn \
locale-plasma5-pk-updates-pa \
locale-plasma5-pk-updates-pl \
locale-plasma5-pk-updates-pt \
locale-plasma5-pk-updates-pt-BR \
locale-plasma5-pk-updates-ro \
locale-plasma5-pk-updates-ru \
locale-plasma5-pk-updates-sk \
locale-plasma5-pk-updates-sl \
locale-plasma5-pk-updates-sv \
locale-plasma5-pk-updates-tr \
locale-plasma5-pk-updates-uk \
locale-plasma5-pk-updates-zh-CN \
locale-plasma5-pk-updates-zh-TW \
plasma5-pk-updates-lang \
plasma5-pk-updates-lang-all"

RDEPENDS:${PN} += "plasma5-pk-updates"

inherit rpm
