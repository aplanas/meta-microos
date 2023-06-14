SUMMARY = "Docklike Taskbar"
DESCRIPTION = "Docklike Taskbar behaves similarly to many other desktop environments \
and operating systems. Wherein all application windows are grouped \
together as an icon and can be pinned to act as a launcher when the \
application is not running. Commonly referred to as a dock."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "xfce4-docklike-plugin-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "a480fb5a6430831528561fd58dd81ff32b8560efabb78812e9489f9c0c31899393573f8fa2e880bd96968b3c53ecfa03ca5eabfecb5b13066ce67999457c9202"

RPROVIDES:${PN} += "libdocklike.so \
xfce4-docklike-plugin"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-panel"

inherit rpm
