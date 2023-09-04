SUMMARY = "Config schema for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gtk4-schema-4.12.0-2.1.noarch.rpm"
RPM_HASH = "be8881a76852c451292d0f7aeb61df8fc6830c047779fc1c62db39b2145a740a0944126423ff3005ac7ab80a1a1ff0dfd7e14e3a4139febaec0fa6adf50209bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-schema"

RDEPENDS:${PN} += ""

inherit rpm
