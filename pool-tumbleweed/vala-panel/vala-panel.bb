SUMMARY = "A Gtk3 desktop panel based on Vala"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
Initially it was a fork of LXPanel but 0.2.0 is completely \
rewritten in Vala. It offers same functionality as LXPanel but: \
 * It has a slightly bigger memory usage. \
 * X11 dependency is stripped from panel core (but it is not tested \
   on another display servers, such as Wayland and Mir, right now). \
 * Some of former LXPanel plugins are separate binaries now \
   and live in another packages (volume applet for example)."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "b23571e2e796801605776f32b878ea0aedc82fd64aa93edc8794fe6ef1dfe85380d1efe6d223e233623c48e3f2a6d0ec7c26338d0680ef86a2455e58d7432563"

RPROVIDES:${PN} += "config-vala-panel \
libvalapanel.so.0 \
vala-panel"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0"

inherit rpm
