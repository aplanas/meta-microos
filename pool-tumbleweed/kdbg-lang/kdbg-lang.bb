SUMMARY = "Translations for package kdbg"
DESCRIPTION = "Provides translations for the 'kdbg' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdbg-lang-3.0.1-1.18.noarch.rpm"
RPM_HASH = "a43a4f622072eb6e868b4b387abccdd3130f85b7424f8b6a317a0d58df4be7e39691bb31b50fda038227447893b218d26d705487cd6c105f639084f998b094fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdbg-lang \
kdbg-lang-all \
locale-kdbg-cs \
locale-kdbg-da \
locale-kdbg-de \
locale-kdbg-es \
locale-kdbg-fr \
locale-kdbg-hr \
locale-kdbg-hu \
locale-kdbg-it \
locale-kdbg-ja \
locale-kdbg-nb \
locale-kdbg-nn \
locale-kdbg-pl \
locale-kdbg-pt \
locale-kdbg-ro \
locale-kdbg-ru \
locale-kdbg-sk \
locale-kdbg-sr \
locale-kdbg-sv \
locale-kdbg-tr \
locale-kdbg-zh-CN"

RDEPENDS:${PN} += "kdbg"

inherit rpm
