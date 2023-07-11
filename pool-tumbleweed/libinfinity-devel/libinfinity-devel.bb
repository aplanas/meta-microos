SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-devel-0.7.2-4.7.aarch64.rpm"
RPM_HASH = "1a279c50ce83e1adc816cef3ae851de7a328e5c7a4b0a4d0c6f934c6b2128f08bf8737a48ecb830cb41aeaddd13577f2cafc90c4f89fd236523640d4988f8bf0"

RPROVIDES:${PN} += "libinfinity-devel \
pkgconfig-libinfgtk-0.7 \
pkgconfig-libinfinity-0.7 \
pkgconfig-libinfinoted-plugin-manager-0.7 \
pkgconfig-libinftext-0.7 \
pkgconfig-libinftextgtk-0.7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-devel \
libgsasl-devel \
libinfinity-0-7-0 \
pkgconfig-glib-2.0 \
pkgconfig-gnutls \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgsasl \
pkgconfig-libinfinity-0.7 \
pkgconfig-libinftext-0.7 \
pkgconfig-libxml-2.0"

inherit rpm
