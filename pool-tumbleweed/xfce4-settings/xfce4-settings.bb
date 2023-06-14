SUMMARY = "Tools for Managing Xfce Settings"
DESCRIPTION = "This package provides a number of tools for managing settings in the Xfce \
desktop environment."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-settings-4.18.2-1.3.aarch64.rpm"
RPM_HASH = "199d83b4500689a537ba90769a630ddf56b6a01dd5d527abbaee0e8426f0d0d070a2357be3ff214cdc87a9a49d90608cc234c4abb85359da35b0c860d55b321f"

RPROVIDES:${PN} += "xfce-mcs-manager \
xfce-mcs-plugins \
xfce4-settings"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXi.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libfontconfig.so.1 \
libgarcon-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxfce4kbd-private-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
libxklavier.so.16 \
xfce4-settings-branding"

inherit rpm
