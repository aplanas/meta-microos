SUMMARY = "Desktop Manager for the Xfce Desktop Environment"
DESCRIPTION = "Xfdesktop is a desktop manager for the Xfce Desktop Environment which can set \
the background image, provides a right-click menu to launch applications and \
can optionally show files (including application launchers) or iconified \
windows, includes gradient support for background color, saturation support for \
background images, as well as real multiscreen and xinerama support."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-4.18.1-1.4.aarch64.rpm"
RPM_HASH = "ee00e4cb83ee9d4583942a8b0073582a8009bc501b0ce58e5f7fa2fb4101b947f4965183fdd7227c1bde6996b3201914aa72805e049e4e5474c12a6875140462"

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
