SUMMARY = "Translations for package gdbm"
DESCRIPTION = "Provides translations for the 'gdbm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "gdbm-lang-1.23-2.1.noarch.rpm"
RPM_HASH = "8529b606a187dda693b9a6ab3b19328d86a4689e5c85bed751213b1b37f30f0bc3845dd4ab2943bec6fafafe6de66a9a4b5bc30d6078aba5833e3766746ace8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdbm-lang \
gdbm-lang-all \
locale-gdbm-da \
locale-gdbm-de \
locale-gdbm-eo \
locale-gdbm-es \
locale-gdbm-fi \
locale-gdbm-fr \
locale-gdbm-ja \
locale-gdbm-pl \
locale-gdbm-pt-BR \
locale-gdbm-ru \
locale-gdbm-sr \
locale-gdbm-sv \
locale-gdbm-uk \
locale-gdbm-vi"

RDEPENDS:${PN} += "gdbm"

inherit rpm
