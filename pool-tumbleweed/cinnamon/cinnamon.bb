SUMMARY = "GNU/Linux Desktop featuring a traditional layout"
DESCRIPTION = "Cinnamon is a modern Linux desktop which provides advanced innovative \
features and a traditional user experience. It's easy to use, \
powerful and flexible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.7"

RPM_NAME = "cinnamon-5.2.7-2.7.aarch64.rpm"
RPM_HASH = "07f4ed7c4361fcc8af18b31f9aede5dba9e4514221114854c35f1f48c3211de5bf2e76a23c9226395deac3109bec4b61c76dd58f88767e595a831a6e83ad7249"

RPROVIDES:${PN} += "application() \
application(cinnamon-killer-daemon.desktop) \
application(cinnamon-menu-editor.desktop) \
application(cinnamon-onscreen-keyboard.desktop) \
application(cinnamon-settings-applets.desktop) \
application(cinnamon-settings-backgrounds.desktop) \
application(cinnamon-settings-calendar.desktop) \
application(cinnamon-settings-default.desktop) \
application(cinnamon-settings-desklets.desktop) \
application(cinnamon-settings-desktop.desktop) \
application(cinnamon-settings-effects.desktop) \
application(cinnamon-settings-extensions.desktop) \
application(cinnamon-settings-fonts.desktop) \
application(cinnamon-settings-general.desktop) \
application(cinnamon-settings-hotcorner.desktop) \
application(cinnamon-settings-info.desktop) \
application(cinnamon-settings-keyboard.desktop) \
application(cinnamon-settings-mouse.desktop) \
application(cinnamon-settings-notifications.desktop) \
application(cinnamon-settings-online-accounts.desktop) \
application(cinnamon-settings-panel.desktop) \
application(cinnamon-settings-power.desktop) \
application(cinnamon-settings-privacy.desktop) \
application(cinnamon-settings-screensaver.desktop) \
application(cinnamon-settings-sound.desktop) \
application(cinnamon-settings-startup.desktop) \
application(cinnamon-settings-themes.desktop) \
application(cinnamon-settings-tiling.desktop) \
application(cinnamon-settings-universal-access.desktop) \
application(cinnamon-settings-user.desktop) \
application(cinnamon-settings-users.desktop) \
application(cinnamon-settings-windows.desktop) \
application(cinnamon-settings-workspaces.desktop) \
application(cinnamon-settings.desktop) \
application(cinnamon.desktop) \
application(cinnamon2d.desktop) \
cinnamon \
cinnamon(aarch-64) \
cinnamon-2d \
cinnamon-menu-editor \
cinnamon-settings \
config(cinnamon) \
libcinnamon.so()(64bit) \
libst.so()(64bit) \
typelib(Cinnamon) \
typelib(St) \
typelib-1_0-Cinnamon-0_1"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
NetworkManager-applet \
adwaita-icon-theme \
cinnamon-control-center-common \
cinnamon-gschemas \
cinnamon-screensaver \
cinnamon-session \
cinnamon-settings-daemon \
cjs \
cups-pk-helper \
dbus-1 \
gettext-runtime \
glib2-tools \
gnomekbd-tools \
iso-country-flags-png \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libatk-1.0.so.0()(64bit) \
libatk-bridge-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcinnamon-desktop-data \
libcinnamon-menu-3.so.0()(64bit) \
libcjs.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmuffin-clutter-0.so()(64bit) \
libmuffin-cogl-0.so()(64bit) \
libmuffin-cogl-pango-0.so()(64bit) \
libmuffin-cogl-path-0.so()(64bit) \
libmuffin.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
muffin \
nemo \
pkgconfig \
polkit-gnome \
python(abi) \
python3-Pillow \
python3-cairo \
python3-dbus-python \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-pyinotify \
python3-python-pam \
python3-pytz \
python3-tinycss2 \
typelib(AccountsService) \
typelib(Atk) \
typelib(CDesktopEnums) \
typelib(CMenu) \
typelib(Caribou) \
typelib(CinnamonDesktop) \
typelib(Clutter) \
typelib(ClutterX11) \
typelib(Cogl) \
typelib(CoglPango) \
typelib(Cvc) \
typelib(ECal) \
typelib(EDataServer) \
typelib(GIRepository) \
typelib(GL) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(ICal) \
typelib(ICalGLib) \
typelib(Json) \
typelib(Keybinder) \
typelib(Meta) \
typelib(NM) \
typelib(NMA) \
typelib(Nemo) \
typelib(Notify) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Soup) \
typelib(TimezoneMap) \
typelib(UPowerGlib) \
typelib(XApp) \
typelib(cairo) \
typelib(freetype2) \
typelib(xfixes) \
typelib(xlib) \
update-alternatives \
v4l-tools \
wget \
xdg-user-dirs \
xdg-user-dirs-gtk"

inherit rpm
