SUMMARY = "Use wayland as a client"
DESCRIPTION = "Using wayland as a client (uwac) is a library to provide common \
functionality for wayland clients."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libuwac0-0-2.10.0-3.1.aarch64.rpm"
RPM_HASH = "91f14d4846a44552313730ffd50142fe7caf2c19729c860d78d49c26ef926704f88c4a081d30da732e319750f7d92555d79905a746a73aeb71e88ded1a38fde7"

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
