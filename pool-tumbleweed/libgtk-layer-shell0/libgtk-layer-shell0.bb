SUMMARY = "Library to create desktop components for Wayland"
DESCRIPTION = "A library to create panels and other desktop components for Wayland using the Layer Shell protocol"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "libgtk-layer-shell0-0.8.1-1.2.aarch64.rpm"
RPM_HASH = "4066fc6bfce43d13386bd926d8d3b60c4d3b5862eed4d7ccbe023d57c9582704789840f777fead4111ffa97d687f2d6251e533f4cf02329a2808a8c4e8ec1854"

RPROVIDES:${PN} += "libgtk-layer-shell.so.0 \
libgtk-layer-shell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
