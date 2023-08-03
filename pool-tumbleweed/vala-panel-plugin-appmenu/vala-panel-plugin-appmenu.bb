SUMMARY = "AppMenu (Global Menu) plugin for vala-panel"
DESCRIPTION = "This is Global Menu plugin for using with Vala Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "vala-panel-plugin-appmenu-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "61e5e3748760af5069356623e6e4ad699f4eb34e7d5a4e91728e52a13d0d08d17d8f24f2e7225040eeaee397b4618fd733cac9ea4090478cbf0a29f818f6afd0"

RPROVIDES:${PN} += "libappmenu.so \
vala-panel-appmenu \
vala-panel-plugin-appmenu"

RDEPENDS:${PN} += "/usr/bin/sh \
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
