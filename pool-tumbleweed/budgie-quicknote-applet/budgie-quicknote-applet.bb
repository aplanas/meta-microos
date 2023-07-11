SUMMARY = "Quicknote applet"
DESCRIPTION = "Quicknote is an applet to provide the easiest possible way to make small notes. \
Just click the icon and write down your notes. \
QuickNote autosaves the text while writing, and comes with a ten- level undo/redo function."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-quicknote-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "f94be66fcd7e5d902094023529e87666bff09f16ca5c5d02eb078ff92342c696ccca400e6b0d6c6db5f390b6208b3750e33543856ca4ceea43553c974fd2a492"

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
