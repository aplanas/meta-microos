SUMMARY = "Tool for organizing the desktop with panels, notes and photos"
DESCRIPTION = "A program with which the desktop can be organized with panels that hold things. \
  * Access files, folders and apps from your desktop \
  * Drop files, folders, links and .desktop launchers inside panels \
  * Resize, position and color panels \
  * Display photos and keep notes on your desktop \
  * Reveal the desktop with ⌘-D (Command-D)"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "desktopfolder-1.1.3-3.7.aarch64.rpm"
RPM_HASH = "c9d6e48a908660792a675df2181b4461f51c744bfffd7a246cd7f1b0cb24142756654fd22c4c1c5a246c817da6d1f8c77c57c0257010ff6e5a409cfb3cd8ddb5"

RPROVIDES:${PN} += "desktopfolder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libwnck-3.so.0"

inherit rpm
