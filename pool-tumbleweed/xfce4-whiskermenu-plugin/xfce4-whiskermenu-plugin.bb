SUMMARY = "Alternate Xfce Menu"
DESCRIPTION = "Whisker Menu is an alternate application launcher for Xfce. When \
opened, it shows a list of applications marked as favorites. \
Installed applications can be browsed by clicking on the category \
buttons on the side. Whisker Menu keeps a list of most recent used \
applications launched from it."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.3"

RPM_NAME = "xfce4-whiskermenu-plugin-2.7.3-1.2.aarch64.rpm"
RPM_HASH = "df30e59a59119b145fddfda030888435037037337baa9c5aed436286710322fe617928a89c86495e0e72fdaf52e65a5484ed13454662796ea73f63f319dba132"

RPROVIDES:${PN} += "libwhiskermenu.so \
xfce4-panel-plugin-whiskermenu \
xfce4-whiskermenu-plugin"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libexo-2.so.0 \
libgarcon-1.so.0 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstdc++.so.6 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
