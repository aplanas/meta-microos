SUMMARY = "Base multiload-ng package"
DESCRIPTION = "Multiload-ng is a modern graphical system monitor. It's a near-complete rewrite of the good old GNOME multiload applet, that aims to support every existing panel. \
 \
It supports the following panels: \
[] XFCE (xfce4-panel) \
[x] LXDE (lxpanel) \
[x] MATE (mate-panel) \
[x] Ubuntu Unity (through libappindicator) \
[] Every panel with support for Application Indicators \
[] System tray (virtually any panel with a systray, in particular those without external plugins support, like tint2) \
[] Standalone (has its own window, not embedded in any panel) \
[x] Avant Window Navigator (EXPERIMENTAL) \
 \
Multiload-ng can be built with GTK2 and GTK3, so can be embedded within GTK2/GTK3 builds of all the panels above."
LICENSE = "GPL-2.0+"

PV = "git20210103.743885d"

RPM_NAME = "multiload-ng-base-git20210103.743885d-1.8.aarch64.rpm"
RPM_HASH = "994134d368067236149c8de26b6d4d501014cb7c6f9df03d985f1b9afc598654c7a43f6ea7e8aec78240a16ce343a5ad11d373f41bcd3e1289356f8e35c7003b"

RPROVIDES:${PN} += "multiload-ng-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
