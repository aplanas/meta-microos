SUMMARY = "A gettext po file editor for the GNOME desktop"
DESCRIPTION = "Gtranslator is an enhanced gettext PO file editor for the GNOME desktop environment. It handles all forms of gettext PO files and features many comfortable everyday usage features like find and replace functions, auto translation, and translation learning."
LICENSE = "GPL-3.0-or-later"

PV = "42.0"

RPM_NAME = "gtranslator-42.0-1.6.aarch64.rpm"
RPM_HASH = "58b5f10c4840f896cb7eab697e3000c77fa44a447b575bad28020ab9618b849344f0ad7c79095fc1e7af9dd72cd0287acf673f067e6c6da50577994a9e00d62d"

RPROVIDES:${PN} += "application() \
application(org.gnome.Gtranslator.desktop) \
gtranslator \
gtranslator(aarch-64) \
metainfo() \
metainfo(org.gnome.Gtranslator.appdata.xml) \
mimehandler(text/x-gettext-translation) \
mimehandler(text/x-gettext-translation-template)"
RDEPENDS:${PN} += "gsettings-desktop-schemas \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-sqlite \
libgdk-3.so.0()(64bit) \
libgettextpo.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
