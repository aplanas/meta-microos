SUMMARY = "GTK+ application for controlling CDEmu daemon"
DESCRIPTION = "It provides a graphic interface that allows performing the key \
tasks related to controlling the CDEmu daemon, such as loading and \
unloading devices, displaying devices' status and \
retrieving/setting devices' debug masks. \
 \
In addition, the application listens to signals emitted by \
CDEmu daemon and provides notifications via libnotify (provided \
that python bindings are installed). \
 \
Features: \
 * GTK+ application. \
 * Supports communication via either session or system bus. \
 * Device status display, device loading and unloading. \
 * Support for getting/setting device's debug masks. \
 * Daemon and device status changes notification via libnotify."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "gcdemu-3.2.6-1.4.noarch.rpm"
RPM_HASH = "b42bb800c2386c64a00de93b0082a290bc4135e011cabe285a330dc0dce650abfe244cfea99e289f197276f282f2aa01c9f045cb8a976602028963d6a35f78c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcdemu"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
cdemu-daemon \
python3-gobject-Gdk \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify"

inherit rpm
