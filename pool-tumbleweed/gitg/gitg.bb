SUMMARY = "Git repository viewer"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "gitg-41-2.8.aarch64.rpm"
RPM_HASH = "f345d54cd78eb7b790685ca0e8659f892ce9246fe3b3c1aa18a612d9a534aca832c249209e632c7f9fdc6d26e9931acfb085cbbe745da3bfdb24752500db1990"

RPROVIDES:${PN} += "application() \
application(org.gnome.gitg.desktop) \
gitg \
gitg(aarch-64) \
libdiff.so()(64bit) \
libfiles.so()(64bit) \
metainfo() \
metainfo(org.gnome.gitg.appdata.xml) \
mimehandler(x-scheme-handler/gitg)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libgit2-glib-1.0.so.0()(64bit) \
libgitg-1.0.so.0()(64bit) \
libgitg-ext-1.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
typelib-1_0-Peas-1_0 \
typelib-1_0-PeasGtk-1_0"

inherit rpm
