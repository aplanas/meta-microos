SUMMARY = "Development files for the GNOME Virtual file system"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. \
 \
This subpackage contains libraries and header files for developing \
gvfs plugins."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-devel-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "67b27d6420d46cd1a9960336e00fc62534841f0a6e98ac52df0ab1d1eb60281b9c731302383a66fe944f612d0ade6324fb72b0f049f80f505213df9cf9b2f026"

RPROVIDES:${PN} += "gvfs-devel"

RDEPENDS:${PN} += "gvfs"

inherit rpm
