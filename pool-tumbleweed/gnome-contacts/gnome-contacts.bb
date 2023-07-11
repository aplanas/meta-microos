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

RPM_NAME = "gnome-contacts-44.0-1.2.aarch64.rpm"
RPM_HASH = "b30346846b9c8e5925ba3147e02d8fa52ab529e25bf3196266d51fa0fa73b26ce2e9c7f5c52879f75824de236e696bbdf8fb9f2217db29ace9c0a2886c27c306"

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
