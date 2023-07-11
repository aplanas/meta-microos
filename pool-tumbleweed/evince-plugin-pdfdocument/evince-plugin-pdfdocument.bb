SUMMARY = "PDF document support for Evince"
DESCRIPTION = "A plugin for Evince to read PDF documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-pdfdocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "8431971facb0330f22f7f4bf55cc57e24098c11452aee6a79a4a7c3dd96c5533b08d87cca94aad4d8951225ced705bcde4abe9d51376bf91dd2d46fe1348b5aa"

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
