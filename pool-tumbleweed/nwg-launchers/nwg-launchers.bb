SUMMARY = "GTK launchers and menu for sway and i3"
DESCRIPTION = "GTK-based launchers: application grid, button bar, dmenu for sway and other window managers."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1.1"

RPM_NAME = "nwg-launchers-0.7.1.1-1.4.aarch64.rpm"
RPM_HASH = "c6791f0b897e72f697d2008323f93c50713f95ff84a907970b4c2c92a0a2b3df838899aef7dc0c4b407f4f658067952836b337c07d94ea5bdf4a66381e944f52"

RPROVIDES:${PN} += "nwg-launchers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
