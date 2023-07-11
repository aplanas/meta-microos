SUMMARY = "Translations for package upower"
DESCRIPTION = "Provides translations for the 'upower' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.90.1"

RPM_NAME = "upower-lang-1.90.1-1.1.noarch.rpm"
RPM_HASH = "fb6438784d6fd439648874c64ec89feb28f90d09b874a9c5ebb8fd046fbae46c2ee8eda5c9238106af9d5c093d28848a344a0061ad0a186cbb9f947084f2d765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-upower-fr \
locale-upower-it \
locale-upower-pl \
locale-upower-sv \
upower-lang \
upower-lang-all"

RDEPENDS:${PN} += "upower"

inherit rpm
