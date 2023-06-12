SUMMARY = "GTK+ application to allow you to keep a diary of your life"
DESCRIPTION = "Almanah Diary is a small application to ease the management of an encrypted \
personal diary. It's got good editing abilities, including text formatting \
and printing. Evolution tasks and appointments will be listed to ease the \
creation of diary entries related to them. At the same time, you can create \
diary entries using multiple events."
LICENSE = "GPL-3.0+"

PV = "0.12.3"

RPM_NAME = "almanah-0.12.3-2.9.aarch64.rpm"
RPM_HASH = "da387647f26dabe53c296656036edad0c030dd0b5d570205a33291cf0e5a7101f38280cd22196eb43d04eebd2b6a78269e88043e46719b0b43e82b37fcefc0da"

RPROVIDES:${PN} += "almanah \
almanah(aarch-64) \
application() \
application(almanah.desktop) \
metainfo() \
metainfo(almanah.appdata.xml)"
RDEPENDS:${PN} += "evolution-data-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcryptui.so.0()(64bit) \
libecal-2.0.so.2()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libgtkspell3-3.so.0()(64bit) \
libical-glib.so.3()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
