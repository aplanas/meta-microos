SUMMARY = "Documentation files for the gnome-builder package"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-doc-44.1-1.3.noarch.rpm"
RPM_HASH = "3b736f306989c97ceec368e3f432c4a7b5763216cbd2983945e554d943662d15fe60f18d4ea60be4c88de94e2934cfdb610d03e20fc194dec5b9eb8a05c6653d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-doc"

RDEPENDS:${PN} += "gnome-builder"

inherit rpm
