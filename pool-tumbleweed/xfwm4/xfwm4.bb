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

RPM_NAME = "xfwm4-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "faa0eb92b765a4efefefc82eec0c5bbcf4e3f4d472f7a66f4be9163ac235c9785f56ae6154baa8dd02ee431a4b728be8859caa458f478a8fa894ecd0557a2ff5"

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
