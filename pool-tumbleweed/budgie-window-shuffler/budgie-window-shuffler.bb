SUMMARY = "Window shuffler applet"
DESCRIPTION = "GUI and keyboard friendly window arranger for the budgie desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-window-shuffler-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "0ff597f5665fdbb8465526ad04bbbc791eed8b9ce22084d278530c82d5ded229b8ade584e7e65121b66b0a305a6b532e7e4bb2f15be2640fd31b68e8f55ab460"

RPROVIDES:${PN} += "budgie-window-shuffler \
libshufflerapplet.so"

RDEPENDS:${PN} += "budgie-extras-daemon \
budgie-extras-lang \
ld-linux-aarch64.so.1 \
libatspi.so.0 \
libbudgie-plugin.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libpeas-1.0.so.0 \
libwnck-3.so.0 \
xdpyinfo \
xev \
xlsatoms \
xlsclients \
xlsfonts \
xprop \
xvinfo \
xwininfo"

inherit rpm
