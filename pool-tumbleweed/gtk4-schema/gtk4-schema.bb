SUMMARY = "Config schema for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.4"

RPM_NAME = "gtk4-schema-4.10.4-1.2.noarch.rpm"
RPM_HASH = "38d110e0b41882367a59aac5a4cee47e904502b9eeb5b3f626b4eb56b49f4dbff5c8b08f4a48f614b3678cd59cec7cd461efadd26202fe216428c949807fc317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-schema"

RDEPENDS:${PN} += ""

inherit rpm
