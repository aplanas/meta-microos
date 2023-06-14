SUMMARY = "Places Menu Plugin for the Xfce Panel"
DESCRIPTION = "The Places plugin provides a menu with quick access to folders, \
documents, and removable media."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "xfce4-places-plugin-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "cd67e275d08bd99b82001285d77add077d8d2c8ac876cfb17ed2b70120db09590dc3008ef0f66b114f470c3f9cef67abaa00c2f54265cead60349bce911e3772"

RPROVIDES:${PN} += "libplaces.so \
xfce4-panel-plugin-places \
xfce4-places-plugin"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexo-2.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
