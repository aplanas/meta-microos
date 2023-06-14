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

RPM_NAME = "caja-rename-22.10.31-1.2.noarch.rpm"
RPM_HASH = "c0dbf9f906e8d143b1e6503edfbfb3e46d054129d594aa6af4b23951fd8436e7a7360929257f0132dd4543f396fb507d3fc5203e504c9e8a8ebdc7cfbaee5dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-rename \
python3.10dist-cajarename \
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
