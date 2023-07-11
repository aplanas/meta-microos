SUMMARY = "Scribus extensions for Inkscape"
DESCRIPTION = "The Scribus-based PDF export extension for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.2.2"

RPM_NAME = "inkscape-extensions-scribus-1.2.2-3.3.aarch64.rpm"
RPM_HASH = "0fae54e4d43617bb88cb46fc11833d69d304b3bd12d030439d00e0b90db53ee46582065067e503a3f0e45aaf29a89300a2ad7f1eec9922a30bcdbc1f97bf0a15"

RPROVIDES:${PN} += "inkscape-extensions-scribus"

RDEPENDS:${PN} += "inkscape \
inkscape-extensions-extra \
scribus"

inherit rpm
