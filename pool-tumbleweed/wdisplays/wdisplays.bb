SUMMARY = "GUI display configurator for wlroots compositors"
DESCRIPTION = "wdisplays is a graphical application for configuring displays in \
Wayland compositors. It requires a compositor with the \
wlr-output-management-unstable-v1 protocol, e.g. sway. \
This program can perform adjustment of display settings in \
kiosks, digital signage, and other elaborate multi-monitor setups."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "wdisplays-1.1-1.1.aarch64.rpm"
RPM_HASH = "943c494c87af7f7b55e5fe57f2a57eba50de72a5ef0cf8624af54ea7ebbb950049240d1cd101c0196199e54bbc15bf9be358688d2743cdbcea48517a4c3e145f"

RPROVIDES:${PN} += "wdisplays"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
