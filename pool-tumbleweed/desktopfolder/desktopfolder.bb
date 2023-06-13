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

RPROVIDES:${PN} += "application() \
application(com.github.spheras.desktopfolder.desktop) \
desktopfolder \
desktopfolder(aarch-64) \
metainfo() \
metainfo(com.github.spheras.desktopfolder.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
