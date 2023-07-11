SUMMARY = "Translations for package goocanvas2"
DESCRIPTION = "Provides translations for the 'goocanvas2' package."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "goocanvas2-lang-2.0.4-2.10.noarch.rpm"
RPM_HASH = "f601f4856c4238c58f92f8e6da10d6c9be6d2d7da8ec4524c6223ba058e2236c0e80f220fb015368687794e2964d84df3789c42bec2ab5ecef8815b9a3410d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goocanvas2-lang \
goocanvas2-lang-all \
locale-goocanvas2-cs \
locale-goocanvas2-de \
locale-goocanvas2-en-GB \
locale-goocanvas2-es \
locale-goocanvas2-id \
locale-goocanvas2-ja \
locale-goocanvas2-pl \
locale-goocanvas2-pt-BR \
locale-goocanvas2-sr \
locale-goocanvas2-sv"

RDEPENDS:${PN} += "goocanvas2"

inherit rpm
