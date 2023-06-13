SUMMARY = "Window and compositing manager based on Clutter"
DESCRIPTION = "Mutter is a window and compositing manager based on Clutter, forked \
from Metacity."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+2"

RPM_NAME = "mutter-44.1+2-3.1.aarch64.rpm"
RPM_HASH = "d9a88c303fae19eb4c4773df09bf168ef9a4b4f456058a79dbaad0497f7624c7f857168e13ea2388913a92878e4ebc803e5829e83c3333a413bfd103fb9f18e9"

RPROVIDES:${PN} += "libdefault.so()(64bit) \
libmutter-12.so.0()(64bit) \
libmutter-clutter-12.so.0()(64bit) \
libmutter-cogl-12.so.0()(64bit) \
libmutter-cogl-pango-12.so.0()(64bit) \
mutter \
mutter(aarch-64) \
typelib(Cally) \
typelib(Clutter) \
typelib(Cogl) \
typelib(CoglPango) \
typelib(Meta) \
windowmanager"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-settings-daemon \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXcursor.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcanberra.so.0()(64bit) \
libcolord.so.2()(64bit) \
libdrm.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libfribidi.so.0()(64bit) \
libgbm.so.1()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnome-desktop-4.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgudev-1.0.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.14.0)(64bit) \
libinput.so.10(LIBINPUT_0.19.0)(64bit) \
libinput.so.10(LIBINPUT_0.20.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.1)(64bit) \
libinput.so.10(LIBINPUT_1.15)(64bit) \
libinput.so.10(LIBINPUT_1.19)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libinput.so.10(LIBINPUT_1.3)(64bit) \
libinput.so.10(LIBINPUT_1.4)(64bit) \
libinput.so.10(LIBINPUT_1.5)(64bit) \
libinput.so.10(LIBINPUT_1.7)(64bit) \
libinput.so.10(LIBINPUT_1.9)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_213)(64bit) \
libsystemd.so.0(LIBSYSTEMD_226)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-res.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbfile.so.1()(64bit) \
typelib(Atk) \
typelib(GDesktopEnums) \
typelib(GL) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Graphene) \
typelib(HarfBuzz) \
typelib(Json) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2) \
typelib(xfixes) \
typelib(xlib)"

inherit rpm
