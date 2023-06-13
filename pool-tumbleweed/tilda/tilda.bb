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

RPROVIDES:${PN} += "application() \
application(tilda.desktop) \
metainfo() \
metainfo(tilda.appdata.xml) \
tilda \
tilda(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libconfuse.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libvte-2.91.so.0()(64bit)"

inherit rpm
