SUMMARY = "Atril thumbnailer extension for Caja"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-thumbnailer-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "ebc674acfbc5d10390b6d1966e269712cad8632713d3b791e5b3c387951a91493166f9f2bc199bb867cee286d094b2296df6879646f65f0bc72841a5d5e34c2a"

RPROVIDES:${PN} += "atril-thumbnailer atril-thumbnailer(aarch-64)"
RDEPENDS:${PN} += "atril caja"

inherit rpm
