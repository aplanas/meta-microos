SUMMARY = "Tools for Managing Xfce Settings"
DESCRIPTION = "This package provides a number of tools for managing settings in the Xfce \
desktop environment."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-settings-4.18.3-1.1.aarch64.rpm"
RPM_HASH = "8fa2ecff426c76d989d0dfdf5a705e048936ceed42e07a9b8de8b775501884ab30187909b1654731f87553415050561f4e943c75124a1e669f291c1a001bc04d"

RPROVIDES:${PN} += "xfce-mcs-manager \
xfce-mcs-plugins \
xfce4-settings"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
