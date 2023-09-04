SUMMARY = "Config schema for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-schema-3.24.38-2.1.noarch.rpm"
RPM_HASH = "057ccaf909c89258639f297295a0edf724047ac2401a681aa696955ae1d4c9a35f39b230dc0b61e55dc9c7d61a0b34bfa92481955b991c8d4ce554b182270ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-schema"

RDEPENDS:${PN} += ""

inherit rpm
