SUMMARY = "A Desktop Wiki"
DESCRIPTION = "Zim is a graphical text editor used to maintain a collection of wiki \
pages. Each page can contain links to other pages, simple formatting and \
images. Pages are stored in a folder structure, like in an outliner, and \
can have attachments. Creating a new page is as easy as linking to a \
nonexistent page. All data is stored in plain text files with wiki \
formatting. Various plugins provide additional functionality, like a \
task list manager, an equation editor, a tray icon, and support for \
version control."
LICENSE = "GPL-2.0-or-later"

PV = "0.75.1"

RPM_NAME = "zim-0.75.1-2.3.noarch.rpm"
RPM_HASH = "d7aa107e173a5959841eca273f750eacc14c3e52f6e92815a8a5a136aa9b22c760cfa79bf596f20cbc60af2e201d02e6da824afa72db48241fe8d8cf2b31187b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zim \
python3dist-zim \
zim"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
python3-pyxdg \
typelib-1-0-Gtk-3-0 \
xdg-utils"

inherit rpm
