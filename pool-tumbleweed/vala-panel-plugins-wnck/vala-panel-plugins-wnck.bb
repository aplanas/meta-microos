SUMMARY = "Plugins for vala-panel -- X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains X11 plugins for vala-panel: tasklist, \
system tray, and others."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-wnck-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "21628f9ced90821d7313ef600ad04093e45be944d47af6806845f6e545c26c8db8d05b96184372f2b61bcef13ab89a4d25ae74c0264e64894104c14f5bd8dc49"

RPROVIDES:${PN} += "libbuttons.so \
libdeskno.so \
libnetmon.so \
libpager.so \
libtasklist-xfce.so \
libwincmd.so \
vala-panel-plugins-wnck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libvalapanel.so.0 \
libwnck-3.so.0"

inherit rpm
