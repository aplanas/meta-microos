SUMMARY = "Collection of fancy features for GLib and Gtk+"
DESCRIPTION = "This package provides the dazzle-list-counters binary."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "dazzle-list-counters-3.44.0-1.7.aarch64.rpm"
RPM_HASH = "20850f69e892c1f5e46c28c562e93b78b53e2ff592f2167570faba80271344ac834ade837db03c0082c3f7f1522736ff5e6f384fb1d4533c450591a40ce4f5d9"

RPROVIDES:${PN} += "dazzle-list-counters \
dazzle-list-counters(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdazzle-1.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
