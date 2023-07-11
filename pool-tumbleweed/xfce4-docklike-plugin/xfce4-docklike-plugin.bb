SUMMARY = "Docklike Taskbar"
DESCRIPTION = "Docklike Taskbar behaves similarly to many other desktop environments \
and operating systems. Wherein all application windows are grouped \
together as an icon and can be pinned to act as a launcher when the \
application is not running. Commonly referred to as a dock."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "xfce4-docklike-plugin-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "0dcb69880ec90e8ece0e39b4d23f5d562494f0cf04b17e59d803428c72cab5bea0b9b7dd41f40e72b6dfc453d7255d426222139a92fadfd58cfa9abba852613e"

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
