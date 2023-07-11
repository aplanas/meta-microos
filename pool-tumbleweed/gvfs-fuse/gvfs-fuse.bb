SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. \
 \
This package contains FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-fuse-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "5aebb7152a25a67d2ea63acc0b7947b4b37938152ecd85777052ffcf6f1075eb0356d5557fc540847792e4246417a21b44c95ab8b7397d98493d1191e1656732"

RPROVIDES:${PN} += "gvfs-fuse"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse3 \
gvfs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so"

inherit rpm
