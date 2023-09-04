SUMMARY = "Source code editing widget"
DESCRIPTION = "libgedit-gtksourceview is a library that extends GtkTextView, the standard GTK \
widget for multiline text editing. This library adds support for syntax \
highlighting, undo/redo, file loading and saving, search and replace, a \
completion system, printing, displaying line numbers, and other features typical \
of a source code editor."
LICENSE = "LGPL-2.1-or-later"

PV = "299.0.3"

RPM_NAME = "libgedit-gtksourceview-299.0.3-1.1.aarch64.rpm"
RPM_HASH = "27a4f8d47ea2327c2925ca304484c1cca35c345512bfb8b9381d31ca6a7796ac1ee496cec66cc141a9ad5578d7ef7527a66a7f1bbb738d68c3adeee5c5f66447"

RPROVIDES:${PN} += "libgedit-gtksourceview"

RDEPENDS:${PN} += ""

inherit rpm
