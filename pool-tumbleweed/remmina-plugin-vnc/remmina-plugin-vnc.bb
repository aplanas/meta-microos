SUMMARY = "VNC Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-vnc-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "fb3a6ff3cdc4f26dbb52c05d7d4afafe0a2a94fdde98e32e0c05a5122e02a6d76d740ba739379206b4fce17a96cb9a6bc3d86754ed8e3fd44e97392c1e5aab14"

RPROVIDES:${PN} += "remmina-plugin-vnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libvncclient.so.1 \
remmina"

inherit rpm
