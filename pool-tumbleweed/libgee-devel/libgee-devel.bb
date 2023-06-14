SUMMARY = "Development files for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides all the files needed for development using Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.6"

RPM_NAME = "libgee-devel-0.20.6-1.3.aarch64.rpm"
RPM_HASH = "d06df943c609546e658e4ca317596ffe027bd3b6a91448754df16ca3d80b697a91a67edc16e2492dc549d4dbed99ee8535686f576698248f7138a17dbf04f4fd"

RPROVIDES:${PN} += "libgee-devel \
pkgconfig-gee-0.8"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgee-0-8-2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Gee-0-8"

inherit rpm
