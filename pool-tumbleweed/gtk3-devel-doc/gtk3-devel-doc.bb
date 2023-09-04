SUMMARY = "API documentation for the GTK+ toolkit library v3"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the API documentation for GTK+ 3.x."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.38"

RPM_NAME = "gtk3-devel-doc-3.24.38-2.1.noarch.rpm"
RPM_HASH = "7f9ad680bec47db0ca73015fd3449d8777bd969ae14b3063c7bc0a1e1d7115078b7fd276f86734903a9254677f35da1af28a3b0154877948fba2dfcd1c08d859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
