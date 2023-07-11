SUMMARY = "VNC Protocol Plugin for Remmina via GTK+ widget"
DESCRIPTION = "This package provides the RDP protocol plugin for Remmina using the \
VNC viewer widget for GTK+."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-gvnc-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "33779c9634066b3750ee9966262a88366c73482288ae79707a7483f224b61580adf89ed00c00d8659ed5d6fee52dbf448321a464e090e8bb87fbd32332076ed8"

RPROVIDES:${PN} += "remmina-plugin-gvnc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libgvncpulse-1.0.so.0 \
remmina"

inherit rpm
