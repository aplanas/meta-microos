SUMMARY = "Graphical text editor and Notepad clone"
DESCRIPTION = "Leafpad is a GTK+ based text editor. The user interface is similar to \
'notepad'. It uses a Single Document Interface to set out windows to view at a \
time, and purposely uses no toolbar. Character encoding is autodetected."
LICENSE = "GPL-2.0"

PV = "0.8.18.1"

RPM_NAME = "leafpad-0.8.18.1-15.22.aarch64.rpm"
RPM_HASH = "c361fbebc77936e297d26901ade5d742feeff8b22ae2a47bb2a82b848372fd5fe4aac274b6519d6a7c18fe9c5d6567eb3cc97735b971bd26d88c67f5f2be03c1"

RPROVIDES:${PN} += "application() \
application(leafpad.desktop) \
leafpad \
leafpad(aarch-64) \
mimehandler(text/plain)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit)"

inherit rpm
