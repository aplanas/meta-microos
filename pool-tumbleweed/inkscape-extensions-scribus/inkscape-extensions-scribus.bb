SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-scribus-1.2.2-3.4.aarch64.rpm"
RPM_HASH = "706dc62f2b434f00d594249ec37ccd049a89e1dabd08066b814e785447de1599848f57a778124a5c63d2f671b7829c960ffbc862daffb523e753ff39ea1cb6f5"

RPROVIDES:${PN} += "inkscape-extensions-scribus"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
scribus"

inherit rpm
