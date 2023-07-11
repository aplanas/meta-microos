SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-0.42-1.5.aarch64.rpm"
RPM_HASH = "fcd95707f6448a53c88d888e546eba5eed72a15e576ded178dc4f6dd11fc7819af71be530531752139da8c8843ea1a903bf7201c2e233c54d6d5494211ae0656"

RPROVIDES:${PN} += "spice-gtk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libwayland-server.so.0 \
permissions"

inherit rpm
