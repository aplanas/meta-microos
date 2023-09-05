SUMMARY = "Translations for package kbackup"
DESCRIPTION = "Provides translations for the 'kbackup' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kbackup-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "33abd187979cd16f8af7d12ab491d50a0e07c61ac97c476dc5b56ac3341777af3c3adbdcb48202f585a476a4881ba24a88506c53be7e1073619805dfcb1dd65e"
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
