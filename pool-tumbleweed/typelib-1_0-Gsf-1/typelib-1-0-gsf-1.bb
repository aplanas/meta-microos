SUMMARY = "Introspection bindings for the GNOME desktop Office files thumbnailer"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "typelib-1_0-Gsf-1-1.14.50-1.6.aarch64.rpm"
RPM_HASH = "d7d23eb419e077ec6e4460539bbc6ba67b2bf05c8a407de4cb28d3e651714fad85972ce18952d73c04c90853fec64af52187c02109fa17ba0c15460c7a2461d3"

RPROVIDES:${PN} += "typelib-1-0-Gsf-1 \
typelib-Gsf"

RDEPENDS:${PN} += "libgsf-1.so.114 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
