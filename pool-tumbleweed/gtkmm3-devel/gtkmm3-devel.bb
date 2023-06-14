SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "gtkmm3-devel-3.24.7-2.3.aarch64.rpm"
RPM_HASH = "e92fa302f8062506cee3d29d529329ef320b7566b4936e8180f11a8ba74097e1b1eaf1d4816bfd698f5306016c9ad3c408b2e250f7b2db5089cd5e8e0c0dda29"

RPROVIDES:${PN} += "gtkmm3-devel \
pkgconfig-gdkmm-3.0 \
pkgconfig-gtkmm-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-3-0-1 \
pkgconfig-atkmm-1.6 \
pkgconfig-cairomm-1.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gdkmm-3.0 \
pkgconfig-giomm-2.4 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk+-unix-print-3.0 \
pkgconfig-pangomm-1.4"

inherit rpm
