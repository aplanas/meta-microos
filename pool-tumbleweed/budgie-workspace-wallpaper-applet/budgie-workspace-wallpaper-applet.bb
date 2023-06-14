SUMMARY = "Workspace Wallpaper applet"
DESCRIPTION = "Budgie Wallpaper Workspace Switcher is an application (applet) to show a different wallpaper on each of the workspaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-workspace-wallpaper-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "8cc808964d588c33a4da29c0339652c9bef395a70e01e65882bd198eaf08022301f92b0e6624c7ba7e38228dd7dfdfa0f36ec637c77aa620d3b11f5f47215412"

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
