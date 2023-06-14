SUMMARY = "GTK Tool for Viewing EXIF Information"
DESCRIPTION = "This tool contains simple GTK interface for viewing EXIF information \
within JPEG images created by some digital cameras."
LICENSE = "LGPL-2.1+"

PV = "0.5"

RPM_NAME = "gexif-0.5-204.30.aarch64.rpm"
RPM_HASH = "f283c5b8c6c788e51a90408eb24924d76007f13c329484e00598ac01399c555a2af70c178d46963a13ec64ffda18cdcfe5c1261b8fb5f8572acd9f42cead40f5"

RPROVIDES:${PN} += "gexif"

RDEPENDS:${PN} += "gexif-lang \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexif-gtk.so.5 \
libexif.so.12 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
