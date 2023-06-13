SUMMARY = "Full featured font file preview application for GTK+ Desktop Environments"
DESCRIPTION = "This package contains the font-viewer component of font-manager."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-viewer-0.8.8-2.3.aarch64.rpm"
RPM_HASH = "d15831e24684c208a4666048bd4163aa225785320ef10a72f056176467bfb3e99b176728494c1c585d89d34380b32fb846a3c5fbb32e8d4a074abd71199eaa16"

RPROVIDES:${PN} += "application() \
application(org.gnome.FontViewer.desktop) \
font-viewer \
font-viewer(aarch-64) \
metainfo() \
metainfo(org.gnome.FontViewer.appdata.xml) \
mimehandler(application/x-font-otf) \
mimehandler(application/x-font-ttf) \
mimehandler(font/otf) \
mimehandler(font/ttc) \
mimehandler(font/ttf)"

RDEPENDS:${PN} += "font-manager-common \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontmanager.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
