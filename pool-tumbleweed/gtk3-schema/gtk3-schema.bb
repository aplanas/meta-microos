SUMMARY = "Config schema for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-schema-3.24.38-1.1.noarch.rpm"
RPM_HASH = "9b472796a464338db9318b99df4a0dce85b3a5655059aa6dfc206f759e0061538ad8c2043a4fb5497a8c5cd6bb0d4aa6e43f37f6c0402ceae9a6520fc21ef9f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-schema"

RDEPENDS:${PN} += ""

inherit rpm
