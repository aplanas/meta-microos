SUMMARY = "Developer documentation for libadwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the documentation for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libadwaita-docs-1.3.4-1.1.noarch.rpm"
RPM_HASH = "c9fef6996fe425b9b568f27ea83cac5be3a1545e6356ffd46998673c5d8f9c4351bd675eb058505ee95c7138d8bac8fa08296c957c4c7ec168e78aa257a118d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libadwaita-docs"

RDEPENDS:${PN} += ""

inherit rpm
