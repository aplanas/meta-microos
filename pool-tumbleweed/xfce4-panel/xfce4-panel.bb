SUMMARY = "Panel for the Xfce Desktop Environment"
DESCRIPTION = "xfce4-panel is the panel for the Xfce desktop environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "xfce4-panel-4.18.4-1.1.aarch64.rpm"
RPM_HASH = "95325ff776c16c5772b601622e000ed9f42faa21a0bb2d6453f3ff143c87613e99761f80e07a64c74ff98460f37f9ec9a14bf5450a55d619dc30d77b41c863a6"

RPROVIDES:${PN} += "libactions.so \
libapplicationsmenu.so \
libclock.so \
libdirectorymenu.so \
liblauncher.so \
libpager.so \
libseparator.so \
libshowdesktop.so \
libsystray.so \
libtasklist.so \
libwindowmenu.so \
xfce4-panel \
xfce4-panel-doc \
xfce4-panel-plugins \
xfce4-statusnotifier-plugin \
xfce4-statusnotifier-plugin-lang"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbusmenu-gtk3.so.4 \
libexo-2.so.0 \
libgarcon-1.so.0 \
libgarcon-gtk3-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
typelib-AppIndicator3 \
xfce4-panel-branding"

inherit rpm
