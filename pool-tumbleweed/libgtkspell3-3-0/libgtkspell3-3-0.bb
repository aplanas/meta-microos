SUMMARY = "GTK3 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "libgtkspell3-3-0-3.0.10-3.9.aarch64.rpm"
RPM_HASH = "2a3aed1b58e996042a41c1e222cb12d74f320ed4e7682783d9f83596f2b86a6df5b73d7b4291147a9074ab9f04b17a6dfd7c4b2f4fa9c92f2ddda2a81127f139"

RPROVIDES:${PN} += "gtkspell3 \
libgtkspell3-3-0 \
libgtkspell3-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
