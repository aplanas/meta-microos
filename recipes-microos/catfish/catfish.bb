SUMMARY = "Versatile File Searching Tool"
DESCRIPTION = "Catfish is a GTK+ search utility written in python. Its search is powered by \
/usr/bin/find and /usr/bin/locate, with search suggestions provided by \
zeitgeist."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.4"

RPM_NAME = "catfish-4.16.4-1.3.noarch.rpm"
RPM_HASH = "e1667255db0456ca3f8b2902499c1c3706677e38817d025bd745dd1fa428f6f1bacaf03774f50e0dd8a0f9f32d1949870792a00d73127be4172229c1203fa3cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.xfce.Catfish.desktop) \
catfish \
metainfo() \
metainfo(catfish.appdata.xml) \
mimehandler(inode/directory) \
python3.10dist(catfish) \
python3dist(catfish)"
RDEPENDS:${PN} += "/usr/bin/python3 \
findutils-locate \
gdk-pixbuf-loader-rsvg \
gsettings-backend-dconf \
python(abi) \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-xml \
sudo \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(Xfconf)"

inherit rpm
