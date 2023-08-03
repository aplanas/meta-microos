SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-scribus-1.2.2-3.5.aarch64.rpm"
RPM_HASH = "a3011ce7642e4e45a3441ac0f0190040eb1b6eb44413e460f3247bb125f140343f26b5810da6de91300ee1c900b2e9312a273dd244cb05327d74866a4977639a"

RPROVIDES:${PN} += "inkscape-extensions-scribus"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
scribus"

inherit rpm
