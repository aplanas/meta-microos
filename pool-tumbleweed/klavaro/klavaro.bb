SUMMARY = "Typing tutor"
DESCRIPTION = "Klavaro  is a touch typing tutor that is very \
flexible and supports customizable keyboard \
layouts. Users can edit and save new or unknown \
keyboard layouts, as the basic course provided by \
the program was designed to not depend on specific \
layouts."
LICENSE = "GPL-3.0-or-later"

PV = "3.13"

RPM_NAME = "klavaro-3.13-1.8.aarch64.rpm"
RPM_HASH = "b03a589d86eb1ffe15f565a0878234533f6f70521164d2a1eca9e8204fb75190f45d4ecd3675a5dd4d9aec766a5f5f7f78e14d00d6d32bb4fc72f7ca66a4e2dd"

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
