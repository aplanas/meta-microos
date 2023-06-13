SUMMARY = "Development files for the GNOME Virtual file system"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. \
 \
This subpackage contains libraries and header files for developing \
gvfs plugins."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-devel-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "d6a2c403bb8d47e002159aab0b0aeda20235d5fddd3c0e0a06791d18d1781bc68212418b28fe747490ca201480b78ef2ad2de00d5b394e2f59dcd65fc398c3a2"

RPROVIDES:${PN} += "gvfs-devel \
gvfs-devel(aarch-64)"

RDEPENDS:${PN} += "gvfs"

inherit rpm
