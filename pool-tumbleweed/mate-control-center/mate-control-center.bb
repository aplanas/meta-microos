SUMMARY = "MATE Desktop control center"
DESCRIPTION = "The control center is MATE's main interface for configuration of various \
aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-control-center-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "551b8f00540c82c22be2c851a2b3dba884d0db0fb5f2161ffa579e093bf6d582d9ee259d11dda9d083c726879a9ba57668b499892840ce8e1a83786911a77ec7"

RPROVIDES:${PN} += "application() \
application(mate-about-me.desktop) \
application(mate-appearance-properties.desktop) \
application(mate-at-properties.desktop) \
application(mate-default-applications-properties.desktop) \
application(mate-display-properties.desktop) \
application(mate-font-viewer.desktop) \
application(mate-keybinding.desktop) \
application(mate-keyboard.desktop) \
application(mate-network-properties.desktop) \
application(mate-settings-mouse.desktop) \
application(mate-theme-installer.desktop) \
application(mate-time-admin.desktop) \
application(mate-window-properties.desktop) \
application(matecc.desktop) \
libmarco.so()(64bit) \
mate-control-center \
mate-control-center(aarch-64) \
mimehandler(application/x-font-otf) \
mimehandler(application/x-font-pcf) \
mimehandler(application/x-font-ttf) \
mimehandler(application/x-font-type1) \
mimehandler(application/x-mate-theme-package)"

RDEPENDS:${PN} += "gsettings-backend-dconf \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXi.so.6()(64bit) \
libXss.so.1()(64bit) \
libappindicator3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcanberra.so.0()(64bit) \
libdconf.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmarco-private.so.2()(64bit) \
libmate-desktop-2.so.17()(64bit) \
libmate-slab.so.0()(64bit) \
libmate-window-settings.so.1()(64bit) \
libmatekbd.so.4()(64bit) \
libmatekbdui.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
libxklavier.so.16()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
mate-control-center-branding"

inherit rpm
