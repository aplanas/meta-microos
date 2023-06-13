SUMMARY = "GTK3 Spell Checker Interface Library -- Introspection bindings"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "typelib-1_0-GtkSpell-3_0-3.0.10-3.8.aarch64.rpm"
RPM_HASH = "e84024075f03b4c3a47879367f0ae4724c1b9da8b04c77e2e9bb4e6c3edea2f66afa5ebe1deb3c4c93fb30206ef7e21b549c3e1f27d476ce258e09d128dfddcc"

RPROVIDES:${PN} += "typelib(GtkSpell) \
typelib-1_0-GtkSpell-3_0 \
typelib-1_0-GtkSpell-3_0(aarch-64)"

RDEPENDS:${PN} += "libgtkspell3-3.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
