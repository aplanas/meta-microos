SUMMARY = "Simple GObject-based library to parse playlist formats -- Introspection Bindings"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
xplayer-plparser library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "typelib-1_0-XplayerPlParser-1_0-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "407d185d11f995a9a3ac69ef7114017b69e4d360ea328f65de57314f7d2500e236aae6f52f996c3dfa236cdef74d287e93fe3bca7d6e3974b5f43f2df208fad6"

RPROVIDES:${PN} += "typelib-1-0-XplayerPlParser-1-0 \
typelib-XplayerPlParser"

RDEPENDS:${PN} += "libxplayer-plparser.so.18 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
xplayer-plparser"

inherit rpm
