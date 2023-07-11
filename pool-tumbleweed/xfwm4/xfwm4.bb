SUMMARY = "Default Window Manager for the Xfce Desktop Environment"
DESCRIPTION = "xfwm4 is the default Xfce window manager which manages the placement of \
application windows on the screen, provides beautiful window decorations, \
manages workspaces or virtual desktops and natively supports multiscreen mode. \
It provides its own compositing manager for true transparency and shadows. The \
Xfce window manager also includes a keyboard shorcuts editor for user specific \
commands and basic windows manipulations and provides a preferences dialog for \
advanced tweaks."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-4.18.0-1.4.aarch64.rpm"
RPM_HASH = "9756e6541faeaf79fb336cfe6528a555458aa0c1f24a6316aeb47266e754f39d32c3e0ba82c29431c088c50b693e17eed8568c5a9dec48455781805ea24c28af"

RPROVIDES:${PN} += "windowmanager \
xfwm4 \
xfwm4-doc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXpresent.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0 \
libwnck-3.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
