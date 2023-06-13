SUMMARY = "Panel for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-panel is the panel for the Xfce desktop environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "95325ff776c16c5772b601622e000ed9f42faa21a0bb2d6453f3ff143c87613e99761f80e07a64c74ff98460f37f9ec9a14bf5450a55d619dc30d77b41c863a6"

RPROVIDES:${PN} += "application() \
application(panel-desktop-handler.desktop) \
application(panel-preferences.desktop) \
libactions.so()(64bit) \
libapplicationsmenu.so()(64bit) \
libclock.so()(64bit) \
libdirectorymenu.so()(64bit) \
liblauncher.so()(64bit) \
libpager.so()(64bit) \
libseparator.so()(64bit) \
libshowdesktop.so()(64bit) \
libsystray.so()(64bit) \
libtasklist.so()(64bit) \
libwindowmenu.so()(64bit) \
mimehandler(application/x-desktop) \
xfce4-panel \
xfce4-panel(aarch-64) \
xfce4-panel-doc \
xfce4-panel-plugins \
xfce4-statusnotifier-plugin \
xfce4-statusnotifier-plugin-lang"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbusmenu-gtk3.so.4()(64bit) \
libexo-2.so.0()(64bit) \
libgarcon-1.so.0()(64bit) \
libgarcon-gtk3-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
typelib(AppIndicator3) \
xfce4-panel-branding"

inherit rpm
