SUMMARY = "Translations for package dfc"
DESCRIPTION = "Provides translations for the 'dfc' package."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-lang-3.1.1-2.12.noarch.rpm"
RPM_HASH = "f686569d6fbda38b65494157235e16e6d834a4597b49303bbe7319e33da62ae38d61f7bb38320a2c9a003ee1d103af612a310d7ab95a172bea7dff43c275bd4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(dfc-lang) \
dfc-lang \
dfc-lang-all \
locale(dfc:fr) \
locale(dfc:nl)"

RDEPENDS:${PN} += "dfc"

inherit rpm
