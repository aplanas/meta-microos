SUMMARY = "Translations for package kasts"
DESCRIPTION = "Provides translations for the 'kasts' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kasts-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ce23bfa4422f7790d048fa68b22c67e080cb5146c88f584d565a762d82dab624e05b9d0813ee0ebaec3b23b713f61cb6b1707945fddffa02786e17a4ce938633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kasts-lang \
kasts-lang-all \
locale-kasts-ca \
locale-kasts-ca@valencia \
locale-kasts-cs \
locale-kasts-de \
locale-kasts-en-GB \
locale-kasts-es \
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
