SUMMARY = "Quicknote applet"
DESCRIPTION = "Quicknote is an applet to provide the easiest possible way to make small notes. \
Just click the icon and write down your notes. \
QuickNote autosaves the text while writing, and comes with a ten- level undo/redo function."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-quicknote-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "422b400a321283845e5ea4a9ac34e9313073f765fec3e1d2ba96722b1561cf5d8ede68408b8c496b8ad72d76068ccb3ead13478fdf905911b29be60490242d88"

RPROVIDES:${PN} += "budgie-quicknote-applet \
libquicknoteapplet.so"

RDEPENDS:${PN} += "budgie-extras-lang \
ld-linux-aarch64.so.1 \
libbudgie-plugin.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
