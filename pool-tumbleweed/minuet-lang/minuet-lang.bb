SUMMARY = "Translations for package minuet"
DESCRIPTION = "Provides translations for the 'minuet' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "minuet-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "d0bbea9e4b52c8178efa526bf7a928433536fba539d6fcb319111823470deb57e400071ff0ff87cee3f3db6fb9b898a07061ca74c4b756eec8fba430b07cd59e"
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
