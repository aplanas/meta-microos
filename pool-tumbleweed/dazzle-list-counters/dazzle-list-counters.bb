SUMMARY = "Collection of fancy features for GLib and Gtk+"
DESCRIPTION = "This package provides the dazzle-list-counters binary."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "dazzle-list-counters-3.44.0-1.8.aarch64.rpm"
RPM_HASH = "72541c1dae88a39c7a1e54e744b8775806d7ae23ad6644d2d06bdf316ea395ab3d74d6a0ea6257a3da0e07dcb670a9195b78b94f11c37231d7357762aea8b538"

RPROVIDES:${PN} += "dazzle-list-counters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdazzle-1.0.so.0 \
libglib-2.0.so.0"

inherit rpm
