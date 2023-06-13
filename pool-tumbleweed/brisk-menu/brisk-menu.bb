SUMMARY = "Modern, efficient menu for MATE"
DESCRIPTION = "Modern, efficient menu for the MATE Desktop Environment."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-4.0"

PV = "0.6.2"

RPM_NAME = "brisk-menu-0.6.2-1.13.aarch64.rpm"
RPM_HASH = "0a9183067bad3093081a1c1eefbf13dcc862968ec15a079457aac51e777a75c10e6fdf949f3b9e7b85a086b1285937642433adc405876cd3f1db474fb6d344fc"

RPROVIDES:${PN} += "brisk-menu \
brisk-menu(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libmate-menu.so.2()(64bit) \
libmate-panel-applet-4.so.1()(64bit) \
libnotify.so.4()(64bit)"

inherit rpm
