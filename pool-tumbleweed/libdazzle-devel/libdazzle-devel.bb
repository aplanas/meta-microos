SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Development Files"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone. -- Development Files \
 \
This package provides the development files, and its documentation, for libdazzle."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-devel-3.44.0-1.8.aarch64.rpm"
RPM_HASH = "21f0f901aa234cc9dcb393b288a763e0745c52b9d4b1aef2dfad929403c8646022b39bf4dcdad345b74f16b13aecc81e6bbf514b5927aedacbd58bffb008ee0b"

RPROVIDES:${PN} += "libdazzle-devel \
pkgconfig-libdazzle-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dazzle-list-counters \
libdazzle-1-0-0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-libdazzle-1-0"

inherit rpm
