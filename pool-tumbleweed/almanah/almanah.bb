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

RPROVIDES:${PN} += "almanah"

RDEPENDS:${PN} += "evolution-data-server \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcryptui.so.0 \
libecal-2.0.so.2 \
libedataserver-1.2.so.27 \
libgcr-base-3.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libgtkspell3-3.so.0 \
libical-glib.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsqlite3.so.0"

inherit rpm
