SUMMARY = "Wayland core server library"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "libwayland-server0-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "adf1a22eaf6edee60435d59ed6fddbb0b786c2a0c72ad7d1620be7ed23fc3e2b97de3b59d73950582c7643bc9fde1212d62ccc358e50e96443030a3b37143d3f"

RPROVIDES:${PN} += "libwayland-server.so.0 \
libwayland-server0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
