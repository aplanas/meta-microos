SUMMARY = "Translations for package nextcloud-desktop"
DESCRIPTION = "Provides translations for the 'nextcloud-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nextcloud-desktop-lang-3.9.3-1.1.noarch.rpm"
RPM_HASH = "fee5a2b30682fd859d68bc45a08b481c98fa04ac8bfad73e44da71ae1750c7313d82511e44afd6929e6defbfa22e6cebcefc7de77c60f9289e2c923ff0e2cf39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-desktop-lang \
nextcloud-desktop-lang-all"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm
