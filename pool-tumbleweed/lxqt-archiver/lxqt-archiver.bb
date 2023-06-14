SUMMARY = "LXQt File Archiver"
DESCRIPTION = "LXQt file archiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "lxqt-archiver-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "ca115476014fe5fb10b7e7536999ba0ca535050f7ad1b8c359667d60dcee8c154c6852029f6d37723a30990422970b278aca86bf6a05f4bfe68ea6067e5c1c1e"

RPROVIDES:${PN} += "lxqt-archiver"

RDEPENDS:${PN} += "bsdtar \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfm-qt.so.13 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libstdc++.so.6"

inherit rpm
