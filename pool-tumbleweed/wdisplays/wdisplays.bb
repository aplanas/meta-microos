SUMMARY = "GUI display configurator for wlroots compositors"
DESCRIPTION = "wdisplays is a graphical application for configuring displays in \
Wayland compositors. It requires a compositor with the \
wlr-output-management-unstable-v1 protocol, e.g. sway. \
This program can perform adjustment of display settings in \
kiosks, digital signage, and other elaborate multi-monitor setups."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "wdisplays-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "43bd6a7e55d86098d6f266fd202432c16330e3e47590cc4c2b4e305fb8fc779c2a106595a854c433542074807bb6bf1c1d1fefc9fccc4a46a3ecc5a3f24eddc3"

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
