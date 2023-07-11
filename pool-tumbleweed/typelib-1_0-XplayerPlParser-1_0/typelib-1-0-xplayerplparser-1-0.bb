SUMMARY = "Simple GObject-based library to parse playlist formats -- Introspection Bindings"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too. \
 \
This package provides the GObject Introspection bindings for the \
xplayer-plparser library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "typelib-1_0-XplayerPlParser-1_0-1.0.2-2.13.aarch64.rpm"
RPM_HASH = "853418e92abdf304d249f775a763b7cc6585bb5bac988f93e31b54dd442c36d0b3bb34af2fd158e4a733288f217115bad8038202f0d232de8585428c49bff59b"

RPROVIDES:${PN} += "typelib-1-0-XplayerPlParser-1-0 \
typelib-XplayerPlParser"

RDEPENDS:${PN} += "libxplayer-plparser.so.18 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
xplayer-plparser"

inherit rpm
