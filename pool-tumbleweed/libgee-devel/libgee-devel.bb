SUMMARY = "Development files for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides all the files needed for development using Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "libgee-devel-0.20.6-1.4.aarch64.rpm"
RPM_HASH = "1ebca0859add150b9cd7623ec0300ebb6ffad5a773fa9d7f380d2e435e40dc4d7f843b36524c67ab081ac78f4db758a7103591e5e73751df154e976f3dbb4983"

RPROVIDES:${PN} += "libgee-devel \
pkgconfig-gee-0.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgee-0-8-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Gee-0-8"

inherit rpm
