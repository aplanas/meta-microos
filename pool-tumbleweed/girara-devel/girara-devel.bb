SUMMARY = "Header files for the girara library"
DESCRIPTION = "Header files for the girara user interface library."
LICENSE = "Zlib"

PV = "0.4.0"

RPM_NAME = "girara-devel-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "33622707a9d01f629e7ac5ca080702f078fbbce01eaf3aa99195f07a450a34e2f38878b98169240256877e074bcc7b2200930395105bcb31b594ad44cecec757"

RPROVIDES:${PN} += "girara-devel \
pkgconfig-girara-gtk3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgirara-gtk3-3 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-pango"

inherit rpm
