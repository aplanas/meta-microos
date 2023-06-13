SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-gimp-1.2.2-3.1.aarch64.rpm"
RPM_HASH = "c49b40f2130b0ab7dea4b9e0bf83202af78bbd0736d14a692dc65efc369af49fba5870f88c3bd390853baa008e35c65f137e48b5eb11eed098855baaa13fca76"

RPROVIDES:${PN} += "inkscape-extensions-gimp \
inkscape-extensions-gimp(aarch-64)"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
