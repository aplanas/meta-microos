SUMMARY = "A multi-pane detailed-list file manager"
DESCRIPTION = "4Pane is a multi-pane detailed-list file manager. \
It favors speed over visual effects. \
In addition to standard file manager features, it offers multiple undo and redo \
of most operations (including deletions), archive management including 'virtual \
browsing' inside archives, multiple renaming/duplication of files, a terminal \
emulator and user-defined tools."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "4pane-8.0-1.4.aarch64.rpm"
RPM_HASH = "06b5c1180f11e007e09bfd5418f5b07c4da9176c442ff382e389c079c0c45dadd78b6be52573f8e62380a4242bf0da6d3e8df3a62b76426e7684882a6dadea17"

RPROVIDES:${PN} += "4pane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0 \
libwx-gtk2u-xrc-suse.so.9.0.0"

inherit rpm
