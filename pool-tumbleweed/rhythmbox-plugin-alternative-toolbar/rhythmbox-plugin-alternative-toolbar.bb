SUMMARY = "Modern, minimal and music-focused interface for Rhythmbox"
DESCRIPTION = "Alternative Toolbar replaces the Rhythmbox large toolbar with a Client-Side \
Decorated or Compact toolbar which can be hidden."
LICENSE = "GPL-3.0-only"

PV = "0.20.3"

RPM_NAME = "rhythmbox-plugin-alternative-toolbar-0.20.3-1.1.aarch64.rpm"
RPM_HASH = "e0d40323b0542c7a06de5e013e98efd7638935e61c44b9947239531c871f83b51f7a151b914e931b9f7f503e62c6741951554012269c262255105ae8d05f145c"

RPROVIDES:${PN} += "rhythmbox-plugin-alternative-toolbar"

RDEPENDS:${PN} += "typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Peas \
typelib-PeasGtk \
typelib-RB"

inherit rpm
