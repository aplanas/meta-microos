SUMMARY = "Use wayland as a client"
DESCRIPTION = "Using wayland as a client (uwac) is a library to provide common \
functionality for wayland clients."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "libuwac0-0-2.11.0-1.1.aarch64.rpm"
RPM_HASH = "6ca5e4ce04745f908abd453ec87091f071a39d36f2c49fac9ae6f7bd732c037c844070c9b396887c41524b313d2be439559921a9408e1b9ff5ce02e260b6dd47"

RPROVIDES:${PN} += "libuwac0-0 \
libuwac0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp2.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
