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

RPM_NAME = "mate-tweak-22.10.0-1.1.noarch.rpm"
RPM_HASH = "9955b4359828d8454ea85a122ca7f3b581cb4ef3f62b35cf4b826d59cedf4f5616b746f61e912f7b278b8c0af258450b017997165004b715b9bb4d26cc746c30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(marco-glx.desktop) \
application(marco-no-composite.desktop) \
application(marco-xr_glx_hybrid.desktop) \
application(marco-xrender.desktop) \
application(mate-tweak.desktop) \
mate-tweak \
python3.10dist(mate-tweak) \
python3dist(mate-tweak)"

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
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(Notify) \
xdg-utils"

inherit rpm
