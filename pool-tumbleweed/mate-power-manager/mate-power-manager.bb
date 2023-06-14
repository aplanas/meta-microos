SUMMARY = "MATE Desktop UPower policy management"
DESCRIPTION = "MATE Power Manager is a MATE session daemon that acts as a policy \
agent on top of UPower, which requires fairly new versions of the \
kernel and udev. MATE Power Manager listens for system events and \
responds with user-configurable actions."
LICENSE = "GPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "mate-power-manager-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "0c1c710d0c4b4e4ff60d841f33dd750bff7ae07f27ec23f7a14e1c91babc26e2862ed25c05dd5805c112f8d0f3f7403eb8429b20edbf8d54578e1b2048a1b56b"

RPROVIDES:${PN} += "mate-power-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-panel-applet-4.so.1 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsecret-1.so.0 \
libupower-glib.so.3 \
upower"

inherit rpm
