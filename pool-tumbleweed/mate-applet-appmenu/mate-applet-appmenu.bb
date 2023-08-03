SUMMARY = "AppMenu (Global Menu) plugin for mate-panel"
DESCRIPTION = "This is Global Menu plugin for using with MATE Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "mate-applet-appmenu-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "f7622b88c36e5bf49185d727459b2e6a290e1f7049c39d7233ba70c4f6aec291c8f95476343fc40e7d59eb7988e96b71eb98a1300e1911f4d1a4f1f707f79206"

RPROVIDES:${PN} += "libappmenu-mate.so \
mate-applet-appmenu \
mate-vala-penel-appmenu-plugin"

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
libmate-panel-applet-4.so.1 \
libwnck-3.so.0 \
mate-panel"

inherit rpm
