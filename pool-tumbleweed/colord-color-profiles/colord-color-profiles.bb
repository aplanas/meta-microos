SUMMARY = "Color profiles for colord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides color profiles previously provided by shared-color-profiles"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-color-profiles-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "a531ba35bd0c0a498edb8b9e87a2141eae6b3bda309a729d267bf4e7dcc18954879788fd8ab4c401fb3c6ae4225c4f7f4b31366724cc60e74559c1d0e0a2e964"

RPROVIDES:${PN} += "colord-color-profiles \
shared-color-profiles"

RDEPENDS:${PN} += ""

inherit rpm
