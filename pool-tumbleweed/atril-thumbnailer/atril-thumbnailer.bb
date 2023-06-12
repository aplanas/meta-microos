SUMMARY = "Atril thumbnailer extension for Caja"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-thumbnailer-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "644ff6e87390f6b9649f0d29b80b44d724f878820d6429304c5c577d7d7e1b88b5db6d962061558a58a09b838e9b198ecd19ddbd47ef41d2c804ef517edb08b2"

RPROVIDES:${PN} += "atril-thumbnailer \
atril-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "atril \
caja"

inherit rpm
