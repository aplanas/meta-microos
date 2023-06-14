SUMMARY = "Command Line Plugin for the Xfce Panel"
DESCRIPTION = "The Verve panel plugin is a command line plugin for the Xfce panel which \
supports a command history, auto-completion, keyboard-shortcut focus grabbing and \
opening URLs."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "xfce4-verve-plugin-2.0.1-1.11.aarch64.rpm"
RPM_HASH = "c04502b1616c8c1e71ef6af27e09b7549dab64762cc12163dbc153311f73df09d3942920366c270f55ef3aec5c4531ed6b98b123b451fae93a60905c0b6e7ee7"

RPROVIDES:${PN} += "libverve.so \
xfce4-panel-plugin-verve \
xfce4-verve-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpcre.so.1 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
