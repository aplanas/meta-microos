SUMMARY = "Data files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-data-3.24.38-2.1.noarch.rpm"
RPM_HASH = "6e4c5e5cc53dd4c1d3e4048f0615568fec74e87cbb81ad9a456a36d3deda51ca63c30f9466bad71f2b7c23f4d698a24c45e3c2561028e5733fabd4eaf6410dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-data"

RDEPENDS:${PN} += ""

inherit rpm
