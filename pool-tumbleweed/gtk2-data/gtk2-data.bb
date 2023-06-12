SUMMARY = "Data files for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-data-2.24.33-4.3.noarch.rpm"
RPM_HASH = "eb92a519f1b904941c005366a1e7f21590f26445993c2ea1fed4b2d818bd07630ef39929d7637749a6bc2ac501927ba11e829c875b3ad996f1e710364f3c3fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-data"
RDEPENDS:${PN} += ""

inherit rpm
