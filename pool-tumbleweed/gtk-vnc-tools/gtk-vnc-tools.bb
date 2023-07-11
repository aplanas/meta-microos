SUMMARY = "VNC Tools based on gtk-vnc"
DESCRIPTION = "This package contains tools based on gtk-vnc: \
 \
 - gvnccapture: a tool to capture a screenshot of the VNC desktop \
 \
 - gvncviewer: a simple VNC client"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "gtk-vnc-tools-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "5e04cce36ef04a90541f1733e649343b730c4f9663cbd74f5967a70301f7ccbdded8c9af37027adde83c8dd1036cd6f88650973367cbc5fdc0cc55bedc175ae9"

RPROVIDES:${PN} += "gtk-vnc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0"

inherit rpm
