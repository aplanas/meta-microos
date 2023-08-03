SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-gimp-1.2.2-3.5.aarch64.rpm"
RPM_HASH = "600ef3c7420ec8d5cd088db1597c99283f8fbe36dbdfd411e7dfcef0d750ef3c51648bb471df7ea89fa7341e2abedf3f9ca7b2a3291213381c7be4de87a809a3"

RPROVIDES:${PN} += "inkscape-extensions-gimp"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
