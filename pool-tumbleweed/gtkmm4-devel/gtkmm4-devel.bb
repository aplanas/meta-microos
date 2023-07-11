SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-devel-4.10.0-1.2.aarch64.rpm"
RPM_HASH = "4c683b4f48c97ee156f4b7016879ac27e6ee780b27b304d0ae616f6cae2c571824c119a2a0959b918f5cd12fc9b0c5b8b761a2b5d0e0f6e9f7b34a2d614886eb"

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
