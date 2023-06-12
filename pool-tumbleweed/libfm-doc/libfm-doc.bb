SUMMARY = "GTK libfm libraries"
DESCRIPTION = "libfm developers documentation"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-doc-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "d7dcba614da608a063c9cef155890ee666265c47ae43ee5c4e4a6d8ec17dcfc4633f5e19358dfc4424b5ce229358677c585b5268c38b5741fe83690c905ad191"

RPROVIDES:${PN} += "libfm-doc \
libfm-doc(aarch-64)"
RDEPENDS:${PN} += "libfm"

inherit rpm
