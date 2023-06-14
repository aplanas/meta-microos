SUMMARY = "Window Manager for the MATE and GNOME Flashback desktops"
DESCRIPTION = "Metacity is a window manager using GTK to do everything. \
It is developed mainly for the MATE and GNOME Flashback desktops."
LICENSE = "GPL-2.0-or-later"

PV = "3.46.1"

RPM_NAME = "metacity-3.46.1-1.1.aarch64.rpm"
RPM_HASH = "ad0b2fd91b02f039f1dabb09bbea02114bec61e96e2b9c8e788460aae264b171579ab1c10a1607f0d2ed518cb7be26f75c482c56210896dccba30cb96c7336dd"

RPROVIDES:${PN} += "metacity \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libXRes.so.1 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXpresent.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libgtop-2.0.so.11 \
libharfbuzz.so.0 \
libm.so.6 \
libmetacity.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0 \
libvulkan.so.1 \
libz.so.1 \
zenity"

inherit rpm
