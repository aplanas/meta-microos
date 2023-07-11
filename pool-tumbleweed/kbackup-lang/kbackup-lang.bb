SUMMARY = "Translations for package kbackup"
DESCRIPTION = "Provides translations for the 'kbackup' package."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kbackup-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "0184f08c065138c66df4c8db784afa7f99fe343b85c67fe21848456fd67106518e093979ccc2df8648ed6cabeaefdb407f4eaf77eff7fc95b2392aa6caeee17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbackup-lang \
kbackup-lang-all \
locale-kbackup-ar \
locale-kbackup-ca \
locale-kbackup-ca@valencia \
locale-kbackup-cs \
locale-kbackup-da \
locale-kbackup-de \
locale-kbackup-el \
locale-kbackup-en-GB \
locale-kbackup-es \
locale-kbackup-et \
locale-kbackup-eu \
locale-kbackup-fi \
locale-kbackup-fr \
locale-kbackup-gl \
locale-kbackup-ia \
locale-kbackup-it \
locale-kbackup-ja \
locale-kbackup-ka \
locale-kbackup-ko \
locale-kbackup-lt \
locale-kbackup-nl \
locale-kbackup-nn \
locale-kbackup-pl \
locale-kbackup-pt \
locale-kbackup-pt-BR \
locale-kbackup-ru \
locale-kbackup-sk \
locale-kbackup-sl \
locale-kbackup-sv \
locale-kbackup-tr \
locale-kbackup-uk \
locale-kbackup-zh-CN \
locale-kbackup-zh-TW"

RDEPENDS:${PN} += "kbackup"

inherit rpm
