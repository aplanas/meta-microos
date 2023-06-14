SUMMARY = "A gettext po file editor for the GNOME desktop"
DESCRIPTION = "Gtranslator is an enhanced gettext PO file editor for the GNOME desktop environment. It handles all forms of gettext PO files and features many comfortable everyday usage features like find and replace functions, auto translation, and translation learning."
LICENSE = "GPL-3.0-or-later"

PV = "42.0"

RPM_NAME = "gtranslator-42.0-1.6.aarch64.rpm"
RPM_HASH = "58b5f10c4840f896cb7eab697e3000c77fa44a447b575bad28020ab9618b849344f0ad7c79095fc1e7af9dd72cd0287acf673f067e6c6da50577994a9e00d62d"

RPROVIDES:${PN} += "gtranslator"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
iso-codes \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-sqlite \
libgdk-3.so.0 \
libgettextpo.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
