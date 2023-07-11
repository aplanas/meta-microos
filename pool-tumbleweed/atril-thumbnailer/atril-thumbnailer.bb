SUMMARY = "Atril thumbnailer extension for Caja"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript. \
 \
This package contains the Atril extension for the Caja file manager."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-thumbnailer-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "2ed468af693124c5192073131214ba40f1f156d9ea41d1db6b99f4c37b0f723f08aa939220c3f52d8dae21ac8446fb7e93467c26c95fc67b093953c2af2c71a6"

RPROVIDES:${PN} += "atril-thumbnailer"

RDEPENDS:${PN} += "atril \
caja"

inherit rpm
