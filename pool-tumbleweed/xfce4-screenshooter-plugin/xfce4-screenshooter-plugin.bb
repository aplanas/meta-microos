SUMMARY = "Screenshot Plugin for the Xfce Panel"
DESCRIPTION = "This package contains the xfce4-screenshooter Xfce panel plugin."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.4"

RPM_NAME = "xfce4-screenshooter-plugin-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "49cafd8e4509f029bf35f1e88c3da6d882deced439114c7ed6e3c185c306f92aebc6cbcc6cf09c38831e6042f320640b9e4069f540304cca1340ebf7b733d322"

RPROVIDES:${PN} += "libscreenshooterplugin.so \
xfce4-panel-plugin-screenshooter \
xfce4-screenshooter-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxml2.so.2 \
xfce4-panel \
xfce4-screenshooter"

inherit rpm
