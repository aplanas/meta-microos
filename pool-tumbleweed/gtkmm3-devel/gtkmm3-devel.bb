SUMMARY = "C++ Interface for GTK3 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.7"

RPM_NAME = "gtkmm3-devel-3.24.7-2.4.aarch64.rpm"
RPM_HASH = "a8e37b309aa7ffa8caf5413ff9c531a2df22f717819602004d217b2c0a99f5f3b2f29d073ac93ee0e7d9df105802220b91681ddfed5ec36e12b908f19eb9f2b6"

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
