SUMMARY = "Plugins for vala-panel -- non-X11 plugins"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This package contains main plugins for vala-panel: clock, \
launchbar, applications menu and so on."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-plugins-base-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "51117e59ae4c4b01090d8086790f71bdccb9abd6a4155102d1fdf5f863eb100c9613030f5fc5989691518514be961e56a15a994865f2cbe83e178028019f32dd"

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
