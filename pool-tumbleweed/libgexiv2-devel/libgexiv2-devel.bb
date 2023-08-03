SUMMARY = "A GObject-based Exiv2 wrapper -- Development Files"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.2"

RPM_NAME = "libgexiv2-devel-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "df026807e02e085bae2129c3b8f2292f5d49306c09d6f18304e569a1268de2a3421f8fad0707d93baa26858116b70069981ba0b84f13631bed77985e292a0378"

RPROVIDES:${PN} += "libgexiv2-devel \
pkgconfig-gexiv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgexiv2-2 \
pkgconfig-exiv2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
