SUMMARY = "Git repository viewer -- Library"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-1_0-0-41-2.8.aarch64.rpm"
RPM_HASH = "e909ef3209d9a94c2e926469ba1658d7c809f86d9329f8cbdecc4d364b378da8870b3957185b7d751e251530fdaa9996b9c16972fd1add1af1ef22ae150168bc"

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
