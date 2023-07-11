SUMMARY = "Translations for package m17n-db"
DESCRIPTION = "Provides translations for the 'm17n-db' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain & MIT"

PV = "1.8.2"

RPM_NAME = "m17n-db-lang-1.8.2-1.1.noarch.rpm"
RPM_HASH = "1ef22502869290a21d97680d6d30e62a79dd96c18956128d311f143e4519fb2b0c0b729fd2dc0c8745316869355ed436d598de0e438d6cbf1be5d36159950081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-m17n-db-de \
locale-m17n-db-eo \
locale-m17n-db-ja \
locale-m17n-db-vi \
m17n-db-lang \
m17n-db-lang-all"

RDEPENDS:${PN} += "m17n-db"

inherit rpm
