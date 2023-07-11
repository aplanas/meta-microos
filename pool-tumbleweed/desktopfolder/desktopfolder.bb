SUMMARY = "Tool for organizing the desktop with panels, notes and photos"
DESCRIPTION = "A program with which the desktop can be organized with panels that hold things. \
  * Access files, folders and apps from your desktop \
  * Drop files, folders, links and .desktop launchers inside panels \
  * Resize, position and color panels \
  * Display photos and keep notes on your desktop \
  * Reveal the desktop with ⌘-D (Command-D)"
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "desktopfolder-1.1.3-3.8.aarch64.rpm"
RPM_HASH = "63034fd1ea8dee841ec0d48776b03f31ea5063e34558b8ce844f28e486428059aa3549a69e19bedc7b58c352a187ce62c0593b0e3fb3f214d1cc39a5012e54f9"

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
