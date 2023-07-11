SUMMARY = "Contacts Manager for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "The integraded address book for GNOME. \
 \
Among its features are: \
 \
 * Search for and view contacts; \
 * Edit contact details and make new contacts; \
 * Integration with online address books; \
 * Automatic linking of contacts from different online sources. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from contacts."
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-contacts-44.0-1.2.aarch64.rpm"
RPM_HASH = "fe77b9f73dce98b702dafebc07e7ec8ebb7a73d04ef7894b02c0acc7f42e4b8137d309722f620a70fb0a429576a40d65066c1337f75a2a368be68e7fb562e5c9"

RPROVIDES:${PN} += "gnome-shell-search-provider-contacts"

RDEPENDS:${PN} += "gnome-contacts \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedataserver-1.2.so.27 \
libfolks-eds.so.26 \
libfolks.so.26 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
