SUMMARY = "GNOME Text Editor"
DESCRIPTION = "Text Editor is a simple text editor that focus on session \
management. It works hard to keep track of changes and state even \
if you quit the application. You can come back to your work even if \
you've never saved it to a file."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-text-editor-44.0-1.2.aarch64.rpm"
RPM_HASH = "4d0294065b47e1cae9bc9d3829b1c2ddc77c656b0477f9e7d35212d985a62f1a07ea6e0b8b937d21b2e3592ed062580499eacfa6a97cce088e5b0807da169e08"

RPROVIDES:${PN} += "application() \
application(org.gnome.TextEditor.desktop) \
gnome-text-editor \
gnome-text-editor(aarch-64) \
metainfo() \
metainfo(org.gnome.TextEditor.appdata.xml) \
mimehandler(application/x-zerosize) \
mimehandler(text/plain)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libeditorconfig.so.0()(64bit) \
libenchant-2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgtksourceview-5.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
