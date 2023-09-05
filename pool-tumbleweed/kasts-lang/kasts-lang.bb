SUMMARY = "Translations for package kasts"
DESCRIPTION = "Provides translations for the 'kasts' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kasts-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "0146b43284f804db8c3895a16a10430c26f9ddfd88f0032163c526db184e3a55bcac7d74acd5240941cf474954b0c2f33ed5e86c05b595d4d58e0c07fcd2bafd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kasts-lang \
kasts-lang-all \
locale-kasts-ca \
locale-kasts-ca@valencia \
locale-kasts-cs \
locale-kasts-de \
locale-kasts-en-GB \
locale-kasts-es \
locale-kasts-eu \
locale-kasts-fi \
locale-kasts-fr \
locale-kasts-it \
locale-kasts-ja \
locale-kasts-ka \
locale-kasts-ko \
locale-kasts-lt \
locale-kasts-nl \
locale-kasts-pa \
locale-kasts-pl \
locale-kasts-pt \
locale-kasts-pt-BR \
locale-kasts-sk \
locale-kasts-sl \
locale-kasts-sv \
locale-kasts-tr \
locale-kasts-uk \
locale-kasts-zh-CN \
locale-kasts-zh-TW"

RDEPENDS:${PN} += "kasts"

inherit rpm
