SUMMARY = "Graphical editor for the dconf key-based configuration system"
DESCRIPTION = "dconf is a low-level configuration system. Its main purpose is to \
provide a backend to GSettings on platforms that don't already \
have configuration storage systems. \
 \
This package provides a graphical editor for the dconf database."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "dconf-editor-43.0-1.4.aarch64.rpm"
RPM_HASH = "740fbc3479bac1e3bffc9176c1fd7eddd071081005d4dbb78eca130f3869b3baa0039c85df806d91bbd7379fc39e7f9e483ac5e40c335029791959aba9391833"

RPROVIDES:${PN} += "dconf-editor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdconf.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
