SUMMARY = "Plugins for vala-panel -- non-X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains main plugins for vala-panel: clock, \
launchbar, applications menu and so on."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-base-0.5.0-1.6.aarch64.rpm"
RPM_HASH = "f40a1a134c711a68b1eff34a8a8c8cf4fee8924e6d9797a1781c12e85baf07b1b71038902775b3bced97b7ba233913bc7c0598384a58c0151dcf0ed2c0633742"

RPROVIDES:${PN} += "libclock.so \
libcpu.so \
libdirmenu.so \
libkbled.so \
liblaunchbar.so \
libmenumodel.so \
libmonitors.so \
libseparator.so \
vala-panel-plugins-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libvalapanel.so.0"

inherit rpm
