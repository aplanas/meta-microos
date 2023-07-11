SUMMARY = "Workspace Wallpaper applet"
DESCRIPTION = "Budgie Wallpaper Workspace Switcher is an application (applet) to show a different wallpaper on each of the workspaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-workspace-wallpaper-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "b911f595d5e81e50ad14a7d6cce4f03e78cde4bcdbc2d28877931e8d7b585d18d014f64af69ee5be9b108da10f462426002ebe3bcad62d16a5889081e834e890"

RPROVIDES:${PN} += "budgie-workspace-wallpaper-applet \
libwallpaperswitcher.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
