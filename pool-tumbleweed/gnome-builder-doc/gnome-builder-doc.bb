SUMMARY = "Documentation files for the gnome-builder package"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-doc-44.1-1.4.noarch.rpm"
RPM_HASH = "2e0951e94155a5407f1ce8f063a95e398881732ddd88501aceff0e28cb1a70b1d4c9d5778170079f265c0e13fdf6e82f0070e192465f119b29ec4dcbb1b2a1cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-doc"

RDEPENDS:${PN} += "gnome-builder"

inherit rpm
