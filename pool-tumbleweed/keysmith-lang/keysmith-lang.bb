SUMMARY = "Translations for package keysmith"
DESCRIPTION = "Provides translations for the 'keysmith' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "keysmith-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "6a545d7c71fc2de4a0f3aa78e2db0b8a46a1c9b31ccd4aeb25fec1e2d5f046083a49015c98812a7d4e1f66ff09c62426bf846df0af6d5f39a1f031c228fd7ed2"
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
