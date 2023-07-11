SUMMARY = "Visual diff and merge tool"
DESCRIPTION = "Meld is a visual diff and merge tool. Two or three files can be \
compared and be edited in place. (The diffs update dynamically). Two \
or three directories can be compared and file comparisons be launched. \
The working copy directory from version control systems such as CVS, \
Subversion, Bazaar-ng and Mercurial can be browsed and viewed."
LICENSE = "GPL-2.0-or-later"

PV = "3.22.0"

RPM_NAME = "meld-3.22.0-1.3.noarch.rpm"
RPM_HASH = "9578d0a538338172549d672e4463e636937e4256b5a72c1c835b4e539384728f30b6a7e75a3e99829cac109b02dfe8e3cb646454ef3164ba568958fa2b65c407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meld"

RDEPENDS:${PN} += "/usr/bin/python3 \
patch \
python-abi \
python3-cairo \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango"

inherit rpm
