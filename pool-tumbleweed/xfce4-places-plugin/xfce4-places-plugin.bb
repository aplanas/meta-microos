SUMMARY = "Places Menu Plugin for the Xfce Panel"
DESCRIPTION = "The Places plugin provides a menu with quick access to folders, \
documents, and removable media."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.2"

RPM_NAME = "xfce4-places-plugin-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "cd67e275d08bd99b82001285d77add077d8d2c8ac876cfb17ed2b70120db09590dc3008ef0f66b114f470c3f9cef67abaa00c2f54265cead60349bce911e3772"

RPROVIDES:${PN} += "libplaces.so()(64bit) \
xfce4-panel-plugin-places \
xfce4-places-plugin \
xfce4-places-plugin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libexo-2.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-panel"

inherit rpm
