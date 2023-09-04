SUMMARY = "Window and compositing manager based on Clutter"
DESCRIPTION = "Mutter is a window and compositing manager based on Clutter, forked \
from Metacity."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "mutter-44.3-3.1.aarch64.rpm"
RPM_HASH = "d491dc86ce7848d667c9de26b9d9c5da404072ca6b09eded763ca967ea645737fac17f6eb6910565357c60d304732ea9f45a5e7904ba10b945a5ffe72a8345ed"

RPROVIDES:${PN} += "libdefault.so \
libmutter-12.so.0 \
libmutter-clutter-12.so.0 \
libmutter-cogl-12.so.0 \
libmutter-cogl-pango-12.so.0 \
mutter \
typelib-Cally \
typelib-Clutter \
typelib-Cogl \
typelib-CoglPango \
typelib-Meta \
windowmanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-settings-daemon \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libICE.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXau.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra.so.0 \
libcolord.so.2 \
libdrm.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgbm.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnome-desktop-4.so.2 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libharfbuzz.so.0 \
libinput.so.10 \
libjson-glib-1.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpipewire-0.3.so.0 \
libstartup-notification-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libwacom.so.9 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-randr.so.0 \
libxcb-res.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
typelib-Atk \
typelib-GDesktopEnums \
typelib-GL \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Graphene \
typelib-HarfBuzz \
typelib-Json \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2 \
typelib-xfixes \
typelib-xlib"

inherit rpm
