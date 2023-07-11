SUMMARY = "GNOME Text Editor"
DESCRIPTION = "Text Editor is a simple text editor that focus on session \
management. It works hard to keep track of changes and state even \
if you quit the application. You can come back to your work even if \
you've never saved it to a file."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-text-editor-44.0-1.3.aarch64.rpm"
RPM_HASH = "e59b7e37996b8bc63d1052ee7d1bb19d9e733bd86f054620f2bda6ca6d557c563b3c4befe79c910d69fcbf12e522ec2cbbe8d3be5feff1cfb33ae04f3252ba58"

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
