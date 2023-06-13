SUMMARY = "Translations for package colord-gtk"
DESCRIPTION = "Provides translations for the 'colord-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-lang-0.3.0-1.4.noarch.rpm"
RPM_HASH = "6d933386f7c2de88573bb7786e4e1b6121934ce6a23893428e1280db23ed6fd612f5ec74fcd89d62c664fb6fad7bf3e009bd32927a7fb2aff21120a45a9766e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-lang \
colord-gtk-lang-all \
locale(colord-gtk:en_GB)"

RDEPENDS:${PN} += "colord-gtk"

inherit rpm
