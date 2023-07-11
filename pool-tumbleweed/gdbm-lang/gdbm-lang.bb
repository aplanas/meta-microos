SUMMARY = "Translations for package gdbm"
DESCRIPTION = "Provides translations for the 'gdbm' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "gdbm-lang-1.23-1.14.noarch.rpm"
RPM_HASH = "d4932cf7e6fc782e4a62ad3c76b4c0bd4227de7e82c65ca33ffb0e5e335a597b906e8ea840abb51d32b72d760092e745f3c2f9fcdc7eb80731b308bead160b67"
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
