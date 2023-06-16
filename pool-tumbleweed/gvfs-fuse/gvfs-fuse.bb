SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. \
 \
This package contains FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-fuse-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "a94f7034f8c1a8ad917e64f52910f6b1a3ffda11d0169f9cf95cf1fe8b00e9d129076d1b30d574add0b01bfcdd633f64d966339ea01a7992cef4930b6a293c77"

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
