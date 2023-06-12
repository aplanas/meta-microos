SUMMARY = "Visual diff and merge tool"
DESCRIPTION = "Meld is a visual diff and merge tool. Two or three files can be \
compared and be edited in place. (The diffs update dynamically). Two \
or three directories can be compared and file comparisons be launched. \
The working copy directory from version control systems such as CVS, \
Subversion, Bazaar-ng and Mercurial can be browsed and viewed."
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "meld-3.22.0-1.2.noarch.rpm"
RPM_HASH = "9b97a5fd3295bfd1bca3692dec02e47e77a973766d495f9c2670de786c4b87cc7444ed5a47f676d3b9684081ef658a43394d25a0b43785304e84369eb8817873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.gnome.Meld.desktop) \
meld \
metainfo() \
metainfo(org.gnome.Meld.appdata.xml) \
mimehandler(application/x-meld-comparison)"
RDEPENDS:${PN} += "/usr/bin/python3 \
patch \
python(abi) \
python3-cairo \
python3-gobject-Gdk \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(Pango)"

inherit rpm
