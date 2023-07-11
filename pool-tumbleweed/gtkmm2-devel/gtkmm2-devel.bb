SUMMARY = "C++ Interface for GTK2 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm2 wraps \
GTK+ 2. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.5"

RPM_NAME = "gtkmm2-devel-2.24.5-4.4.aarch64.rpm"
RPM_HASH = "38cad78fc3c828ab024072a0815bf8fedd032a72ffc2c1eaad64eab0705d659152e73d04b512ee82819ce3781f761d6c2da99c7ed8d450ee2153d6ffe6959799"

RPROVIDES:${PN} += "gtkmm2-devel \
gtkmm2-doc \
gtkmm24-devel \
pkgconfig-gdkmm-2.4 \
pkgconfig-gtkmm-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-2-4-1 \
pkgconfig-atkmm-1.6 \
pkgconfig-gdkmm-2.4 \
pkgconfig-giomm-2.4 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-unix-print-2.0 \
pkgconfig-pangomm-1.4"

inherit rpm
