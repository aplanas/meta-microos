SUMMARY = "PostScript document support for Evince"
DESCRIPTION = "A plugin for Evince to read PostScript documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-psdocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "df437c2542e140138d0f88dbddaa0a970a99c2e79f510f9b1613786c83a87bcadfe67582c900896e7cc438fd77d2f18d84d820a8b53fbf957540150c13e130ff"

RPROVIDES:${PN} += "evince-plugin-psdocument \
libpsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspectre.so.1"

inherit rpm
