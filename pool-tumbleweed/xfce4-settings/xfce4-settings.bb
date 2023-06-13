SUMMARY = "Tools for Managing Xfce Settings"
DESCRIPTION = "This package provides a number of tools for managing settings in the Xfce \
desktop environment."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-4.18.2-1.3.aarch64.rpm"
RPM_HASH = "199d83b4500689a537ba90769a630ddf56b6a01dd5d527abbaee0e8426f0d0d070a2357be3ff214cdc87a9a49d90608cc234c4abb85359da35b0c860d55b321f"

RPROVIDES:${PN} += "application() \
application(xfce-display-settings.desktop) \
application(xfce-keyboard-settings.desktop) \
application(xfce-mouse-settings.desktop) \
application(xfce-settings-manager.desktop) \
application(xfce-ui-settings.desktop) \
application(xfce4-accessibility-settings.desktop) \
application(xfce4-file-manager.desktop) \
application(xfce4-mail-reader.desktop) \
application(xfce4-mime-settings.desktop) \
application(xfce4-settings-editor.desktop) \
application(xfce4-terminal-emulator.desktop) \
application(xfce4-web-browser.desktop) \
xfce-mcs-manager \
xfce-mcs-plugins \
xfce4-settings \
xfce4-settings(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXi.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libgarcon-1.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxfce4kbd-private-3.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
libxklavier.so.16()(64bit) \
xfce4-settings-branding"

inherit rpm
