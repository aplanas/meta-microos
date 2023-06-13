SUMMARY = "AppMenu (Global Menu) plugin for mate-panel"
DESCRIPTION = "This is Global Menu plugin for using with MATE Panel."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "mate-applet-appmenu-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "0b93535c7cbd27e3368fb231dac774046c7ce401a0e22300a3464ec28b819660e37d4583738acc18a9cbcc8f54ca7f611652dd7315d5c5302e6173a787894dc9"

RPROVIDES:${PN} += "libappmenu-mate.so()(64bit) \
mate-applet-appmenu \
mate-applet-appmenu(aarch-64) \
mate-vala-penel-appmenu-plugin"

RDEPENDS:${PN} += "appmenu-gtk2-module \
appmenu-gtk3-module \
appmenu-registrar \
bamf-daemon \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libwnck-3.so.0()(64bit) \
mate-panel"

inherit rpm
