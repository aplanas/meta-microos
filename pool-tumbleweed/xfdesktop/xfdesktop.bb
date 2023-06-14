SUMMARY = "Desktop Manager for the Xfce Desktop Environment"
DESCRIPTION = "Xfdesktop is a desktop manager for the Xfce Desktop Environment which can set \
the background image, provides a right-click menu to launch applications and \
can optionally show files (including application launchers) or iconified \
windows, includes gradient support for background color, saturation support for \
background images, as well as real multiscreen and xinerama support."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-4.18.1-1.3.aarch64.rpm"
RPM_HASH = "cb9da39c6b5e1cf67961a96b18e7094b0fbf1c205cad69da6ff334c4d19ea5490e69f8f8d9918823c6247606d17b15ef57f500ddc76a0375dab5aa1f361d7f0d"

RPROVIDES:${PN} += "xfce4-desktop \
xfdesktop"

RDEPENDS:${PN} += "exo-tools \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexo-2.so.0 \
libgarcon-1.so.0 \
libgarcon-data \
libgarcon-gtk3-1.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libthunarx-3.so.0 \
libwnck-3.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfdesktop-branding"

inherit rpm
