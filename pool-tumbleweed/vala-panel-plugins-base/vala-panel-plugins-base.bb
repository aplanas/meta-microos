SUMMARY = "Plugins for vala-panel -- non-X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains main plugins for vala-panel: clock, \
launchbar, applications menu and so on."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-base-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "f40a1a134c711a68b1eff34a8a8c8cf4fee8924e6d9797a1781c12e85baf07b1b71038902775b3bced97b7ba233913bc7c0598384a58c0151dcf0ed2c0633742"

RPROVIDES:${PN} += "libclock.so()(64bit) \
libcpu.so()(64bit) \
libdirmenu.so()(64bit) \
libkbled.so()(64bit) \
liblaunchbar.so()(64bit) \
libmenumodel.so()(64bit) \
libmonitors.so()(64bit) \
libseparator.so()(64bit) \
vala-panel-plugins-base \
vala-panel-plugins-base(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libvalapanel.so.0()(64bit)"

inherit rpm
