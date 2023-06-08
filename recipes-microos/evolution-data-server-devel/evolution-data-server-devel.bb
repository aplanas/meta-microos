SUMMARY = "Development files for Evolution Data Server"
DESCRIPTION = "The Evolution Data Server development files provide the necessary \
libraries, headers, and other files for developing applications which \
use the Evolution Data Server for storing contact and calendar \
information."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "evolution-data-server-devel-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "ad25e94aa7f1b216d667c7b1868a3d9d822703ec61b5fc95c8d7b8cd0fb742590503bc74910a528dbedb7a8099e3cb3fe0294fa7bc828352457b24273a0f5b44"

RPROVIDES:${PN} += "evolution-data-server-devel evolution-data-server-devel(aarch-64) pkgconfig(camel-1.2) pkgconfig(evolution-data-server-1.2) pkgconfig(libebackend-1.2) pkgconfig(libebook-1.2) pkgconfig(libebook-contacts-1.2) pkgconfig(libecal-2.0) pkgconfig(libedata-book-1.2) pkgconfig(libedata-cal-2.0) pkgconfig(libedataserver-1.2) pkgconfig(libedataserverui-1.2) pkgconfig(libedataserverui4-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config evolution-data-server libcamel-1_2-64 libebackend-1_2-11 libebook-1_2-21 libebook-contacts-1_2-4 libecal-2_0-2 libedata-book-1_2-27 libedata-cal-2_0-2 libedataserver-1_2-27 libedataserverui-1_2-4 libedataserverui4-1_0-0 openldap2-devel pkgconfig(camel-1.2) pkgconfig(gio-2.0) pkgconfig(gmodule-2.0) pkgconfig(gtk+-3.0) pkgconfig(gtk4) pkgconfig(json-glib-1.0) pkgconfig(libebackend-1.2) pkgconfig(libebook-contacts-1.2) pkgconfig(libecal-2.0) pkgconfig(libedata-book-1.2) pkgconfig(libedataserver-1.2) pkgconfig(libical-glib) pkgconfig(libsecret-1) pkgconfig(libsoup-3.0) pkgconfig(libxml-2.0) typelib-1_0-Camel-1_2 typelib-1_0-EBook-1_2 typelib-1_0-EBookContacts-1_2 typelib-1_0-EDataServer-1_2 typelib-1_0-EDataServerUI-1_2 typelib-1_0-EDataServerUI4-1_0"

inherit rpm
