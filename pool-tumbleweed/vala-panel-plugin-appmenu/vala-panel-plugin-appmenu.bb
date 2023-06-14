SUMMARY = "AppMenu (Global Menu) plugin for vala-panel"
DESCRIPTION = "This is Global Menu plugin for using with Vala Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "vala-panel-plugin-appmenu-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "e881897ddbe989330f5a87e97e67bb76dea0648cf1e3695b9ad27fb58fae68bdd567c23e07bf4ab3dd2ee7e5b280571ec47cc22add4bbadf3072389f26aa934d"

RPROVIDES:${PN} += "libappmenu.so \
vala-panel-appmenu \
vala-panel-plugin-appmenu"

RDEPENDS:${PN} += "/bin/sh \
appmenu-gtk2-module \
appmenu-gtk3-module \
appmenu-registrar \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libvalapanel.so.0 \
libwnck-3.so.0 \
vala-panel"

inherit rpm
