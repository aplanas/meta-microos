SUMMARY = "Translations for package keysmith"
DESCRIPTION = "Provides translations for the 'keysmith' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "keysmith-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "574358c31e1de1f2056c2d30986d332fc6f1aa1ef99a0461a1ee1f540e01f1dd687b4f3af10e5b8c7b43cf99a3bbfd3351d5ad5676d2753e8bac977c31d4d3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "keysmith-lang \
keysmith-lang-all \
locale-keysmith-ca \
locale-keysmith-ca@valencia \
locale-keysmith-cs \
locale-keysmith-de \
locale-keysmith-en-GB \
locale-keysmith-es \
locale-keysmith-et \
locale-keysmith-eu \
locale-keysmith-fi \
locale-keysmith-fr \
locale-keysmith-gl \
locale-keysmith-hu \
locale-keysmith-ia \
locale-keysmith-it \
locale-keysmith-ja \
locale-keysmith-ka \
locale-keysmith-ko \
locale-keysmith-lt \
locale-keysmith-nl \
locale-keysmith-nn \
locale-keysmith-pa \
locale-keysmith-pl \
locale-keysmith-pt \
locale-keysmith-pt-BR \
locale-keysmith-ro \
locale-keysmith-ru \
locale-keysmith-sk \
locale-keysmith-sl \
locale-keysmith-sv \
locale-keysmith-tr \
locale-keysmith-uk \
locale-keysmith-zh-CN \
locale-keysmith-zh-TW"

RDEPENDS:${PN} += "keysmith"

inherit rpm
