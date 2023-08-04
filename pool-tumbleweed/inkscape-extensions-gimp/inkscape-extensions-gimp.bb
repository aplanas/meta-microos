SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "inkscape-extensions-gimp-1.3-1.1.aarch64.rpm"
RPM_HASH = "9461c7a585fbc01e457969bd69e540ffbbf204585a388dba31e4b6b148ee3ec90d26ed8a8ccca4d4614bca33b7d46aa3f2ec601a0221bc9a1eadcdb4dad62fe0"

RPROVIDES:${PN} += "inkscape-extensions-gimp"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
