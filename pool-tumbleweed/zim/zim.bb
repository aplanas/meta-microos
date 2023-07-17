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

PV = "0.75.2"

RPM_NAME = "zim-0.75.2-1.1.noarch.rpm"
RPM_HASH = "4eab7b03bce96be447292c931646322277de9a8cba0c6f33f249a09b2d2e8331033685bb59bde516ffb194fa010debdbd059417f00315f7958fa72626ad8055b"
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
