SUMMARY = "Plugins for vala-panel -- X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains X11 plugins for vala-panel: tasklist, \
system tray, and others."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-wnck-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "21628f9ced90821d7313ef600ad04093e45be944d47af6806845f6e545c26c8db8d05b96184372f2b61bcef13ab89a4d25ae74c0264e64894104c14f5bd8dc49"

RPROVIDES:${PN} += "libbuttons.so()(64bit) \
libdeskno.so()(64bit) \
libnetmon.so()(64bit) \
libpager.so()(64bit) \
libtasklist-xfce.so()(64bit) \
libwincmd.so()(64bit) \
vala-panel-plugins-wnck \
vala-panel-plugins-wnck(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libvalapanel.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
