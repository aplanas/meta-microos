SUMMARY = "Typing tutor"
DESCRIPTION = "Klavaro  is a touch typing tutor that is very \
flexible and supports customizable keyboard \
layouts. Users can edit and save new or unknown \
keyboard layouts, as the basic course provided by \
the program was designed to not depend on specific \
layouts."
LICENSE = "GPL-3.0-or-later"

PV = "3.13"

RPM_NAME = "klavaro-3.13-1.7.aarch64.rpm"
RPM_HASH = "46e5a0d7ea9ee05a29ff90f2f3cfe96cb7b9e2c5ce946c13aa512ab0fec538f53833d2bd3b72bf17d5e1bee4fda2404a141779d7363cf73632b63aafca9354a6"

RPROVIDES:${PN} += "klavaro"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkdatabox.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
