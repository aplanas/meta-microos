SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kded-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "b5dc95f99b0949a50802453c2f930588fa4ad3346477c728dcf60619d0a71e25ad61b02d66313b0754d837cfeb21366c4b7bd1d9199f65b22d67e0af5767ecf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang \
kded-lang-all"

RDEPENDS:${PN} += "kded"

inherit rpm
