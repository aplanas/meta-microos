SUMMARY = "Window shuffler applet"
DESCRIPTION = "GUI and keyboard friendly window arranger for the budgie desktop"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-window-shuffler-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "702484c59318a1482e2efc95b87ed891bab1d01f23dd3978c4b69de42af46b2b84883d67d397677277a65d876883c17604c43566a0da8f19d531895e4250aa29"

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
