SUMMARY = "VNC Tools based on gtk-vnc"
DESCRIPTION = "This package contains tools based on gtk-vnc: \
 \
 - gvnccapture: a tool to capture a screenshot of the VNC desktop \
 \
 - gvncviewer: a simple VNC client"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.1"

RPM_NAME = "gtk-vnc-tools-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "eb622cd68693a59f3290deabd13698430e0ceaf17b6712374f18e26b1aba9b9fc4a3d609e97432e3b9a2f55622bba980971f56ab6887f1a4b7cd8cd2567551e3"

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
