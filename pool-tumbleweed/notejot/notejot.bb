SUMMARY = "A Sticky Note App"
DESCRIPTION = "A sticky notes application for any type of short term notes \
or ideas."
LICENSE = "GPL-3.0-only"

PV = "3.4.9"

RPM_NAME = "notejot-3.4.9-1.8.aarch64.rpm"
RPM_HASH = "00a058449eca0d872c16f0e2a71af2300fde279d5db1354f2b808a75cebb6983ae4903e38fa1373d210caacd6d9bb52efea4e1c394e9722b44648e1db72f8276"

RPROVIDES:${PN} += "notejot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
