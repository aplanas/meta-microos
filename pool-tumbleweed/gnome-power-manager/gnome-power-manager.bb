SUMMARY = "Power Management for GNOME"
DESCRIPTION = "GNOME Power Manager is a GNOME session daemon that acts as a policy \
agent. It listens for system events and responds with \
user-configurable actions."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-power-manager-43.0-1.4.aarch64.rpm"
RPM_HASH = "12158fcd73c8237d083826bfbdb57ee4c011bfdeb3842ea393749fe3c94fa77c7d22d140fc207fde97ce656b002ac27547fdd23cecac4ab45a9561eb169d0d36"

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
