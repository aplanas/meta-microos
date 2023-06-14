SUMMARY = "Translations for package kdb"
DESCRIPTION = "Provides translations for the 'kdb' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-lang-3.2.0-7.17.noarch.rpm"
RPM_HASH = "2187b244aff528a25cacd95fdc2220e215ba94b6a09c611914d26280838d060399fa0def41b1376ea590134cac931dc681149554c84ba8ee949b825325cca1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdb-lang \
kdb-lang-all \
locale-kdb-ast \
locale-kdb-ca \
locale-kdb-ca@valencia \
locale-kdb-cs \
locale-kdb-de \
locale-kdb-en \
locale-kdb-en-GB \
locale-kdb-es \
locale-kdb-fi \
locale-kdb-fr \
locale-kdb-gl \
locale-kdb-hu \
locale-kdb-ia \
locale-kdb-it \
locale-kdb-ja \
locale-kdb-ko \
locale-kdb-lt \
locale-kdb-nl \
locale-kdb-nn \
locale-kdb-pl \
locale-kdb-pt \
locale-kdb-pt-BR \
locale-kdb-ru \
locale-kdb-sk \
locale-kdb-sv \
locale-kdb-tr \
locale-kdb-uk \
locale-kdb-zh-CN \
locale-kdb-zh-TW"

RDEPENDS:${PN} += "kdb"

inherit rpm
