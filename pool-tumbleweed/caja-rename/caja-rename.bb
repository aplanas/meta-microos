SUMMARY = "Batch renaming extension for Caja"
DESCRIPTION = "An extension for the Caja file browser allowing users to rename \
multiple files/folders in a single pass. \
 \
The application can change the case, insert, replace and delete \
strings, as well as enumerate the selection. Any changes are \
instantly visible in the preview list. The user interface strives \
to be as simple as possible, without confusing advanced \
operations."
LICENSE = "GPL-3.0-or-later"

PV = "22.10.31"

RPM_NAME = "caja-rename-22.10.31-1.3.noarch.rpm"
RPM_HASH = "4e2854d8aed12d06a0f22c90677107835966a36b81585afe2353cc27e7e24f33a3f6eeaff8fda03c71ffb62717a096385560abf3d409e38430241ab5b4d4a769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-rename \
python3.11dist-cajarename \
python3dist-cajarename"

RDEPENDS:${PN} += "/usr/bin/python3 \
caja \
python-abi \
python-caja \
python3-gobject \
python3-gobject-Gdk \
typelib-Caja \
typelib-GObject \
typelib-Gio \
typelib-Gtk"

inherit rpm
