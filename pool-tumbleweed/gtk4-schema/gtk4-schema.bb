SUMMARY = "Config schema for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.3"

RPM_NAME = "gtk4-schema-4.10.3-4.1.noarch.rpm"
RPM_HASH = "cc632c3b40db850560451d88977860671870833dd4d1b7930a6e1e49ab4c58de239d5181121519f59c4a6d65875ca606779fb0185b6a3317669b826a23d2924e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-schema"

RDEPENDS:${PN} += ""

inherit rpm
