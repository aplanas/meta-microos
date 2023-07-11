SUMMARY = "MATE desktop tweak tool"
DESCRIPTION = "Configures some aspects of the MATE desktop not exposed via the \
MATE Control Centre applets. \
 \
Settings that can be handled via MATE Tweak: \
 * Show/hide standard desktop icons. \
 * Panel fine-tuning (icon visibility, in menus and on buttons, \
   icon size, button labelling, contex menus, etc.). \
 * Window manager fine-tuning."
LICENSE = "GPL-2.0-or-later"

PV = "22.10.0"

RPM_NAME = "mate-tweak-22.10.0-1.2.noarch.rpm"
RPM_HASH = "01bf5942515b363b167512a4bbf6b9d59843125396b6a56c5a5485a4b137f98f6fa539c5462311942c77b82f143044d25b17e29b01fb31b9981f3a07ede85fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-tweak \
python3.11dist-mate-tweak \
python3dist-mate-tweak"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
Mesa-demo-x \
dconf \
mate-panel \
python3-configobj \
python3-distro \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
python3-setproctitle \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
xdg-utils"

inherit rpm
