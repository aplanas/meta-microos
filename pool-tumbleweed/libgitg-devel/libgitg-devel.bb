SUMMARY = "Git repository viewer -- Development Files"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-devel-41-2.8.aarch64.rpm"
RPM_HASH = "3ba542df0a2d546e58de69292aa0203f3f95cba699de9e242cda8e11b1878e3a0a80ab2693a14cdc26177bc685453dc2097d99dd7f3e9775c93b71ec2d0ac001"

RPROVIDES:${PN} += "libgitg-devel \
libgitg-devel(aarch-64) \
pkgconfig(libgitg-1.0) \
pkgconfig(libgitg-ext-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgitg-1_0-0 \
libgitg-ext-1_0-0 \
pkgconfig(gee-0.8) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libdazzle-1.0) \
pkgconfig(libgit2-glib-1.0) \
pkgconfig(libgitg-1.0) \
python3-GitgExt \
typelib-1_0-Gitg-1_0 \
typelib-1_0-GitgExt-1_0"

inherit rpm
