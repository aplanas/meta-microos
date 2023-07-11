SUMMARY = "Git repository viewer -- Development Files"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "libgitg-devel-41-2.10.aarch64.rpm"
RPM_HASH = "14b03a8a2a8ed2d9a0c788f9a169591704b80bfa1079c14b82f051226f3771aa6ef7d932377619dd0b81a078cfe0f7141df76a08267ede467bf938c980d46bbb"

RPROVIDES:${PN} += "libgitg-devel \
pkgconfig-libgitg-1.0 \
pkgconfig-libgitg-ext-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgitg-1-0-0 \
libgitg-ext-1-0-0 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libdazzle-1.0 \
pkgconfig-libgit2-glib-1.0 \
pkgconfig-libgitg-1.0 \
python3-GitgExt \
typelib-1-0-Gitg-1-0 \
typelib-1-0-GitgExt-1-0"

inherit rpm
