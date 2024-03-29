SUMMARY = "Network Load Monitoring Plugin for the Xfce Panel"
DESCRIPTION = "The Netload plugin allows to monitor the netowrk load of a given network \
interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xfce4-netload-plugin-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "38d043048e53a53811e972a97099535873c114be39c7d88f228b864762324a1382454d7b5c5bcf1cf07e9c4f8efb47b656e70abae0bdbdf22c5f7f63484e56ff"

RPROVIDES:${PN} += "libnetload.so \
xfce4-netload-plugin \
xfce4-panel-plugin-netload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
