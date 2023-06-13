SUMMARY = "GNOME Shell"
DESCRIPTION = "The GNOME Shell redefines user interactions with the GNOME desktop. In \
particular, it offers new paradigms for launching applications, accessing \
documents, and organizing open windows in GNOME."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-44.1-1.1.aarch64.rpm"
RPM_HASH = "9ae390a5995e2de1339417886a81aca5c09316d76e496065d67fcd881255f06ee6ffe98337b670f88a6d5627f7f875683d65a070eb9cbd94db7c54e725a25078"

RPROVIDES:${PN} += "application() \
application(org.gnome.Shell.Extensions.desktop) \
application(org.gnome.Shell.PortalHelper.desktop) \
application(org.gnome.Shell.desktop) \
dbus(org.freedesktop.Notifications) \
gnome-shell \
gnome-shell(aarch-64) \
libgnome-shell-menu.so()(64bit) \
libgvc.so()(64bit) \
libshell-12.so()(64bit) \
libshew-0.so()(64bit) \
libst-12.so()(64bit) \
typelib(Gvc) \
typelib(Shell) \
typelib(Shew) \
typelib(St)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
gdk-pixbuf-loader-rsvg \
gnome-control-center \
gnome-session \
gnome-settings-daemon \
gnome-themes-accessibility \
gsettings-desktop-schemas \
gstreamer-plugin-pipewire \
ld-linux-aarch64.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libatk-1.0.so.0()(64bit) \
libatk-bridge-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcr-4.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libgjs.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-autoar-0.so.0()(64bit) \
libgnome-desktop-4.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libmutter-12.so.0()(64bit) \
libmutter-clutter-12.so.0()(64bit) \
libmutter-cogl-12.so.0()(64bit) \
libmutter-cogl-pango-12.so.0()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_4_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libpulse-mainloop-glib.so.0()(64bit) \
libpulse-mainloop-glib.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libsecret-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
mutter \
typelib(AccountsService) \
typelib(Adw) \
typelib(Atk) \
typelib(Atspi) \
typelib(Cally) \
typelib(GDesktopEnums) \
typelib(GL) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(GWeather) \
typelib(Gck) \
typelib(Gcr) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gdm) \
typelib(Geoclue) \
typelib(Gio) \
typelib(GnomeBG) \
typelib(GnomeBluetooth) \
typelib(GnomeDesktop) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gst) \
typelib(Gtk) \
typelib(Gvc) \
typelib(HarfBuzz) \
typelib(IBus) \
typelib(Json) \
typelib(Malcontent) \
typelib(NM) \
typelib(NMA4) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Polkit) \
typelib(PolkitAgent) \
typelib(Rsvg) \
typelib(Shell) \
typelib(Shew) \
typelib(Soup) \
typelib(TelepathyGLib) \
typelib(TelepathyLogger) \
typelib(UPowerGlib) \
typelib(cairo) \
typelib(freetype2) \
typelib(xfixes) \
typelib(xlib)"

inherit rpm
