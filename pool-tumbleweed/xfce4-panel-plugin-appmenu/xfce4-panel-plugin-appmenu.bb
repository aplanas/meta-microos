SUMMARY = "AppMenu (Global Menu) plugin for xfce4-panel"
DESCRIPTION = "This is Global Menu plugin for using with Xfce Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "xfce4-panel-plugin-appmenu-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "f1ff226261c0ff0d43435e5f06d2aa50824da4bbb151a2e146e088ed9e29e33051c2cf90c3ff46584954187489d759cc7730ccfaf938142900760a5202c059f0"

RPROVIDES:${PN} += "libappmenu-xfce.so \
xfce4-panel-plugin-appmenu \
xfce4-vala-panel-appmenu-plugin"

RDEPENDS:${PN} += "appmenu-gtk2-module \
appmenu-gtk3-module \
appmenu-registrar \
bamf-daemon \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwnck-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
