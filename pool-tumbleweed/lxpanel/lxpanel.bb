SUMMARY = "Lightweight X11 desktop panel based on fbpanel"
DESCRIPTION = "LXPanel is a lightweight X11 desktop panel containing: \
1. User-friendly application menu automatically generated from *.desktop files on the system \
2. Launcher bar (Small icons clicked to launch apps) \
3. Task bar supporting urgency hint (Can flash when gaim gets new incoming messages) \
4. Notification area (System tray) \
5. Digital clock \
6. Run dialog (A dialog lets you type a command and run it, can be called in external programs) \
7. Net status icon plug-in (optional, ported from gnome-netstatus-applet) \
8. Volume control plug-in (optional, written by jserv) \
9. lxpanelctl, an external controller lets you control lxpanel in other programs. \
For example, 'lxpanelctl run' will show the Run dialog in lxpanel, and 'lxpanelctl menu' \
will show the application menu. This is useful in key bindings provided by window managers."
LICENSE = "GPL-2.0-only"

PV = "0.10.1"

RPM_NAME = "lxpanel-0.10.1-1.11.aarch64.rpm"
RPM_HASH = "1c772aa134a37783dc4d6ec8b8013a75d5673f3d0d3a05d4c50ee1e35f6985aa3c5fe7d9d3f9303633f6223b3979aaf65cf7a15c62b511ddd02c42fae4ca800d"

RPROVIDES:${PN} += "config-lxpanel \
lxpanel \
lxpanel-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfm-gtk.so.4 \
libfm.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libiw.so.30 \
libkeybinder.so.0 \
liblxpanel.so.0 \
libm.so.6 \
libmenu-cache.so.3 \
libwnck-1.so.22 \
libxml2.so.2 \
lxmenu-data \
menu-cache"

inherit rpm
