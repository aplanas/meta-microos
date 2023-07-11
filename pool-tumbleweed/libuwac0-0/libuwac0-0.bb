SUMMARY = "Use wayland as a client"
DESCRIPTION = "Using wayland as a client (uwac) is a library to provide common \
functionality for wayland clients."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "libuwac0-0-2.10.0-3.2.aarch64.rpm"
RPM_HASH = "4e011d2559db349df67d306fd8879b56b8898df1088e27574079196b7ada941b9046f320dba17077c29d9d8375a6e584526a187455bf758af48f7292613450e4"

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
