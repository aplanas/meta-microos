SUMMARY = "A Gtk based drop down terminal for Linux and Unix"
DESCRIPTION = "Tilda is a terminal emulator and can be compared with other popular terminal \
emulators such as gnome-terminal (Gnome), Konsole (KDE), xterm and many others. \
The specialities of Tilda are that it does not behave like a normal window \
but instead it can be pulled up and down from the top of the screen with \
a special hotkey. Additionally Tilda is highly configurable. \
It is possible to configure the hotkeys for keybindings, \
change the appearance and many options that affect the behavior of Tilda. \
The screen shots below show some of the options that Tilda provides."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "tilda-1.5.4-1.12.aarch64.rpm"
RPM_HASH = "a776f44dcbae8790f93f0e8b2bf1fae2208a3795a3e6c7b6091a11b94a8f0968cc4fa52b4f14a9bb9b0ac8710ccaa9113abbc51eb63c34c74a1a18fc401330c4"

RPROVIDES:${PN} += "tilda"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libconfuse.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
