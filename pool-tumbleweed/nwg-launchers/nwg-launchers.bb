SUMMARY = "GTK launchers and menu for sway and i3"
DESCRIPTION = "GTK-based launchers: application grid, button bar, dmenu for sway and other window managers."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1.1"

RPM_NAME = "nwg-launchers-0.7.1.1-1.3.aarch64.rpm"
RPM_HASH = "2b3e7e2202891999f7aa8aaacf3206de87826a6d99eeb1ebcc19dc2cfd799f83fc0b4c26e8beba0ba63417a16597126829e5d54de85b474713228ca2d079430c"

RPROVIDES:${PN} += "nwg-launchers \
nwg-launchers(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-layer-shell.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
