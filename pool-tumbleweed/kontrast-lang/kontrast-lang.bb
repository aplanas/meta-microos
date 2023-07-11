SUMMARY = "Translations for package kontrast"
DESCRIPTION = "Provides translations for the 'kontrast' package."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "kontrast-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "e4023e6e33eb4d34e652cf47666dbd09a52837341102f7307f56156ae0fc6739da63ab0982dc240f6c203e1e4a2f3f721f3f7903387910b15291816d2058faa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kontrast-lang \
kontrast-lang-all \
locale-kontrast-ca \
locale-kontrast-ca@valencia \
locale-kontrast-cs \
locale-kontrast-da \
locale-kontrast-de \
locale-kontrast-el \
locale-kontrast-en-GB \
locale-kontrast-es \
locale-kontrast-eu \
locale-kontrast-fi \
locale-kontrast-fr \
locale-kontrast-gl \
locale-kontrast-it \
locale-kontrast-ja \
locale-kontrast-ka \
locale-kontrast-ko \
locale-kontrast-lt \
locale-kontrast-nl \
locale-kontrast-nn \
locale-kontrast-pa \
locale-kontrast-pl \
locale-kontrast-pt \
locale-kontrast-pt-BR \
locale-kontrast-ru \
locale-kontrast-sk \
locale-kontrast-sl \
locale-kontrast-sv \
locale-kontrast-tr \
locale-kontrast-uk \
locale-kontrast-zh-CN \
locale-kontrast-zh-TW"

RDEPENDS:${PN} += "kontrast"

inherit rpm
