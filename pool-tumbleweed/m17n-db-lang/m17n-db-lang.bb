SUMMARY = "Translations for package m17n-db"
DESCRIPTION = "Provides translations for the 'm17n-db' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & SUSE-Public-Domain & MIT"

PV = "1.8.0"

RPM_NAME = "m17n-db-lang-1.8.0-1.8.noarch.rpm"
RPM_HASH = "74453062fe19836491005e948b9becd6d975e95d9b1297b66d2b4fe0e3178bbda562fcb58f498cc3da3b3ca12a8c5d87b2811c92fde648f94d9bd9fe55b14b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(m17n-db:de) \
locale(m17n-db:eo) \
locale(m17n-db:ja) \
locale(m17n-db:vi) \
m17n-db-lang \
m17n-db-lang-all"

RDEPENDS:${PN} += "m17n-db"

inherit rpm
