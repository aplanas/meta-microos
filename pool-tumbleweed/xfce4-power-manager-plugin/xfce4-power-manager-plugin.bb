SUMMARY = "Xfce Panel Plugin for Monitoring Batteries and Changing the Display Brightness"
DESCRIPTION = "This package provides a plugin for the Xfce panel for monitoring battery and \
device charge levels and to regulate display brightness."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.2"

RPM_NAME = "xfce4-power-manager-plugin-4.18.2-1.1.aarch64.rpm"
RPM_HASH = "0911baa777929696e9f3334a955492221959e33b7d9b5e4d7c984160b317ffc92c010f7b736e2a4fccfd68315c011675e820c28ca624b8c491df95fde63e2a85"

RPROVIDES:${PN} += "libxfce4powermanager.so \
xfce4-panel-plugin-brightness \
xfce4-panel-plugin-power-manager \
xfce4-panel-plugin-xfce4battery \
xfce4-power-manager-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libupower-glib.so.3 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel \
xfce4-power-manager"

inherit rpm
