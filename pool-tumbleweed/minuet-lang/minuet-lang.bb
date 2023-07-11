SUMMARY = "Translations for package minuet"
DESCRIPTION = "Provides translations for the 'minuet' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "minuet-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "b7861db1b04313a3b0bcdacf0d4cdbad02ee3c85f5fcaf5623d425f8b0c8a09a020170af142d644f79bda75ed1a3678b1c6172f740361a41e86cd72fe9f4819e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-minuet-ar \
locale-minuet-ca \
locale-minuet-ca@valencia \
locale-minuet-cs \
locale-minuet-da \
locale-minuet-de \
locale-minuet-en-GB \
locale-minuet-es \
locale-minuet-et \
locale-minuet-fi \
locale-minuet-fr \
locale-minuet-gl \
locale-minuet-it \
locale-minuet-ja \
locale-minuet-ka \
locale-minuet-ko \
locale-minuet-lt \
locale-minuet-ml \
locale-minuet-nl \
locale-minuet-nn \
locale-minuet-pl \
locale-minuet-pt \
locale-minuet-pt-BR \
locale-minuet-ru \
locale-minuet-sk \
locale-minuet-sl \
locale-minuet-sv \
locale-minuet-tr \
locale-minuet-uk \
locale-minuet-zh-CN \
locale-minuet-zh-TW \
minuet-lang \
minuet-lang-all"

RDEPENDS:${PN} += "minuet"

inherit rpm
