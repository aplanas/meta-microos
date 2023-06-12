SUMMARY = "Widget to show xkb layout"
DESCRIPTION = "Widget for displaying information about the xkb layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-xkb-2.1.5-3.3.noarch.rpm"
RPM_HASH = "f0d7ac60538301ce3fe3fcc122e9986ab24ff3c2cc29973c568905eb7dbf92d83a9fe47694bb4dba321cc029565e37be28b86599cf054d9f5e1551d2abf73e25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout-xkb"
RDEPENDS:${PN} += "bumblebee-status \
python3-xkbgroup"

inherit rpm
