SUMMARY = "GTK2 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "libgtkspell0-2.0.16-23.9.aarch64.rpm"
RPM_HASH = "35342cb90610ecff749c633c56b5b78bdcd1306a4aa3719e1af0d239cecef83f55399a45be2323b2ac88b092deba5e6238694faec401ebe4bb82ea7ff92f34a0"

RPROVIDES:${PN} += "gtkspell \
libgtkspell.so.0 \
libgtkspell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
