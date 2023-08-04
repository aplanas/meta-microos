SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "inkscape-extensions-scribus-1.3-1.1.aarch64.rpm"
RPM_HASH = "f252a0bbcc6d6af69096c7f52686413df56a3d14d84796ab3a91d2d7478aec2ccac00823d0f1a564b38bfa81de6bd0f93ee0c1f8d2f9a896bf4a461efd3633bf"

RPROVIDES:${PN} += "inkscape-extensions-scribus"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
scribus"

inherit rpm
