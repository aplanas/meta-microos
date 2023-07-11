SUMMARY = "Data files for the GTK+ toolkit library v2"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.33"

RPM_NAME = "gtk2-data-2.24.33-4.4.noarch.rpm"
RPM_HASH = "895dd3f42933348758bf8452d79fa1c6bd10dc767ace458766780996f1807448a17cc78a1b549284b28d018a59172e3d389c8bd465d0daa508b3048f9fb4014c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-data"

RDEPENDS:${PN} += ""

inherit rpm
