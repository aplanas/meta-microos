SUMMARY = "Power Management for GNOME"
DESCRIPTION = "GNOME Power Manager is a GNOME session daemon that acts as a policy \
agent. It listens for system events and responds with \
user-configurable actions."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-power-manager-43.0-1.3.aarch64.rpm"
RPM_HASH = "f109d011b64cb5cf9d57d009d9b0ebd181bf535a69e2d288f06389f1a28838a081b29ad0d84984b29168f0106de356c50ff8a37e7afe1d2a844b3445bad95b3f"

RPROVIDES:${PN} += "gnome-power-manager"

RDEPENDS:${PN} += "gnome-session-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
upower"

inherit rpm
