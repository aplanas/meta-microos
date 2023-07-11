SUMMARY = "Development files for Evolution Data Server"
DESCRIPTION = "The Evolution Data Server development files provide the necessary \
libraries, headers, and other files for developing applications which \
use the Evolution Data Server for storing contact and calendar \
information."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "evolution-data-server-devel-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "ff7d42642fc3f9b7848035fd11c64909c51fdeaef055ec1d4f0857af78aaab9fae9b6c6d35bf2332e9f2a5b63569fcce7801d8926ef09f202b6327ed2f08ff02"

RPROVIDES:${PN} += "evolution-data-server-devel \
pkgconfig-camel-1.2 \
pkgconfig-evolution-data-server-1.2 \
pkgconfig-libebackend-1.2 \
pkgconfig-libebook-1.2 \
pkgconfig-libebook-contacts-1.2 \
pkgconfig-libecal-2.0 \
pkgconfig-libedata-book-1.2 \
pkgconfig-libedata-cal-2.0 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libedataserverui-1.2 \
pkgconfig-libedataserverui4-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evolution-data-server \
libcamel-1-2-64 \
libebackend-1-2-11 \
libebook-1-2-21 \
libebook-contacts-1-2-4 \
libecal-2-0-2 \
libedata-book-1-2-27 \
libedata-cal-2-0-2 \
libedataserver-1-2-27 \
libedataserverui-1-2-4 \
libedataserverui4-1-0-0 \
openldap2-devel \
pkgconfig-camel-1.2 \
pkgconfig-gio-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk4 \
pkgconfig-json-glib-1.0 \
pkgconfig-libebackend-1.2 \
pkgconfig-libebook-contacts-1.2 \
pkgconfig-libecal-2.0 \
pkgconfig-libedata-book-1.2 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libical-glib \
pkgconfig-libsecret-1 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-Camel-1-2 \
typelib-1-0-EBook-1-2 \
typelib-1-0-EBookContacts-1-2 \
typelib-1-0-EDataServer-1-2 \
typelib-1-0-EDataServerUI-1-2 \
typelib-1-0-EDataServerUI4-1-0"

inherit rpm
