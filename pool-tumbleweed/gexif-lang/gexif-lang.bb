SUMMARY = "Translations for package gexif"
DESCRIPTION = "Provides translations for the 'gexif' package."
LICENSE = "LGPL-2.1+"

PV = "0.5"

RPM_NAME = "gexif-lang-0.5-204.31.noarch.rpm"
RPM_HASH = "58002562e0f3b2a301cc83b8c77bc9b130a070433b0cb6b6978f3a65bf60a079f8c1c40900435328408b016f9c15eccbe71910dd8a532dacc1540881de023c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gexif-lang \
gexif-lang-all \
locale-gexif-de \
locale-gexif-es \
locale-gexif-fr"

RDEPENDS:${PN} += "gexif"

inherit rpm
