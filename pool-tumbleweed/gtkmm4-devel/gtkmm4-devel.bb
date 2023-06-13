SUMMARY = "C++ Interface for GTK4 (a GUI library for X)"
DESCRIPTION = "Gtkmm provides a C++ interface to the GTK+ GUI library. gtkmm3 wraps \
GTK+ 3. Highlights include typesafe callbacks, widgets extensible via \
inheritance and a comprehensive set of widget classes that can be \
freely combined to quickly create complex user interfaces."
LICENSE = "LGPL-2.1-or-later"

PV = "4.10.0"

RPM_NAME = "gtkmm4-devel-4.10.0-1.1.aarch64.rpm"
RPM_HASH = "7ad96190b7976f7c4f3b478963c8681c7dbcd0d5d9f9db3eaab1dc979b4ab4f4cd623dc92390920a0db4b42d726060bb86f221bde4c4bd4f75c852bf83c1e6d9"

RPROVIDES:${PN} += "gtkmm4-devel \
gtkmm4-devel(aarch-64) \
pkgconfig(gtkmm-4.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkmm-4_0-0 \
pkgconfig(cairomm-1.16) \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(giomm-2.68) \
pkgconfig(gtk4) \
pkgconfig(gtk4-unix-print) \
pkgconfig(pangomm-2.48)"

inherit rpm
