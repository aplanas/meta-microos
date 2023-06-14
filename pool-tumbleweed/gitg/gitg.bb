SUMMARY = "Git repository viewer"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "gitg-41-2.8.aarch64.rpm"
RPM_HASH = "f345d54cd78eb7b790685ca0e8659f892ce9246fe3b3c1aa18a612d9a534aca832c249209e632c7f9fdc6d26e9931acfb085cbbe745da3bfdb24752500db1990"

RPROVIDES:${PN} += "gitg \
libdiff.so \
libfiles.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libgit2-glib-1.0.so.0 \
libgitg-1.0.so.0 \
libgitg-ext-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
typelib-1-0-Peas-1-0 \
typelib-1-0-PeasGtk-1-0"

inherit rpm
