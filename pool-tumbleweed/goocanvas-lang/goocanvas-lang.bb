SUMMARY = "Translations for package goocanvas"
DESCRIPTION = "Provides translations for the 'goocanvas' package."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-lang-3.0.0-2.10.noarch.rpm"
RPM_HASH = "7001f61565331d09c32235c705dfc24f71cac295989554f638f6cdc0f84653a549806b4b5f82a95738a6f211489557cf1266d651e4e471c4ac816d84775d6b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas-lang \
goocanvas-lang-all \
locale-goocanvas-cs \
locale-goocanvas-de \
locale-goocanvas-el \
locale-goocanvas-en-GB \
locale-goocanvas-es \
locale-goocanvas-eu \
locale-goocanvas-hu \
locale-goocanvas-id \
locale-goocanvas-ja \
locale-goocanvas-pl \
locale-goocanvas-pt-BR \
locale-goocanvas-sr \
locale-goocanvas-sv"

RDEPENDS:${PN} += "goocanvas"

inherit rpm
