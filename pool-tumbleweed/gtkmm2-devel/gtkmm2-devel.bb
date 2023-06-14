SUMMARY = "C++ Interface for GTK2 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm2 wraps \
GTK+ 2. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.5"

RPM_NAME = "gtkmm2-devel-2.24.5-4.3.aarch64.rpm"
RPM_HASH = "548a750f9280f5aa62b73604172c17003612f4036d138512e654849586bcea77b03a9a9a05a680a53cee12c916898123ad40dafa298ea8a2598334949b4fcae8"

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
