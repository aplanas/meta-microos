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

RPM_NAME = "gnome-shell-search-provider-contacts-44.0-1.1.aarch64.rpm"
RPM_HASH = "9526972655a5397aba20860c54c5249171d2e5b58f4769cba7fa891877bbc9de4e146a19f7ef970ea3fc2f2d0c19ad69a9d95b2d544c51e79a1b3b31c3037f7a"

RPROVIDES:${PN} += "gnome-shell-search-provider-contacts \
gnome-shell-search-provider-contacts(aarch-64)"

RDEPENDS:${PN} += "gnome-contacts \
gnome-shell \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libfolks-eds.so.26()(64bit) \
libfolks.so.26()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgoa-1.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
