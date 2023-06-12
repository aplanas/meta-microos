SUMMARY = "Cinnamon screensaver and locker"
DESCRIPTION = "cinnamon-screensaver is a screensaver and locker that aims to have \
simple, sane and secure defaults, and be well integrated with the \
Cinnamon Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.3"

RPM_NAME = "cinnamon-screensaver-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "b6dc1e9bca1e74a788e93f6b4f9e240c6fd137ae07f100165a2008d971a6bca2ab230f93c64acbaf8fcdc15a34b8a3d09e24cc3b2e749e0e6d11ccf6aa04179c"

RPROVIDES:${PN} += "application() \
application(org.cinnamon.ScreenSaver.desktop) \
cinnamon-screensaver \
cinnamon-screensaver(aarch-64) \
libcscreensaver.so.0()(64bit) \
typelib(CScreensaver)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
iso-country-flags-png \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libxdo.so.3()(64bit) \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-setproctitle \
python3-xapp \
typelib(AccountsService) \
typelib(Atk) \
typelib(CDesktopEnums) \
typelib(Caribou) \
typelib(CinnamonDesktop) \
typelib(Cvc) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(XApp) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
