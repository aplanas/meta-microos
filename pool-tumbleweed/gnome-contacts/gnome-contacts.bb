SUMMARY = "Contacts Manager for GNOME"
DESCRIPTION = "The integraded address book for GNOME. \
 \
Among its features are: \
 \
 * Search for and view contacts; \
 * Edit contact details and make new contacts; \
 * Integration with online address books; \
 * Automatic linking of contacts from different online sources."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-contacts-44.0-1.1.aarch64.rpm"
RPM_HASH = "44c99f9f653b0d549d2ae11b4b295033de37d3c7b4907f86f60ab657f2c1cf21763faed88dd3cf2d123158eb25eeec9ad0c510cac631971604cfa21b32a864e9"

RPROVIDES:${PN} += "gnome-contacts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libebook-contacts-1.2.so.4 \
libedataserver-1.2.so.27 \
libfolks-eds.so.26 \
libfolks.so.26 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libportal.so.1 \
libqrencode.so.4"

inherit rpm
