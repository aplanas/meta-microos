SUMMARY = "GNOME Text Editor"
DESCRIPTION = "Text Editor is a simple text editor that focus on session \
management. It works hard to keep track of changes and state even \
if you quit the application. You can come back to your work even if \
you've never saved it to a file."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-text-editor-44.0-1.2.aarch64.rpm"
RPM_HASH = "4d0294065b47e1cae9bc9d3829b1c2ddc77c656b0477f9e7d35212d985a62f1a07ea6e0b8b937d21b2e3592ed062580499eacfa6a97cce088e5b0807da169e08"

RPROVIDES:${PN} += "gnome-text-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libeditorconfig.so.0 \
libenchant-2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libicuuc.so.73 \
libpango-1.0.so.0"

inherit rpm
