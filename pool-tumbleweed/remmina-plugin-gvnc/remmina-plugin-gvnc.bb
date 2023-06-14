SUMMARY = "VNC Protocol Plugin for Remmina via GTK+ widget"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina using the \
VNC viewer widget for GTK+."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-gvnc-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "dff1b37c272de530ccc1a610696795a8f258e51f6a34c5463e0e49d36a62e6656939e1bf619fda3496eb0ac859f3d9257d046d1e1d6a76275ddbd28046d16e48"

RPROVIDES:${PN} += "remmina-plugin-gvnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0 \
remmina"

inherit rpm
