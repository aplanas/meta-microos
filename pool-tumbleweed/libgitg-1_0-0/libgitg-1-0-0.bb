SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-1_0-0-41-2.10.aarch64.rpm"
RPM_HASH = "a44defd62ee4d97a8b820d7af98ef5224f6694570a64aee0287752905b8c6241f8dfdbb7ef4c10a29ab0d9c2656916687057ef7b9b0a1cc00262250ada524b94"

RPROVIDES:${PN} += "libgitg-1-0-0 \
libgitg-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdazzle-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libxml2.so.2"

inherit rpm
