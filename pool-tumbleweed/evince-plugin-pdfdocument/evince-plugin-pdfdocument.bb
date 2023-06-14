SUMMARY = "PDF document support for Evince"
DESCRIPTION = "A plugin for Evince to read PDF documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-pdfdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "9f259cc9ebc90d9fe62d085db0bd7b291eff3cbc1a25a433198099ebc5ec30bcab1224ac0e0f1680512399b16850b645ddedcb9eee9350e93e2b7523590db407"

RPROVIDES:${PN} += "evince-plugin-pdfdocument \
libpdfdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpoppler-glib.so.8"

inherit rpm
