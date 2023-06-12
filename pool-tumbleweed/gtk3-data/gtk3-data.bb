SUMMARY = "Data files for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-data-3.24.38-1.1.noarch.rpm"
RPM_HASH = "d3dec6241f6e0c15537ba0d5938d7ddb72bf9bbd1017a40d5e6ac8ae021255b48d69e14b2152fc6faa6ce3e965359eb68042d610e6eb950453152177a8d56dce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-data"
RDEPENDS:${PN} += ""

inherit rpm
