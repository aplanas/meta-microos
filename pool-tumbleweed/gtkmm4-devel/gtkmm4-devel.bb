SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-devel-4.10.0-2.1.aarch64.rpm"
RPM_HASH = "fb068801078ac25dede1a5f5f339c2c5aadcfd4cbd94d0501810613443c8ca44069024f8cc7e663b87a354b533cd8f35f470bd4ea0e310af418c0fd6cd0e20da"

RPROVIDES:${PN} += "gtkmm4-devel \
pkgconfig-gtkmm-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-4-0-0 \
pkgconfig-cairomm-1.16 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-giomm-2.68 \
pkgconfig-gtk4 \
pkgconfig-gtk4-unix-print \
pkgconfig-pangomm-2.48"

inherit rpm
